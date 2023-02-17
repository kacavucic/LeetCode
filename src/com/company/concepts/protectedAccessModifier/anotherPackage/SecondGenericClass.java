package com.company.concepts.protectedAccessModifier.anotherPackage;

public class SecondGenericClass {
    /*
    Uncomment the following lines to see the errors.
    This is because SecondGenericClass is not in the same package as FirstClass and does not subclass it.
     */
    public static void main(String[] args) {
        // accessing protected constructor
        // FirstClass first = new FirstClass("random name");
        // using protected method
        // System.out.println("FirstClass name is " + first.getName());
        // accessing a protected field
        // first.name = "new name";
        // instantiating protected inner class
        // FirstClass.InnerClass innerClass = new FirstClass.InnerClass();
    }
}
