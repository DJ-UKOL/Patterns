package ru.dinerik.AbstractFactoryDesignPattern.MyAbstractFactory.entity;

import ru.dinerik.AbstractFactoryDesignPattern.MyAbstractFactory.factory.component.BaseComponentFactory;

public class ClassicShaurma implements Shaurma {
    BaseComponentFactory baseComponentFactory;

    public ClassicShaurma(BaseComponentFactory baseComponentFactory) {
        this.baseComponentFactory = baseComponentFactory;
    }

    @Override
    public void addIngredients() {
        System.out.println("Preparing ingredients for classical shaurma.");
        baseComponentFactory.createPita();
        baseComponentFactory.createMeat();
        baseComponentFactory.createSalad();
    }
    @Override
    public String makeShaurma() {
        return "Shaurma will be make in 7 minutes";
    }
}
