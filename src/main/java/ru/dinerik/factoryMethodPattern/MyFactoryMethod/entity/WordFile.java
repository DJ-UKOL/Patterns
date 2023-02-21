package ru.dinerik.factoryMethodPattern.MyFactoryMethod.entity;

public class WordFile implements File {

    public WordFile() {
        saveFile();
    }

    @Override
    public void saveFile() {
        System.out.println("Save file as WORD format");
    }
}
