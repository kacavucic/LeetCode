package com.company.concepts.overloadingAndOverriding.model;

public class Car extends Vehicle {
    /*
        *Method Overriding

    *Method overriding allows us to provide fine-grained implementations in subclasses for methods defined in a base class.

    While method overriding is a powerful feature – considering that is a logical consequence of using inheritance, one
    of the biggest pillars of OOP – when and where to utilize it should be analyzed carefully, on a per-use-case basis.

    Let's see now how to use method overriding by creating a simple, inheritance-based (“is-a”) relationship.
     */

    /*
    In the hierarchy above, we've simply overridden the accelerate() method in order to provide a more refined
    implementation for the subtype Car. Here, it's clear to see that if an application uses instances of the Vehicle
    class, then it can work with instances of Car as well, as both implementations of the accelerate() method
    have the same signature and the same return type.
     */
    @Override
    public String accelerate(long mph) {
        return "The car accelerates at : " + mph + " MPH.";
    }

    /*
    Calling the accelerate() method on a base Vehicle instance and calling accelerate() on a Car instance will return
    different values for the same argument. The overridden method is invoked for an instance of Car.
    The run() and stop() methods, which aren't overridden, return equal values for both Car and Vehicle instances.
     */
    public static void main(String[] args) {
        Vehicle vehicle = new Vehicle();
        System.out.println(vehicle.accelerate(100)); // The vehicle accelerates at : 100 MPH.
        System.out.println(vehicle.run()); // The vehicle is running.
        System.out.println(vehicle.stop()); // The vehicle has stopped.

        Vehicle car = new Car();
        System.out.println(car.accelerate(100)); // The car accelerates at : 100 MPH.
        System.out.println(car.run()); // The vehicle is running.
        System.out.println(car.stop()); // The vehicle has stopped.
    }

    /*
        *Type Substitutability

    A core principle in OOP is that of type substitutability, which is closely associated with the Liskov Substitution
    Principle (LSP). Simply put, the LSP states that if an application works with a given base type, then it should also
    work with any of its subtypes. That way, type substitutability is properly preserved.

    The biggest problem with method overriding is that some specific method implementations in the derived classes might
    not fully adhere to the LSP and therefore fail to preserve type substitutability.

    Of course, it's valid to make an overridden method to accept arguments of different types and return a different type
    as well, but with full adherence to these rules:
        - If a method in the base class takes argument(s) of a given type, the overridden method should take the same type
          or a supertype (a.k.a. contravariant method arguments)
        - If a method in the base class returns void, the overridden method should return void
        - If a method in the base class returns a primitive, the overridden method should return the same primitive
        - If a method in the base class returns a certain type, the overridden method should return the same type or a
          subtype (a.k.a. covariant return type)
        - If a method in the base class throws an exception, the overridden method must throw the same exception or a
          subtype of the base class exception
     */

    /*
        *Dynamic Binding
    Considering that method overriding can be only implemented with inheritance, where there is a hierarchy of a base
    type and subtype(s), the compiler can't determine at compile time what method to call, as both the base class and
    the subclasses define the same methods. As a consequence, the compiler needs to check the type of object to know
    what method should be invoked. As this checking happens at runtime, method overriding is a typical example
    of dynamic binding.
     */
}
