package ru.dinerik.AbstractFactoryDesignPattern.factory.topping;

import ru.dinerik.AbstractFactoryDesignPattern.entity.cheese.Cheese;
import ru.dinerik.AbstractFactoryDesignPattern.entity.cheese.GoatCheese;
import ru.dinerik.AbstractFactoryDesignPattern.entity.sauce.CaliforniaOilSauce;
import ru.dinerik.AbstractFactoryDesignPattern.entity.sauce.Sauce;

public class GourmetToppingFactory extends BaseToppingFactory {
    @Override
    public Cheese createCheese() {
        return new GoatCheese();
    }

    @Override
    public Sauce createSauce() {
        return new CaliforniaOilSauce();
    }
}
