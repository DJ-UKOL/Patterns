package ru.dinerik.AbstractFactoryDesignPattern.MyAbstractFactory.entity.meat;

public class PorkMeat implements Meat {

    public PorkMeat() {
        prepareMeat();
    }
    @Override
    public void prepareMeat() {
        System.out.println("Preparing pork meat...");
    }
}
