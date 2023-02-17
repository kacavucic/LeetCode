package com.company.concepts.nestedClasses;

public class Outer {

    /*
         *Non-Static Nested Classes

    Next, here are a few quick points to remember about non-static nested classes:
        - They are also called inner classes
        - They can have all types of access modifiers in their declaration
        - Just like instance variables and methods, inner classes are associated with an instance of the enclosing class
        - They have access to all members of the enclosing class, regardless of whether they are static or non-static
        - They can only define non-static members
     */

    /*
    If we declare a nested class with a modifier static, then it's a static member one. Otherwise, it's an inner class.
    Even though syntactically the difference is just a single keyword (i.e., static), semantically there is a huge
    difference between these kinds of nested classes. Inner class instances are bound to the enclosing class ones and
    therefore they have access to their members. We should be aware of this issue when selecting whether to make a
    nested class be an inner one.
     */

    public class Inner {

        public void run() {
            System.out.println("Calling test...");
        }
    }

    public static void main(String[] args) {
        // To instantiate an inner class, we must first instantiate its enclosing class.
        Outer outer = new Outer();
        Inner inner = outer.new Inner();
        inner.run();
    }
}
