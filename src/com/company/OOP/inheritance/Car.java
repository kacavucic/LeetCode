package com.company.OOP.inheritance;

public class Car {

    /*
    *One of the core principles of OOP – inheritance – enables us to reuse existing code or extend an existing type.
    *Inheritance is the mechanism that allows one class to acquire all the properties from another class by inheriting the class.

    Simply put, in Java, a class can inherit another class and multiple interfaces, while an interface can inherit
    other interfaces.

    With inheritance, we can create a class with basic features and behavior and create its specialized versions, by
    creating classes, that inherit this base class. In the same way, interfaces can extend existing interfaces.
    *
    We'll notice the use of multiple terms to refer to a type which is inherited by another type, specifically:
        *- a base type is also called a super or a parent type
        *- a derived type is referred to as an extended, sub or a child type
     */

    private final int DEFAULT_WHEEL_COUNT = 5;
    private final String DEFAULT_MODEL = "Basic";

    protected int wheels;
    protected String model;

    public Car() {
        this.wheels = DEFAULT_WHEEL_COUNT;
        this.model = DEFAULT_MODEL;
    }

    public Car(int wheels, String model) {
        this.wheels = wheels;
        this.model = model;
    }

    public void start() {
        // Check essential parts
        // If okay, start.
    }
    public static int count = 10;
    public static String msg() {
        return "Car";
    }

    public String toString() {
        return model;
    }
}
