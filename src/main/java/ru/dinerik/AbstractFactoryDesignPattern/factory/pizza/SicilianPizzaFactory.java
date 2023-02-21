package ru.dinerik.AbstractFactoryDesignPattern.factory.pizza;

import ru.dinerik.AbstractFactoryDesignPattern.entity.CheesePizza;
import ru.dinerik.AbstractFactoryDesignPattern.entity.PepperoniPizza;
import ru.dinerik.AbstractFactoryDesignPattern.entity.Pizza;
import ru.dinerik.AbstractFactoryDesignPattern.entity.VeggiePizza;
import ru.dinerik.AbstractFactoryDesignPattern.factory.topping.BaseToppingFactory;
import ru.dinerik.AbstractFactoryDesignPattern.factory.topping.SicilianToppingFactory;

public class SicilianPizzaFactory extends BasePizzaFactory {

    @Override
    public Pizza createPizza(String type) {

        Pizza pizza;

        BaseToppingFactory toppingFactory= new SicilianToppingFactory();

        pizza = switch (type.toLowerCase()) {
            case "cheese" -> new CheesePizza(toppingFactory);
            case "pepperoni" -> new PepperoniPizza(toppingFactory);
            case "veggie" -> new VeggiePizza(toppingFactory);
            default -> throw new IllegalArgumentException("No such pizza.");
        };

        pizza.addIngredients();
        pizza.bakePizza();
        return pizza;
    }
}
