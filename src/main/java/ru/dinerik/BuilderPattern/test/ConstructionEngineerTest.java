package ru.dinerik.BuilderPattern.test;

import org.junit.jupiter.api.Test;
import ru.dinerik.BuilderPattern.builder.ConcreteHouseBuilder;
import ru.dinerik.BuilderPattern.builder.ConstructionEngineer;
import ru.dinerik.BuilderPattern.builder.HouseBuilder;
import ru.dinerik.BuilderPattern.builder.PrefabricatedHouseBuilder;
import ru.dinerik.BuilderPattern.entity.House;

public class ConstructionEngineerTest {

    @Test
    public void testConstructHouse() {

        HouseBuilder concreteHouseBuilder = new ConcreteHouseBuilder();
        ConstructionEngineer engineerA = new ConstructionEngineer(concreteHouseBuilder);
        House houseA = engineerA.constructHouse();
        System.out.println("House is: "+houseA);
        PrefabricatedHouseBuilder prefabricatedHouseBuilder = new PrefabricatedHouseBuilder();
        ConstructionEngineer engineerB = new ConstructionEngineer(prefabricatedHouseBuilder);
        House houseB = engineerB.constructHouse();
        System.out.println("House is: " +houseB);
    }
}
