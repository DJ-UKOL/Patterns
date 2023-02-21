package ru.dinerik.AbstractFactoryDesignPattern.MyAbstractFactory.entity.pita;

public class CheesePita implements Pita {
    @Override
    public void preparePita() {
        System.out.println("Preparing cheese pita...");
    }
}
