// структура предоставляет опубликованную публикацию
pub struct Post {
    content: String,
}

// структура предоставляет черновик
pub struct DraftPost {
    content: String,
}

impl Post {
    pub fn new() -> DraftPost {     // при создании экземпляра Post, сначала создаем пустой DraftPost (черновик)
        DraftPost {
            content: "".to_string(),
        }
    }

    // запросить содержимое публикации
    pub fn content(&self) -> &str {
        &self.content
    }

}


impl DraftPost {

    // Добавить текст в черновик
    pub fn add_text(&mut self, text: &str) {    // обязательно мутабельный self, т.к. мы изменяем content
        self.content = text.to_string();
    }

    // запрашиваем проверку
    pub fn request_review(self) -> PendingReviewPost {  // забирает во владение self и поглащает экземпляр DraftPost
        PendingReviewPost {     // возвращает экземпляр PendingReviewPost
            content: self.content,  // с содержимым content
        }
    }
}

// структура ожидание проверки публикации
pub struct PendingReviewPost {
    content: String,
}

impl PendingReviewPost {
    // одобрить проверку публикации
    pub fn approve(self) -> DoubleApprove {  // забирает во владение self и поглащает экземпляр PendingReviewPost
        DoubleApprove {                      // возвращаем экземпляр Post
                content: self.content,  // с содержимым content
            }
    }

    // отклонить
    pub fn reject(self) -> DraftPost {  // забирает во владение self и поглащает экземпляр PendingReviewPost
        DraftPost {                      // возвращаем экземпляр DraftPost
            content: self.content,      // с содержимым content
        }
    }
}

pub struct DoubleApprove {
    content: String,
}

impl DoubleApprove {
    pub fn approve(self) -> Post {  // забирает во владение self и поглащает экземпляр PendingReviewPost
        Post {                      // возвращаем экземпляр Post
            content: self.content,  // с содержимым content
        }
    }
}