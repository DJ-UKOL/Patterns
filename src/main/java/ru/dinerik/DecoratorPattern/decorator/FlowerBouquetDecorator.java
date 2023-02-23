package ru.dinerik.DecoratorPattern.decorator;

import ru.dinerik.DecoratorPattern.entity.FlowerBouquet;

// Decorator
public abstract class FlowerBouquetDecorator extends FlowerBouquet {
    public abstract String getDescription();
}
