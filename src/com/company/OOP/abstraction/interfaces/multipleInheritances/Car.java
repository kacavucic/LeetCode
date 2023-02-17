package com.company.OOP.abstraction.interfaces.multipleInheritances;

public class Car implements Fly, Transform {

    /*
    The Car class implements the Fly and Transform interfaces. By doing so, it inherits the methods fly, transform,
     and printSpecs. Methods fly and transform must be implemented in this class, while printSpecs already has default
     implementation in Transform interface.
     */
    @Override
    public void fly() {
        System.out.println("I can Fly!!");
    }

    @Override
    public void transform() {
        System.out.println("I can Transform!!");
    }
}
