package ru.dinerik.BuilderPattern.builder;

import ru.dinerik.BuilderPattern.entity.House;

// Builder
public interface HouseBuilder {
    void buildFoundation();
    void buildStructure();
    void buildRoof();
    void paintHouse();
    void furnishHouse();
    House getHouse();
}
