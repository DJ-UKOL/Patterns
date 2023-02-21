package ru.dinerik.AbstractFactoryDesignPattern.MyAbstractFactory.entity.cheese;

public class ParmesanCheese implements Cheese {

    public ParmesanCheese() {
        prepareCheese();
    }

    @Override
    public void prepareCheese() {
        System.out.println("Preparing parmesan cheese...");
    }
}
