package ru.dinerik.factoryMethodPattern.MyFactoryMethod.test;

import org.junit.jupiter.api.Test;
import ru.dinerik.factoryMethodPattern.MyFactoryMethod.factory.FileFactory;
import ru.dinerik.factoryMethodPattern.MyFactoryMethod.factory.FileFactoryImpl;

public class TestFileFactory {

    @Test
    public void testSaveFile() {
        FileFactory factory = new FileFactoryImpl();
        factory.saveFile("txt");
        factory.saveFile("pdf");
        factory.saveFile("word");
    }
}
