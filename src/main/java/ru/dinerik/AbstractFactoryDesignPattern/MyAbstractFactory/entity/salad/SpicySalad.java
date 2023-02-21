package ru.dinerik.AbstractFactoryDesignPattern.MyAbstractFactory.entity.salad;

public class SpicySalad implements Salad {

    public SpicySalad() {
        prepareSalad();
    }

    @Override
    public void prepareSalad() {
        System.out.println("Preparing spicy salad...");
    }
}
