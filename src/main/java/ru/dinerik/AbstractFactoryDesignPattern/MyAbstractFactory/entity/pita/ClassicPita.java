package ru.dinerik.AbstractFactoryDesignPattern.MyAbstractFactory.entity.pita;

public class ClassicPita implements Pita {
    public ClassicPita() {
        preparePita();
    }
    @Override
    public void preparePita() {
        System.out.println("Preparing classical pita...");
    }
}
