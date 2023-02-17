package com.company.concepts.privateAccessModifier;

public class ExampleClass {

    /*
    Now we can get an employee instance of our Employee class. And behind the scenes, of course, the buildEmployee
    method calls our private constructor. Then we changed value of private attribute position using public method
    elevateToManager() which calls our private position setter.
     */
    public static void main(String[] args) {
        Employee employee = Employee.buildEmployee("123", "Bob");
        employee.elevateToManager();
    }


}
