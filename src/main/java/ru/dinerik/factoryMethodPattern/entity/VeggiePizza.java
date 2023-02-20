package ru.dinerik.factoryMethodPattern.entity;

import ru.dinerik.factoryMethodPattern.entity.Pizza;

public class VeggiePizza extends Pizza {
    @Override
    public void addIngredients() {
        System.out.println("Preparing ingredients for veggie pizza.");
    }
}
