package ru.dinerik.factoryMethodPattern.MyFactoryMethod.entity;

public class PdfFile implements File {

    public PdfFile() {
        saveFile();
    }

    @Override
    public void saveFile() {
        System.out.println("Save file as PDF format");
    }
}
