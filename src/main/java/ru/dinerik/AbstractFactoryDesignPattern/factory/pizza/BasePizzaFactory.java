package ru.dinerik.AbstractFactoryDesignPattern.factory.pizza;

import ru.dinerik.AbstractFactoryDesignPattern.entity.Pizza;

public abstract class BasePizzaFactory {
    public abstract Pizza createPizza(String type);
}
