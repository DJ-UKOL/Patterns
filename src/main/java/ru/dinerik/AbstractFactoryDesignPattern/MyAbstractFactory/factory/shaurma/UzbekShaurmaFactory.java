package ru.dinerik.AbstractFactoryDesignPattern.MyAbstractFactory.factory.shaurma;

import ru.dinerik.AbstractFactoryDesignPattern.MyAbstractFactory.entity.*;
import ru.dinerik.AbstractFactoryDesignPattern.MyAbstractFactory.factory.component.BaseComponentFactory;
import ru.dinerik.AbstractFactoryDesignPattern.MyAbstractFactory.factory.component.UzbekComponentFactory;

public class UzbekShaurmaFactory implements BaseShaurmaFactory {
    @Override
    public Shaurma createShaurma(ShaurmaType type) {
        Shaurma shaurma;
        BaseComponentFactory componentFactory = new UzbekComponentFactory();

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
