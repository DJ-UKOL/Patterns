package ru.dinerik.factoryMethodPattern.test;

import org.junit.jupiter.api.Test;
import ru.dinerik.factoryMethodPattern.factory.BasePizzaFactory;
import ru.dinerik.factoryMethodPattern.entity.Pizza;
import ru.dinerik.factoryMethodPattern.factory.PizzaFactory;

public class PizzaFactoryTest {
    @Test
    public void testMakePizzas(){
        BasePizzaFactory pizzaFactory = new PizzaFactory();
        Pizza cheesePizza = pizzaFactory.createPizza("cheese");
        Pizza veggiePizza = pizzaFactory.createPizza("veggie");
    }
}
