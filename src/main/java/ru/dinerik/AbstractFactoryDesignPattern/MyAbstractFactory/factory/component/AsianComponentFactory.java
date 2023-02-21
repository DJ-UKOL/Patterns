package ru.dinerik.AbstractFactoryDesignPattern.MyAbstractFactory.factory.component;

import ru.dinerik.AbstractFactoryDesignPattern.MyAbstractFactory.entity.cheese.Cheese;
import ru.dinerik.AbstractFactoryDesignPattern.MyAbstractFactory.entity.cheese.MozzarellaCheese;
import ru.dinerik.AbstractFactoryDesignPattern.MyAbstractFactory.entity.meat.ChickenMeat;
import ru.dinerik.AbstractFactoryDesignPattern.MyAbstractFactory.entity.meat.Meat;
import ru.dinerik.AbstractFactoryDesignPattern.MyAbstractFactory.entity.pita.ClassicPita;
import ru.dinerik.AbstractFactoryDesignPattern.MyAbstractFactory.entity.pita.Pita;
import ru.dinerik.AbstractFactoryDesignPattern.MyAbstractFactory.entity.salad.Salad;
import ru.dinerik.AbstractFactoryDesignPattern.MyAbstractFactory.entity.salad.SpicySalad;

public class AsianComponentFactory implements BaseComponentFactory {
    @Override
    public Meat createMeat() {
        return new ChickenMeat();
    }

    @Override
    public Pita createPita() {
        return new ClassicPita();
    }

    @Override
    public Salad createSalad() {
        return new SpicySalad();
    }

    @Override
    public Cheese createCheese() {
        return new MozzarellaCheese();
    }


}
