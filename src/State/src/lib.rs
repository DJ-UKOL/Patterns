// структура предоставляет опубликованную публикацию
pub struct Post {
    content: String,
}

pub struct DraftPost {
    content: String,
}


impl Post {
    
    pub fn new() -> DraftPost {
        DraftPost {
            content: "".to_string(),
        }
    }

    pub fn content(&self) -> &str {
        &self.content
    }

}

impl DraftPost {
    pub fn add_text(&mut self, text: &str) {
        self.content.push_str(text);
    }
}