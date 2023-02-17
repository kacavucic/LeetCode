package com.company.OOP.abstraction.interfaces.multipleInheritances;

public abstract class Vehicle implements Transform {

    /*
     In order to achieve multiple inheritances thru interfaces, we have to remember a few rules:
        - Interface Extending Another Interface
        - Abstract Class Implementing an Interface
     */

    /*
    When an abstract class implements an interface, it inherits all of its abstract and default methods.
    Vehicle class inherits two methods: the abstract transform method and the default printSpecs method.
     */
}
