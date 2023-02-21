package ru.dinerik.AbstractFactoryDesignPattern.MyAbstractFactory.factory.shaurma;

import ru.dinerik.AbstractFactoryDesignPattern.MyAbstractFactory.entity.*;
import ru.dinerik.AbstractFactoryDesignPattern.MyAbstractFactory.factory.component.BaseComponentFactory;
import ru.dinerik.AbstractFactoryDesignPattern.MyAbstractFactory.factory.component.GoodComponentFactory;

public class GoodShaurmaFactory implements BaseShaurmaFactory{
    @Override
    public Shaurma createShaurma(ShaurmaType type) {
        Shaurma shaurma;
        BaseComponentFactory componentFactory = new GoodComponentFactory();

        switch (type) {
            case ChesseShaurma -> shaurma = new ChesseShaurma(componentFactory);
            case ClassicShaurma -> shaurma = new ClassicShaurma(componentFactory);
            case VegetarianShaurma -> shaurma = new VegitarianShaurma(componentFactory);

            default -> throw new IllegalArgumentException("No such shaurma.");
        }

        shaurma.addIngredients();
        shaurma.makeShaurma();
        return shaurma;
    }
}
