package com.company.concepts.acccessModifiers;

public class SuperPublic {
    /*
    Access modifiers are used for setting the access level of classes, variables, methods, and constructors.
    Simply put, there are four access modifiers: public, private, protected and default (no keyword).

    A top-level class can use public or default access modifiers only. At the member level, we can use all four.
     */

    /*
    When we don't use any keyword explicitly, Java will set a default access to a given class, method or property.
    The default access modifier is also called package-private, which means that all members are visible within the
    same package but aren't accessible from other packages:
     */

    // defaultMethod() is accessible in another class of the same package, however, it's not available in other packages.
    static void defaultMethod() {
    }

    /*
    If we add the public keyword to a class, method or property then we're making it available to the whole world,
    i.e. all other classes in all packages will be able to use it. This is the least restrictive access modifier.
     */

    // publicMethod() is available in another package
    public static void publicMethod() {
    }

    /*
    Any method, property or constructor with the private keyword is accessible from the same class only. This is the
    most restrictive access modifier and is core to the concept of encapsulation. All data will be hidden from the
    outside world
     */

    private static void privateMethod() {
    }

    private void anotherPrivateMethod() {
        privateMethod(); // available in the same class only.
    }

    /*
    Between public and private access levels, there's the protected access modifier.

    If we declare a method, property or constructor with the protected keyword, we can access the member from the same
    package (as with package-private access level) and in addition from all subclasses of its class, even if they lie
    in other packages.
     */

    // protectedMethod() is available in subclasses (regardless of the package)
    protected static void protectedMethod() {
    }

    /*
    Modifier   Class   Package   Subclass   World
    public     Y       Y         Y          Y
    protected  Y       Y         Y          N
    default    Y       Y         N          N
    private    Y       N         N          N

     */
}
