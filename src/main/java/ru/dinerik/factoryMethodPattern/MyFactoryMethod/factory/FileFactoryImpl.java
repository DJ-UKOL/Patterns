package ru.dinerik.factoryMethodPattern.MyFactoryMethod.factory;

import ru.dinerik.factoryMethodPattern.MyFactoryMethod.entity.PdfFile;
import ru.dinerik.factoryMethodPattern.MyFactoryMethod.entity.TxtFile;
import ru.dinerik.factoryMethodPattern.MyFactoryMethod.entity.WordFile;

public class FileFactoryImpl implements FileFactory{
    @Override
    public void saveFile(String type) {
        switch (type.toLowerCase()) {
            case "pdf" -> new PdfFile();
            case "word" -> new WordFile();
            case "txt" -> new TxtFile();
            default -> throw new IllegalArgumentException("No such format.");
        }
    }
}
