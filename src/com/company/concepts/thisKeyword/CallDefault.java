package com.company.concepts.thisKeyword;

public class CallDefault {
    /*
        *Referencing Constructors of the Same Class

    *From a constructor, we can use this() to call a different constructor of the same class.
    Here, we use this() for the constructor chaining to reduce the code usage.

    The most common use case is to call a default constructor from the parameterized constructor.

    Note, that this() should be the first statement in the constructor, otherwise the compilation error will occur.
     */
    public CallDefault() { // default constructor
    }

    public CallDefault(String name, int age) {
        this();
        // the rest of the code
    }


}
