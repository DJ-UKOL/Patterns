package ru.dinerik.AbstractFactoryDesignPattern.test;

import org.junit.jupiter.api.Test;
import ru.dinerik.AbstractFactoryDesignPattern.entity.Pizza;
import ru.dinerik.AbstractFactoryDesignPattern.factory.pizza.BasePizzaFactory;
import ru.dinerik.AbstractFactoryDesignPattern.factory.pizza.GourmetPizzaFactory;

public class GourmetPizzaFactoryTest {

    @Test
    public void testCreatePizza() {
        BasePizzaFactory pizzaFactory = new GourmetPizzaFactory();
        Pizza cheesePizza = pizzaFactory.createPizza("cheese");
        Pizza veggiePizza = pizzaFactory.createPizza("veggie");
    }
}
