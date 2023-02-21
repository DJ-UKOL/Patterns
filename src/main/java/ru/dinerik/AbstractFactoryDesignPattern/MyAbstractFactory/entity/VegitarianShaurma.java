package ru.dinerik.AbstractFactoryDesignPattern.MyAbstractFactory.entity;

import ru.dinerik.AbstractFactoryDesignPattern.MyAbstractFactory.factory.component.BaseComponentFactory;

public class VegitarianShaurma implements Shaurma {
    BaseComponentFactory baseComponentFactory;

    public VegitarianShaurma(BaseComponentFactory baseComponentFactory) {
        this.baseComponentFactory = baseComponentFactory;
    }

    @Override
    public void addIngredients() {
        System.out.println("Preparing ingredients for vegetarian shaurma.");
        baseComponentFactory.createPita();
        baseComponentFactory.createSalad();
    }
    @Override
    public String makeShaurma() {
        return "Shaurma will be make in 5 minutes";
    }
}
