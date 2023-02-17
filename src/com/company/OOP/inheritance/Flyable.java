package com.company.OOP.inheritance;

public interface Flyable {

    int duration = 10;

    void fly();

    default void repair() {
        System.out.println("Repairing Flyable object");
    }
}
