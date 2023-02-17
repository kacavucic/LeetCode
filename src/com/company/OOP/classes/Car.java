package com.company.OOP.classes;

public class Car {
    /*
    Two basic building blocks of the Java programming language are classes and objects.
    In OOP, classes are blueprints or templates for objects. We use them to describe types of entities.

    On the other hand, objects are living entities, created from classes. They contain certain states within their fields
    and present certain behaviors with their methods.
    Simply put, a class represent a definition or a type of object.
    In Java, classes can contain fields, constructors, and methods.
     */

    /*
    We use fields to hold the state and a constructor to create objects from this class.
    Every Java class has an empty constructor by default. We use it if we don't provide a specific implementation as
    we did here. Here's how the default constructor would look for our Car class:
    Car() {
    }
    This constructor simply initializes all fields of the object with their default values. Strings are initialized
    to null and integers to zero.
     */

    // fields
    /*
    Fields contain the state of objects of the class.
     */
    private String type;
    private String model;
    private String color;
    private int speed;

    // constructor
    /*
    Our class has a specific constructor because we want our objects to have their fields defined when we create them.
    Note that a class may have more than one constructor.
     */
    public Car(String type, String model, String color) {
        this.type = type;
        this.model = model;
        this.color = color;
    }

    // methods
    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public int getSpeed() {
        return speed;
    }

    public int increaseSpeed(int increment) {
        if (increment > 0) {
            this.speed += increment;
        }
        else {
            System.out.println("Increment can't be negative.");
        }
        return this.speed;
    }

    public int decreaseSpeed(int decrement) {
        if (decrement > 0 && decrement <= this.speed) {
            this.speed -= decrement;
        }
        else {
            System.out.println("Decrement can't be negative or greater than current speed.");
        }
        return this.speed;
    }

    @Override
    public String toString() {
        return "Car [type=" + type + ", model=" + model + ", color=" + color + ", speed=" + speed + "]";
    }

    /*
    While classes are translated during compile time, objects are created from classes at runtime.
    Objects of a class are called instances, and we create and initialize them with constructors.
    Now, we will create different Car objects, all from a single class. This is the point of it all, to define the
    blueprint in one place, and then, to reuse it many times in many places.
     */
    public static void main(String[] args) {
        Car focus = new Car("Ford", "Focus", "red");
        Car auris = new Car("Toyota", "Auris", "blue");
        Car golf = new Car("Volkswagen", "Golf", "green");


        /*
        Since our constructor accepts type, model and color, and not speed, speed of all newly created Car objects
        are zero (default value of int data type).
        To change speed of cars we invoke method increaseSpeed.
         */
        focus.increaseSpeed(10);
        auris.increaseSpeed(20);
        golf.increaseSpeed(30);
        // Now, we've changed the state of our cars.
    }

    /*
    Our fields are marked private, which means they're not accessible from our object directly, but we provide access
    to them through getters and setters.

    The type and model fields do not have getters and setters, because they hold internal data of our objects.
    We can define them only through the constructor during initialization. Furthermore, the color can be accessed and
    changed, whereas speed can only be accessed, but not changed. We enforced speed adjustments through specialized
    public methods increaseSpeed() and decreaseSpeed(). In other words, we use access control to encapsulate the state
    of the object.
     */
}
