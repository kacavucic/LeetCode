package com.company.concepts.finalKeyword;

public class Dog {

    /*
        *Final Methods

    *Methods marked as final cannot be overridden.

    When we design a class and feel that a method shouldn’t be overridden, we can make this method final. We can also
    find many final methods in Java core libraries.

    Sometimes we don’t need to prohibit a class extension entirely, but only prevent overriding of some methods. A good
    example of this is the Thread class. It’s legal to extend it and thus create a custom thread class. But its
    isAlive() methods is final. This method checks if a thread is alive. It’s impossible to override the isAlive() method
    correctly for many reasons. One of them is that this method is native. Native code is implemented in another
    programming language and is often specific to the operating system and hardware it's running on.

    Let’s create a Dog class and make its sound() method final.
     */

    public final void sound() {
    }

    /*
    If some methods of our class are called by other methods, we should consider making the called methods final.
    Otherwise, overriding them can affect the work of callers and cause surprising results.

    If our constructor calls other methods, we should generally declare these methods final for the above reason.

    What’s the difference between making all methods of the class final and marking the class itself final?
    In the first case, we can extend the class and add new methods to it.
    In the second case, we can’t do this.
     */

    /*
        *Final Variables

    *Variables marked as final can't be reassigned. Once a final variable is initialized, it can’t be altered.

        *Final Variables - Final Primitive Variables
    Let’s declare a primitive final variable i, then assign 1 to it. And let’s try to assign a value of 2 to it.
     */
    public void whenFinalVariableAssign_thenOnlyOnce() {
        final int i = 1;
        //...
        // i = 2; // Cannot assign a value to final variable 'i'
    }

    public static void main(String[] args) {
        /*
            *Final Variables - Final Reference Variables

        *If we have a final reference variable, we can’t reassign it either. But this doesn’t mean that the object it refers to is immutable.

        We can change the properties of this object freely. To demonstrate this, let’s declare the final reference
        variable cat and initialize it. If we try to reassign it we’ll see a compiler error: "Cannot assign a value to
        final variable cat"
         */
        final Cat cat = new Cat();
        // cat = new Cat();

        // But we can change the properties of Cat instance.
        cat.setWeight(5);
        System.out.println(cat.getWeight()); // 5
    }

    /*
        Final Variables - Final Fields

    *Final fields can be either constants or write-once fields.
    To distinguish them, we should ask a question — would we include this field if we were to serialize the object?
    If no, then it’s not part of the object, but a constant.

    Note that according to naming conventions, class constants should be uppercase, with components separated by
    underscore (“_”) characters.

    *Note that any final field must be initialized before the constructor completes. Otherwise, the compiler will give us an error.

    For static final fields, this means that we can initialize them:
        - upon declaration as shown in the above example
        - in the static initializer block

    For instance final fields, this means that we can initialize them:
        - upon declaration
        - in the instance initializer block
        - in the constructor
     */
    static final int MAX_WIDTH = 999;

    /*
       *Final Method Parameters

    The final keyword is also legal to put before method parameters.
    *A final parameter can’t be changed inside a method.
     */
    public void methodWithFinalArguments(final int x) {
        // x = 1; // Compilation error: Cannot assign a value to final variable 'x'
    }

}