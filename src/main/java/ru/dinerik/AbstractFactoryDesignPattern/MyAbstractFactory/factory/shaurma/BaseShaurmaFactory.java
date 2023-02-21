package ru.dinerik.AbstractFactoryDesignPattern.MyAbstractFactory.factory.shaurma;

import ru.dinerik.AbstractFactoryDesignPattern.MyAbstractFactory.entity.Shaurma;
import ru.dinerik.AbstractFactoryDesignPattern.MyAbstractFactory.entity.ShaurmaType;

public interface BaseShaurmaFactory {
    Shaurma createShaurma(ShaurmaType type);
}
