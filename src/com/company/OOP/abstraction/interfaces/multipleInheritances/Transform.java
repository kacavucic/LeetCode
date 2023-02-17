package com.company.OOP.abstraction.interfaces.multipleInheritances;

public interface Transform {
    /*
    Java classes support singular inheritance (one class cannot extend more than one class). However, by using
    interfaces, we're also able to implement multiple inheritances (one class can implement multiple interfaces).
     */

    void transform();

    default void printSpecs() {
        System.out.println("Transform Specification");
    }
}
