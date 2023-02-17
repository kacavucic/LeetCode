package com.company.OOP.inheritance;

public class Employee {

    /*
        *Inheriting Type
    When a class inherits another class or interfaces, apart from inheriting their members, it also inherits their type.
    This also applies to an interface that inherits other interfaces. This is a very powerful concept, which
    *allows developers to program to an interface (base class or interface), rather than programming to their implementations.

    For example, imagine a condition, where an organization maintains a list of the cars owned by its employees.
    Of course, all employees might own different car models. So how can we refer to different car instances?
    Because all derived classes of Car inherit the type Car, the derived class instances can be referred by using a
    variable of class Car.
     */

    private String name;
    private Car car;

    public Employee(String name, Car car) {
        this.name = name;
        this.car = car;
    }

    public static void main(String[] args) {
        Employee e1 = new Employee("Shreya", new ArmoredCar());
        Employee e2 = new Employee("Paul", new SpaceCar());
        Employee e3 = new Employee("Pavni", new BMW());
    }

    public Car getCar() {
        return car;
    }
}
