package ru.dinerik.AbstractFactoryDesignPattern.factory.pizza;

import ru.dinerik.AbstractFactoryDesignPattern.entity.CheesePizza;
import ru.dinerik.AbstractFactoryDesignPattern.entity.PepperoniPizza;
import ru.dinerik.AbstractFactoryDesignPattern.entity.Pizza;
import ru.dinerik.AbstractFactoryDesignPattern.entity.VeggiePizza;
import ru.dinerik.AbstractFactoryDesignPattern.factory.topping.BaseToppingFactory;
import ru.dinerik.AbstractFactoryDesignPattern.factory.topping.GourmetToppingFactory;

public class GourmetPizzaFactory extends BasePizzaFactory{
    @Override
    public Pizza createPizza(String type) {
        Pizza pizza;
        BaseToppingFactory toppingFactory = new GourmetToppingFactory();

        switch (type.toLowerCase()) {
            case "pepperoni" -> pizza = new PepperoniPizza(toppingFactory);
            case "cheese" -> pizza = new CheesePizza(toppingFactory);
            case "veggie" -> pizza = new VeggiePizza(toppingFactory);

            default -> throw new IllegalArgumentException("No such pizza.");
        }

        pizza.addIngredients();
        pizza.bakePizza();
        return pizza;
    }
}
