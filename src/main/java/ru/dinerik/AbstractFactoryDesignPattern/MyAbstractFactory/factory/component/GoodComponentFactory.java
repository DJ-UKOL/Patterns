package ru.dinerik.AbstractFactoryDesignPattern.MyAbstractFactory.factory.component;

import ru.dinerik.AbstractFactoryDesignPattern.MyAbstractFactory.entity.cheese.Cheese;
import ru.dinerik.AbstractFactoryDesignPattern.MyAbstractFactory.entity.cheese.ParmesanCheese;
import ru.dinerik.AbstractFactoryDesignPattern.MyAbstractFactory.entity.meat.BeefMeat;
import ru.dinerik.AbstractFactoryDesignPattern.MyAbstractFactory.entity.meat.Meat;
import ru.dinerik.AbstractFactoryDesignPattern.MyAbstractFactory.entity.pita.ClassicPita;
import ru.dinerik.AbstractFactoryDesignPattern.MyAbstractFactory.entity.pita.Pita;
import ru.dinerik.AbstractFactoryDesignPattern.MyAbstractFactory.entity.salad.ClassicSalad;
import ru.dinerik.AbstractFactoryDesignPattern.MyAbstractFactory.entity.salad.Salad;

public class GoodComponentFactory implements BaseComponentFactory{

    @Override
    public Meat createMeat() {
        return new BeefMeat();
    }

    @Override
    public Pita createPita() {
        return new ClassicPita();
    }

    @Override
    public Salad createSalad() {
        return new ClassicSalad();
    }

    @Override
    public Cheese createCheese() {
        return new ParmesanCheese();
    }
}
