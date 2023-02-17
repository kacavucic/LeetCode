package com.company.concepts.nestedClasses;

public class Enclosing {
    /*
    Simply put, Java allows us to define classes inside other classes. Nested classes enable us to logically group
    classes that are only used in one place, write more readable and maintainable code and increase encapsulation.

    Several types of nested classes available in the language:
        - Static nested classes
        - Non-static nested classes
        - Local classes
        - Anonymous classes
     */

    /*
        *Static Nested Classes
    Here are a few points to remember about static nested classes:
        - As with static members, these belong to their enclosing class, and not to an instance of the class
        - They can have all types of access modifiers in their declaration
        - They only have access to static members in the enclosing class
        - They can define both static and non-static members
     */

    private static int x = 1;
    private int y = 7;

    public static class StaticNested {
        private static int a = 1;
        private int b = 7;

        private void run() {
            System.out.println("x = " + x);
            // System.out.println("y = " + y); // Non-static field 'y' cannot be referenced from a static context
        }
    }

    public static void main(String[] args) {
        StaticNested nested = new StaticNested();
        nested.run();
    }

}
