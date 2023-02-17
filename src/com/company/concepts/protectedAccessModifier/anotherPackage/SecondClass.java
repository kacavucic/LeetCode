package com.company.concepts.protectedAccessModifier.anotherPackage;

import com.company.concepts.protectedAccessModifier.FirstClass;

public class SecondClass extends FirstClass {

    /*
    A class extending FirstClass but declared in a different package.
    As expected, we can access all the protected fields, methods, and constructors. This is because SecondClass is
    a sub-class of FirstClass.
     */
    protected SecondClass(String name) {
        // accessing protected constructor
        super(name);
        // using protected method
        System.out.println("SecondClass name is " + this.getName());
        // accessing a protected field
        this.name = "new name";
        // instantiating protected inner class -> add public constructor to InnerClass
        /*
        The main reason we are getting this error is that the default constructor of a protected class is implicitly
        protected. In addition, SecondClass is a sub-class of FirstClass but is not a sub-class of InnerClass.
        Finally, we also declared SecondClass outside FirstClass' package.
        For all these reasons, SecondClass can't access the protected InnerClass constructor.
        If we wanted to solve this issue and allow our SecondClass to instantiate an InnerClass object, we could
        explicitly declare a public constructor for InnerClass.
        By doing this, we no longer get a compilation error, and we can now instantiate an InnerClass from SecondClass.
         */
        FirstClass.InnerClass innerClass = new FirstClass.InnerClass();
    }
}
