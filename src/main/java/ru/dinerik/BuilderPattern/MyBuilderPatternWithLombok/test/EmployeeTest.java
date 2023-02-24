package ru.dinerik.BuilderPattern.MyBuilderPatternWithLombok.test;

import org.junit.jupiter.api.Test;
import ru.dinerik.BuilderPattern.MyBuilderPatternWithLombok.entity.Employee;

public class EmployeeTest {

    @Test
    public void employeeTest() {
        System.out.println(Employee.builder()
                .age(14)
                .firstName("Sasha")
                .lastName("Vasiliev")
                .numberPassport(123456780)
                .build());
    }

    @Test
    public void employee2Test() {
        System.out.println(Employee.builder()
                .age(25)
                .firstName("Kolya")
                .lastName("Saveloy")
                .numberOrder(543232342)
                .build());
    }
}