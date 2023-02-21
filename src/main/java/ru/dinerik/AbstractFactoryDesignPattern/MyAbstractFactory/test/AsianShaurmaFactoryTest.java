package ru.dinerik.AbstractFactoryDesignPattern.MyAbstractFactory.test;

import org.junit.jupiter.api.Test;
import ru.dinerik.AbstractFactoryDesignPattern.MyAbstractFactory.entity.Shaurma;
import ru.dinerik.AbstractFactoryDesignPattern.MyAbstractFactory.entity.ShaurmaType;
import ru.dinerik.AbstractFactoryDesignPattern.MyAbstractFactory.factory.shaurma.AsianShaurmaFactory;
import ru.dinerik.AbstractFactoryDesignPattern.MyAbstractFactory.factory.shaurma.BaseShaurmaFactory;

public class AsianShaurmaFactoryTest {

    @Test
    public void testCreateShaurma() {
        BaseShaurmaFactory shaurmaFactory = new AsianShaurmaFactory();
        Shaurma cheese = shaurmaFactory.createShaurma(ShaurmaType.ChesseShaurma);
        Shaurma classical = shaurmaFactory.createShaurma(ShaurmaType.ClassicShaurma);
        Shaurma vegetarian = shaurmaFactory.createShaurma(ShaurmaType.VegetarianShaurma);
    }
}
