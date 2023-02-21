package ru.dinerik.factoryMethodPattern.factory;

import ru.dinerik.factoryMethodPattern.entity.CheesePizza;
import ru.dinerik.factoryMethodPattern.entity.PepperoniPizza;
import ru.dinerik.factoryMethodPattern.entity.Pizza;
import ru.dinerik.factoryMethodPattern.entity.VeggiePizza;

public class PizzaFactory extends BasePizzaFactory {
    @Override
    public Pizza createPizza(String type) {
        Pizza pizza = switch (type.toLowerCase()) {
            case "cheese" -> new CheesePizza();
            case "pepperoni" -> new PepperoniPizza();
            case "veggie" -> new VeggiePizza();
            default -> throw new IllegalArgumentException("No such pizza.");
        };
        pizza.addIngredients();
        pizza.bakePizza();
        return pizza;
    }
}