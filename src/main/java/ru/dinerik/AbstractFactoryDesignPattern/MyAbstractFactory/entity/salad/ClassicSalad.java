package ru.dinerik.AbstractFactoryDesignPattern.MyAbstractFactory.entity.salad;

public class ClassicSalad implements Salad {

    public ClassicSalad() {
        prepareSalad();
    }

    @Override
    public void prepareSalad() {
        System.out.println("Preparing classical salad...");
    }
}
