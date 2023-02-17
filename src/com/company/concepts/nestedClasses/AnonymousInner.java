package com.company.concepts.nestedClasses;

abstract class SimpleAbstractClass {
    abstract void run();
}

public class AnonymousInner {

    /*
        *Anonymous Classes

    Anonymous classes can be used to define an implementation of an interface or an abstract class without having to
    create a reusable implementation.

    Let's list a few points to remember about anonymous classes:
        - They cannot have access modifiers in their declaration
        - They have access to both static and non-static members in the enclosing context
        - They can only define instance members
        - They're the only type of nested classes that cannot define constructors or extend/implement other classes or interfaces
 */

    public static void main(String[] args) {
        SimpleAbstractClass simpleAbstractClass = new SimpleAbstractClass() {
            void run() {
                System.out.println("Running Anonymous Class...");
            }
        };
        simpleAbstractClass.run();
    }
}
