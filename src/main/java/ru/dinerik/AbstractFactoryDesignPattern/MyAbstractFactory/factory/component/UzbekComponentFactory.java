package ru.dinerik.AbstractFactoryDesignPattern.MyAbstractFactory.factory.component;

import ru.dinerik.AbstractFactoryDesignPattern.MyAbstractFactory.entity.cheese.Cheese;
import ru.dinerik.AbstractFactoryDesignPattern.MyAbstractFactory.entity.cheese.GoatCheese;
import ru.dinerik.AbstractFactoryDesignPattern.MyAbstractFactory.entity.meat.LambMeat;
import ru.dinerik.AbstractFactoryDesignPattern.MyAbstractFactory.entity.meat.Meat;
import ru.dinerik.AbstractFactoryDesignPattern.MyAbstractFactory.entity.pita.ClassicPita;
import ru.dinerik.AbstractFactoryDesignPattern.MyAbstractFactory.entity.pita.Pita;
import ru.dinerik.AbstractFactoryDesignPattern.MyAbstractFactory.entity.salad.ClassicSalad;
import ru.dinerik.AbstractFactoryDesignPattern.MyAbstractFactory.entity.salad.Salad;

public class UzbekComponentFactory implements BaseComponentFactory {
    @Override
    public Meat createMeat() {
        return new LambMeat();
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
        return new GoatCheese();
    }
}
