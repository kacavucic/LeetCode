package com.company.concepts.thisKeyword;

public class CallParametrized {
    /*
        *Referencing Constructors of the Same Class

    *From a constructor, we can use this() to call a different constructor of the same class.
    Here, we use this() for the constructor chaining to reduce the code usage.

    We can call the parameterized constructor from the no argument constructor and pass some arguments.

    Note, that this() should be the first statement in the constructor, otherwise the compilation error will occur.
     */
    private String name;
    private int age;

    public CallParametrized(String name, int age) {
        this.name = name;
        this.age = age;
    }

    public CallParametrized() {
        this("John", 27);
        this.printMessage();
        /*
            *Passing this as a Parameter

        Inside the constructor, we invoke printInstance() method. With this, we pass a reference to the current instance
        of CallParametrized class.
        Here we have printInstance() method, where the this CallParametrized argument is passed.
         */
        printInstance(this);
    }

    public void printMessage() {
        System.out.println("invoked by this");
    }

    public void printInstance(CallParametrized callParametrized) {
        System.out.println(callParametrized);
    }

    /*
        *Returning this

    *We can also use this keyword to return the current class instance from the method.
     */
    public CallParametrized getCurrentInstance() {
        return this;
    }

    /*
        *The this Keyword Within the Inner Class

    *We also use this to access the outer class instance from within the inner class.

    Here, inside the constructor, we can get a reference to the CallParametrized instance with the CallParametrized.this call.
    We can go even deeper and access the instance variables like CallParametrized.this.name field.
     */

    class ThisInnerClass {

        boolean isInnerClass = true;

        public ThisInnerClass() {
            CallParametrized thisCallParametrized = CallParametrized.this;
            String outerString = CallParametrized.this.name;
        }
    }
}
