package ru.dinerik.BuilderPattern.MyBuilderPatternWithLombok.entity;

import lombok.Builder;
import lombok.ToString;

@Builder
@ToString
public class Employee {
    private String firstName;
    private String lastName;
    private int age;
    private int numberPassport;

    private int numberOrder;
}
