package ru.dinerik.AbstractFactoryDesignPattern.factory.topping;

import ru.dinerik.AbstractFactoryDesignPattern.entity.cheese.Cheese;
import ru.dinerik.AbstractFactoryDesignPattern.entity.sauce.Sauce;

public abstract class BaseToppingFactory {
    public abstract Cheese createCheese();
    public abstract Sauce createSauce();
}
