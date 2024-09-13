pub struct Post {
    state: Option<Box<dyn State>>,      // состояние (приватное поле, поэтому создание только через new)
    content: String,                    // содержиммое контента
}

// API инструмент для использования библиотекой (инкапсуляция)
impl Post {
    pub fn new() -> Post {
        Post {
            state: Some(Box::new(Draft {})),    // при создании нового экземпляра, создаем новый черновик
            content: String::new(),                // и пустое содержимое
        }
    }

    // добавляем текст к content
    /*pub fn add_text(&mut self, text: &str) {
        self.content.push_str(text);
    }
    */
    pub fn add_text(&mut self, text: &str) {
        if self.state.as_ref().unwrap().add_texts() {
            self.content.push_str(text);
        }
    }

    pub fn content(&self) -> &str {
       self.state.as_ref().unwrap().content(self)   // вызываем content из State и передаем экземпляр публикации
    }

    // запросить проверку
    pub fn request_review(&mut self) {  // это публичный метод
        if let Some(s) = self.state.take() {
            // take() забирает значение из state и устанавливает None
            self.state = Some(s.request_review())             // request_review() из State поглощает текущее состояние и возвращает новое состояние
        }
    }

    // отклонить
    pub fn reject(&mut self) {
        if let Some(s) = self.state.take() {
            self.state = Some(s.reject())
        }
    }

    // одобрить
    pub fn approve(&mut self) {
        if let Some(s) = self.state.take() {
            self.state = Some(s.approve())
        }
    }
}

trait State {  // типаж определяет поведение    (типа интерфейса)
    fn request_review(self: Box<Self>) -> Box<dyn State>;
    fn approve(self: Box<Self>) -> Box<dyn State>;
    fn content<'a>(&self, _post: &'a Post) -> &'a str {  // метод по умолчанию. Время жизни указано т.к. мы берем целый Post, а возвращаем часть Post
        ""
    }
    fn reject(self: Box<Self>) -> Box<dyn State>;

    fn add_texts(&self) -> bool {
        false
    }

}
struct Draft {     // объект состояния - черновик
}

impl State for Draft {
    fn request_review(self: Box<Self>) -> Box<dyn State> {
        Box::new(PendingReview { reviews: 1 })  // устанавливаем новое значение, независимо от того какое состояние было до этого
    }

    fn approve(self: Box<Self>) -> Box<dyn State> {
        self
    }

    fn reject(self: Box<Self>) -> Box<dyn State> {
        self
    }
/*    fn content<'a>(&self, post: &'a Post) -> &'a str {
        &post.content
    }*/

    fn add_texts(&self) -> bool {
        true
    }

}

struct PendingReview { // объект состояния - ожидание проверки
    reviews: i32,       // счетчик
}

impl PendingReview {
    fn add_review(&mut self) {  // добавить к счетчику 1, если был вызван метод approve
        self.reviews += 1;
    }

    fn ready_to_approve(&mut self) -> bool {
        if self.reviews >= 2 {
            return true;
        }
        self.add_review();
        return false;
    }
}

impl State for PendingReview {
    fn request_review(self: Box<Self>) -> Box<dyn State> {
        self    // возвращает саму себя, не делая ни каких преобразований
    }

    fn approve(mut self: Box<Self>) -> Box<dyn State> {
        if self.ready_to_approve() {
            Box::new(Published {})      // устанавливаем новое состояние
        } else {
            self
        }
    }

    fn reject(self: Box<Self>) -> Box<dyn State> {
        Box::new(Draft{})
    }

}

struct Published {}     // объект состояния опубликовано

impl State for Published {
    fn request_review(self: Box<Self>) -> Box<dyn State> {
        self
    }

    fn approve(self: Box<Self>) -> Box<dyn State> {
        self
    }

    fn content<'a>(&self, post: &'a Post) -> &'a str {
        &post.content
    }

    fn reject(self: Box<Self>) -> Box<dyn State> {
        self
    }
}