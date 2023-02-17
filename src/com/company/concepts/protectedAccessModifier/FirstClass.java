package com.company.concepts.protectedAccessModifier;

public class FirstClass {

    /*
    While elements declared as private can be accessed only by the class in which they're declared, the protected
    keyword allows access from sub-classes and members of the same package.

    By using the protected keyword, we make decisions about which methods and fields should be considered internals
    of a package or class hierarchy, and which are exposed to outside code.
     */

    /*
    By using the protected keyword, we've granted access to these fields (attribute, constructor, getter method) to
    classes in the same package as FirstClass and to sub-classes of FirstClass.
     */
    protected String name;

    protected FirstClass(String name) {
        this.name = name;
    }

    protected String getName() {
        return name;
    }

    /*
        Protected inner class

        This is a static inner class, and so can be constructed from outside of an instance of FirstClass.
        However, as it is protected, we can only instantiate it from code in the same package as FirstClass.

        The default constructor of a protected class is implicitly protected, so we must crate public constructor in
        order to be able to instantiate this class from class in another package which extends FirstClass.
     */
    protected static class InnerClass {
        public InnerClass() {
        }
    }
}
