package ru.dinerik.AbstractFactoryDesignPattern.factory.topping;

import ru.dinerik.AbstractFactoryDesignPattern.entity.cheese.Cheese;
import ru.dinerik.AbstractFactoryDesignPattern.entity.cheese.MozzarellaCheese;
import ru.dinerik.AbstractFactoryDesignPattern.entity.sauce.Sauce;
import ru.dinerik.AbstractFactoryDesignPattern.entity.sauce.TomatoSauce;

public class SicilianToppingFactory extends BaseToppingFactory {

    @Override
    public Cheese createCheese() {
        return new MozzarellaCheese();
    }

    @Override
    public Sauce createSauce() {
        return new TomatoSauce();
    }
}
