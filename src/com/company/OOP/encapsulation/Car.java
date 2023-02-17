package com.company.OOP.encapsulation;

public class Car {
    /*
    Encapsulation is hiding the state or internal representation of an object from the consumer of an API and providing
    publicly accessible methods bound to the object for read-write access. This allows for hiding specific information
    and controlling access to internal implementation.
     */

    /*
    For example, member fields in a class are hidden from other classes, and they can be accessed using the member
    methods. One way to do this is to make all data fields private and only accessible by using the public member
    methods.
     */

    // member fields
    private String type;
    private String model;
    private String color;
    private int speed;

    /*
    Here, the field speed is encapsulated using the private access modifier, and can only be accessed using the public
    getSpeed() and setSpeed() methods.
     */
    public int getSpeed() {
        return speed;
    }

    public void setSpeed(int speed) {
        this.speed = speed;
    }

    // constructor
    public Car(String type, String model, String color) {
        this.type = type;
        this.model = model;
        this.color = color;
    }

    // member methods
    public int increaseSpeed(int increment) {
        this.speed = this.speed + increment;
        return this.speed;
    }
}
