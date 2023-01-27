package ru.dinerik.decorator;

// Декоратор
public class DeveloperDecorator implements Developer {

    Developer developer;            // Экземпляр разработчика

    // Конструктор
    public DeveloperDecorator(Developer developer) {
        this.developer = developer;
    }

    @Override
    public String makeJob() {
        return developer.makeJob();
    }
}
