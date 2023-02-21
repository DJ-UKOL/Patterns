package ru.dinerik.AbstractFactoryDesignPattern.MyAbstractFactory.entity.meat;

public class ChickenMeat implements Meat {

    public ChickenMeat() {
        prepareMeat();
    }

    @Override
    public void prepareMeat() {
        System.out.println("Preparing chicken meat...");
    }
}
