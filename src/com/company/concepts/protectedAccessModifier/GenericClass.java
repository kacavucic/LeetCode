package com.company.concepts.protectedAccessModifier;

public class GenericClass {

    /*
    Access to protected fields from the same package as FirstClass
     */
    public static void main(String[] args) {
        // accessing protected constructor
        FirstClass first = new FirstClass("name");
        // using protected method
        System.out.println("FirstClass name is: " + first.getName());
        // accessing a protected field
        first.name = "new name";
        // instantiating protected inner class
        FirstClass.InnerClass innerClass = new FirstClass.InnerClass();
    }
}
