package ru.dinerik.AbstractFactoryDesignPattern.MyAbstractFactory.entity;

import ru.dinerik.AbstractFactoryDesignPattern.MyAbstractFactory.factory.component.BaseComponentFactory;

public class ChesseShaurma implements Shaurma {

    BaseComponentFactory baseComponentFactory;

    public ChesseShaurma(BaseComponentFactory baseComponentFactory) {
        this.baseComponentFactory = baseComponentFactory;
    }

    @Override
    public void addIngredients() {
        System.out.println("Preparing ingredients for cheese shaurma.");
        baseComponentFactory.createPita();
        baseComponentFactory.createMeat();
        baseComponentFactory.createSalad();
        baseComponentFactory.createCheese();
    }
    @Override
    public String makeShaurma() {
        return "Shaurma will be make in 9 minutes";
    }
}
