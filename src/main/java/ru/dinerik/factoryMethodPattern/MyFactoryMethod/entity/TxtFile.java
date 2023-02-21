package ru.dinerik.factoryMethodPattern.MyFactoryMethod.entity;

public class TxtFile implements File {

    public TxtFile() {
        saveFile();
    }

    @Override
    public void saveFile() {
        System.out.println("Save file as TXT format");
    }
}
