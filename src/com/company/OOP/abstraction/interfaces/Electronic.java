package com.company.OOP.abstraction.interfaces;

public interface Electronic {

    /*
    In OOP, abstraction means hiding the complex implementation details of a program, exposing only the API required
    to use the implementation. In Java, we achieve abstraction by using interfaces and abstract classes.

    In Java, an interface is an abstract type that contains a collection of methods and constant variables.
    It is used to achieve abstraction, polymorphism and multiple inheritances.

    We can implement an interface in a Java class by using the implements keyword.
     */

    /*
        Rules for Creating Interfaces

    In an interface, we're allowed to use:
        - constants variables
        - abstract methods
        - static methods
        - default methods

    We also should remember that:
    - we can't instantiate interfaces directly
    - an interface can be empty, with no methods or variables in it
    - we can't use the final word in the interface definition, as it will result in a compiler error
    - all interface declarations should have the public or default access modifier; the abstract modifier will be added
      automatically by the compiler
    - an interface method can't be protected or final
    - up until Java 9, interface methods could not be private; however, Java 9 introduced the possibility to define
      private methods in interfaces
    - interface variables are public, static, and final by definition; we're not allowed to change their visibility
     */


    // TODO Default Methods in Interfaces
    /*
        Default Methods in Interfaces

    Traditional interfaces in Java 7 and below don't offer backward compatibility.
    What this means is that if you have legacy code written in Java 7 or earlier, and you decide to add an abstract
    method to an existing interface, then all the classes that implement that interface must override the new abstract
    method. Otherwise, the code will break.
    Java 8 solved this problem by introducing the default method that is optional and can be implemented at
    the interface level.
     */

    // Constant variable
    String LED = "LED";

    // Static method
    static boolean isEnergyEfficient(String electtronicType) {
        if (electtronicType.equals(LED)) {
            return true;
        }
        return false;
    }

    // Abstract method
    int getElectricityUse();

    //Default method
    default void printDescription() {
        System.out.println("Electronic Description");
    }
}
