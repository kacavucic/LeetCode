package com.company.OOP;

public class Car {
    // member fields
    private String type;
    private String model;
    private String color;
    private int speed;

    // constructor
    public Car(String type, String model, String color) {
        this.type = type;
        this.model = model;
        this.color = color;
    }

    // member methods
    public int increaseSpeed(int increment) {
        this.speed = this.speed + increment;
        return this.speed;
    }

    @Override
    public String toString() {
        return "Car{" +
                "type='" + type + '\'' +
                ", model='" + model + '\'' +
                ", color='" + color + '\'' +
                ", speed=" + speed +
                '}';
    }
}
