package ru.dinerik.factoryMethodPattern.entity;

import ru.dinerik.factoryMethodPattern.entity.Pizza;

public class PepperoniPizza extends Pizza {
    @Override
    public void addIngredients() {
        System.out.println("Preparing ingredients for pepperoni pizza.");
    }
}
