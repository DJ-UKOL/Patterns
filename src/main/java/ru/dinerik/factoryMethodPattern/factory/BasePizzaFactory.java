package ru.dinerik.factoryMethodPattern.factory;

import ru.dinerik.factoryMethodPattern.entity.Pizza;

public abstract class BasePizzaFactory {
    public abstract Pizza createPizza(String type);
}
