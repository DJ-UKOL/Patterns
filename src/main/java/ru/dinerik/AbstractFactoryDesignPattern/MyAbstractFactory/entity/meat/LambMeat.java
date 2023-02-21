package ru.dinerik.AbstractFactoryDesignPattern.MyAbstractFactory.entity.meat;

public class LambMeat implements Meat {

    public LambMeat() {
        prepareMeat();
    }

    @Override
    public void prepareMeat() {
        System.out.println("Preparing lamb meat...");
    }
}
