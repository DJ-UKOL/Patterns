package ru.dinerik.DecoratorPattern.entity;

// ConcreteComponent
public class OrchidBouquet extends FlowerBouquet {

    public OrchidBouquet() {
        description = "Orchid bouquet";
    }

    @Override
    public double cost() {
        return 29.0;
    }
}
