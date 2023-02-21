package ru.dinerik.AbstractFactoryDesignPattern.MyAbstractFactory.entity.meat;

public class BeefMeat implements Meat {

    public BeefMeat() {
        prepareMeat();
    }

    @Override
    public void prepareMeat() {
        System.out.println("Preparing beef meat...");
    }
}
