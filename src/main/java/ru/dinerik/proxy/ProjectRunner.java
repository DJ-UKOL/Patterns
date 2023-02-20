package ru.dinerik.proxy;

// Клиент
public class ProjectRunner {
    public static void main(String[] args) {
        Project project = new ProxyProject("https://www.github.com/dj-ukol/taco-cloud");
        project.run();
    }
}