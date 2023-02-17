package com.company.concepts.nestedClasses;

public class NewEnclosing {

    /*
        *Local Classes

    Local classes are a special type of inner classes – in which the class is defined inside a method or scope block.
    Let's see a few points to remember about this type of class:
        - They cannot have access modifiers in their declaration
        - They have access to both static and non-static members in the enclosing context
        - They can only define instance members
     */

    private void run() {
        class Local {
            void run() {
                System.out.println("Welcome to Baeldung!");
            }
        }
        Local local = new Local();
        local.run();
    }

    public static void main(String[] args) {
        NewEnclosing newEnclosing = new NewEnclosing();
        newEnclosing.run();
    }
}
