use State::Post;

fn main() {
    let mut post = Post::new();                         // создаем новый черновик записи в блоге

    post.add_text("I ate a salad for lunch today");     // добавляем текст в черновик
    assert_eq!("", post.content());

}
