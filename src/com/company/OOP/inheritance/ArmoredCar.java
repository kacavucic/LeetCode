package com.company.OOP.inheritance;

public class ArmoredCar extends Car implements Floatable, Flyable {

    /*
        *Extending a Class

    A class can inherit another class and define additional members.
    *The class ArmoredCar can inherit the members of Car class by using the keyword extends in its declaration.
    *When we extend a class, we form an IS-A relationship. The ArmoredCar IS-A Car. So, it has all the characteristics of a Car.


    We can now say that the ArmoredCar class is a subclass of Car, and the latter is a superclass of ArmoredCar.
    *Classes in Java support single inheritance; the ArmoredCar class can't extend multiple classes.
    Also, note that in the absence of an extends keyword, a class implicitly inherits class java.lang.Object.

    Java supports single inheritance and multilevel inheritance. This means a class cannot extend from more than one
    class directly, but it can use a hierarchy. If we had:
    public class Car extends Vehicle {
        private int numberOfGears;

        public void openDoors() {
            // process to open the doors
        }
    }
    Here, the ArmouredCar extends Car, and Car extends Vehicle. So, ArmouredCar inherits properties from both Car and Vehicle.

    While we inherit from the parent class, a developer could also override a method implementation from the parent.
    *This is known as method overriding.
    In our above example of the Vehicle class, there is the honk() method. The Car class extending the Vehicle class
    can override this method and implement in the way it wants to produce the honk. Note that this is also termed a
    *runtime polymorphism.

    *A subclass class inherits the non-static protected and public members from the superclass class.
    In addition, the members with default (package-private) access are inherited if the two classes are in the same package.
    On the other hand, the private and static members of a class are not inherited.
     */

    /*
        *Implementing Multiple Interfaces
    *Although classes can inherit only one class, they can implement multiple interfaces.
    We notice the use of the keyword implements to inherit from an interface.
     */

    private int bulletProofWindows;

    /*
        *Hidden Instance Members
    *What happens if both the superclass and subclass define a variable or method with the same name?
    Don't worry; we can still access both of them. However, we must make our intent clear to Java, by prefixing the
    variable or method with the keywords this or super.
    The this keyword refers to the instance in which it's used. The super keyword (as it seems obvious) refers to the
    parent class instance.
     */
    private String model;
    public String getAValue() {
        return super.model;   // returns value of model defined in base class Car
        // return this.model;   // will return value of model defined in ArmoredCar
        // return model;   // will return value of model defined in ArmoredCar
    }

    public String registerModel() {
        return model; // will return value of model defined in ArmoredCar
    }

    public void remoteStartCar() {
        // this vehicle can be started by using a remote control
    }

    /*
        *Hidden Static Members

    *What happens when our base class and subclasses define static variables and methods with the same name?
    Can we access a static member from the base class, in the derived class, the way we do for the instance variables?
    No, we can't. The static members belong to a class and not to instances. So we can't use the non-static super
    keyword in msg().
     */
    public static String msg() {
        // return super.msg(); // this won't compile
        // return Car.msg(); // this will compile and return "Car"
        return "ArmoredCar";
    }

    // TODO When can static method be accessed via instance reference?
    // TODO What would happen here if msg() method wasn't static? Maybe method overriding?
    public static void main(String[] args) {
        Car first = new ArmoredCar();
        ArmoredCar second = new ArmoredCar();
        /*
        The msg() method that is called depends on the type of the variable used to refer to ArmoredCar instance.
         */
        System.out.println(first.msg()); // will output “Car“
        System.out.println(second.msg()); // will output “ArmoredCar”
    }

    /*
        *Accessing Parent Members from a Child Class
    To access inherited properties (if property with same name doesn't exist in subclass too), we can
    simply use them directly. Note that we don't need a reference to the superclass to access its members.
     */
    public int getWheels() {
        return wheels;
    }

    @Override
    public void floatOnWater() {
        System.out.println("I can float!");
    }

    @Override
    public void fly() {
        System.out.println("I can fly!");
    }

    /*
        *Issues With Multiple Inheritance

    *Java allows multiple inheritance using interfaces.
    *ISSUE: ArmoredCar inherits unrelated defaults for repair() from types Floatable and Flyable.
    Issue is the same signature of this method in both interfaces. Since this method is default in both interfaces,
    it can have implementation in those interfaces. Those implementations don't have to be the same, and so the
    issue is that ArmoredCar class cannot know which one to inherit.

    Until Java 7, this wasn't an issue. Interfaces could only define abstract methods, that is, methods without any
    implementation. So if a class implemented multiple interfaces with the same method signature, it was not a
    problem. The implementing class eventually had just one method to implement.

    *Starting with Java 8, interfaces could choose to define default implementations for its methods
    (an interface can still define abstract methods). This means that if a class implements multiple interfaces,
    which define methods with the same signature, the child class would inherit separate implementations. This
    sounds complex and is not allowed.
    *Java disallows inheritance of multiple implementations of the same methods, defined in separate interfaces.
     */

    // If we do want to implement both interfaces, we'll have to override the repair() method.
    @Override
    public void repair() {
        Floatable.super.repair();
    }

    /*
        If the Floatable and Flyable interfaces define variables with the same name, say duration, we can't access
        them without preceding the variable name with the interface name.
     */
    public void aMethod() {
        // System.out.println(duration); // Won't compile
        System.out.println(Floatable.duration); // outputs 10
        System.out.println(Flyable.duration); // outputs 20
    }
}
