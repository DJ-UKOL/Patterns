use State::Post;

fn main() {
    let mut post = Post::new();                         // создаем новый черновик записи в блоге

    post.add_text("I ate a salad for lunch today");     // добавляем текст в черновик
    assert_eq!("", post.content());

    post.request_review();      // запрос на проверку записи
    assert_eq!("", post.content());

    post.add_text("I added this text!!!");

    //post.reject();      // отклонить запись
    assert_eq!("", post.content());

    post.approve();     // утверждение
    post.add_text("I added this text!!!");
    post.approve();
    post.add_text("I added this text!!!");
    assert_eq!("I ate a salad for lunch today", post.content());
}
