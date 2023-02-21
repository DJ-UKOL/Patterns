package ru.dinerik.AbstractFactoryDesignPattern.test;

import org.junit.jupiter.api.Test;
import ru.dinerik.AbstractFactoryDesignPattern.entity.Pizza;
import ru.dinerik.AbstractFactoryDesignPattern.factory.pizza.BasePizzaFactory;
import ru.dinerik.AbstractFactoryDesignPattern.factory.pizza.SicilianPizzaFactory;

public class SicilianPizzaFactoryTest {

    @Test
    public void testCreatePizza(){
        BasePizzaFactory pizzaFactory = new SicilianPizzaFactory();
        Pizza cheesePizza = pizzaFactory.createPizza("cheese");
        Pizza pepperoniPizza = pizzaFactory.createPizza("pepperoni");
    }
}