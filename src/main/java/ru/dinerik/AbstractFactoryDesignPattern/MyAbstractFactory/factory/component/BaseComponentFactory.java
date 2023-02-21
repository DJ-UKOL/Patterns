package ru.dinerik.AbstractFactoryDesignPattern.MyAbstractFactory.factory.component;

import ru.dinerik.AbstractFactoryDesignPattern.MyAbstractFactory.entity.cheese.Cheese;
import ru.dinerik.AbstractFactoryDesignPattern.MyAbstractFactory.entity.meat.Meat;
import ru.dinerik.AbstractFactoryDesignPattern.MyAbstractFactory.entity.pita.Pita;
import ru.dinerik.AbstractFactoryDesignPattern.MyAbstractFactory.entity.salad.Salad;

public interface BaseComponentFactory {
    Meat createMeat();
    Pita createPita();
    Salad createSalad();

    Cheese createCheese();
}
