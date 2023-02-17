package com.company.OOP.abstraction.interfaces.multipleInheritances;

public interface Box extends HasColor {

    /*
     In order to achieve multiple inheritances thru interfaces, we have to remember a few rules:
        - Interface Extending Another Interface
        - Abstract Class Implementing an Interface
     */

    /*
    When an interface extends another interface, it inherits all of that interface's abstract methods.
    Box inherits from HasColor using the keyword extends. By doing so, the Box interface inherits getColor.
    As a result, the Box interface now has two methods: getColor and getHeight.
     */
    int getHeight();
}
