use State::Post;

fn main() {
    let mut post = Post::new();                         // создаем новый черновик записи в блоге

    post.add_text("I ate a salad for lunch today");     // добавляем текст в черновик

    let post = post.request_review();

    let mut post = post.reject();

    post.add_text("I ate my salad for my lunch today");

    let post = post.request_review();

    let post = post.approve().approve();    // необходимо двойное подтверждение

    assert_eq!("I ate my salad for my lunch today", post.content());


}
