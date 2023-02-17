package com.company.OOP.abstraction.abstractClass.overview;

public abstract class BoardGame {
    /*
    In OOP, abstraction means hiding the complex implementation details of a program, exposing only the API required
    to use the implementation. In Java, we achieve abstraction by using interfaces and abstract classes.
     */

    /*
    There are many cases when implementing a contract where we want to postpone some parts of the implementation to
    be completed later. We can easily accomplish this in Java through abstract classes.
     */

    /*
    Most relevant characteristics of abstract classes:
        - We define an abstract class with the abstract modifier preceding the class keyword
        - An abstract class can be subclassed, but it can't be instantiated
        - If a class defines one or more abstract methods, then the class itself must be declared abstract
        - An abstract class can declare both abstract and concrete methods
        - A subclass derived from an abstract class must either implement all the base class's abstract methods
          or be abstract itself
     */

    /*
    Now, let's analyze a few scenarios where we should prefer abstract classes over interfaces and concrete classes:
        - We want to encapsulate some common functionality in one place (code reuse) that multiple, related subclasses
          will share
        - We need to partially define an API that our subclasses can easily extend and refine
        - The subclasses need to inherit one or more common methods or fields with protected access modifiers

    Let's keep in mind that all these scenarios are good examples of full, inheritance-based adherence to the
    Open/Closed principle.

    Moreover, since the use of abstract classes implicitly deals with base types and subtypes, we're also taking
    advantage of polymorphism.

    Note that code reuse is a very compelling reason to use abstract classes, as long as the “is-a”
    relationship within the class hierarchy is preserved.

    And Java 8 adds another wrinkle with default methods, which can sometimes take the place of needing to create an
    abstract class altogether.
     */

    //... field declarations, constructors

    public abstract void play();

    //... concrete methods

}
