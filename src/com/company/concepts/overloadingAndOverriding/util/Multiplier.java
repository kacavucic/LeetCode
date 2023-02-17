package com.company.concepts.overloadingAndOverriding.util;

public class Multiplier {
    /*
        *Method Overloading

    *Method overloading is a powerful mechanism that allows us to define cohesive class APIs.
    To better understand why method overloading is such a valuable feature, let's see a simple example. Suppose that
    we've written a naive utility class that implements different methods for multiplying two numbers, three numbers,
    and so on. If we've given the methods misleading or ambiguous names, such as multiply2(), multiply3(), multiply4(),
    then that would be a badly designed class API. Here's where method overloading comes into play.

    *Simply put, we can implement method overloading in three different ways:
        - implementing two or more methods that have the same name but take different numbers of arguments
        - implementing two or more methods that have the same name but take arguments of different types
        - implementing two or more methods that have the same name but take arguments of same types in different order

    *It's worth noting, however, that it's not possible to have two method implementations that differ only in their return types.
     */

    public double multiply(int a, double b) { // assume this is method for which we're doing overloading
        return a * b;
    }

    public double multiply(int a, double b, int c) { // takes different numbers of arguments
        return a * b * c;
    }

    public int multiply(int a, int b) { // accepts arguments of different types
        return a * b;
    }

    public double multiply(double b, int a) { // accepts arguments of same types in different order
        return a * b;
    }

    /*
    This method differs from first method only in return type, which is not possible.
    *In this case, the code simply wouldn't compile because of the method call ambiguity.
    The compiler wouldn't know which implementation of multiply() to call.

        public float multiply(int a, double b) {
            return (float) (a * b);
        }
     */

    public static void main(String[] args) {
        Multiplier multiplier = new Multiplier();
        System.out.println(multiplier.multiply(10, 10.5));
        System.out.println(multiplier.multiply(10, 10.5, 10));
        System.out.println(multiplier.multiply(10, 10));
        System.out.println(multiplier.multiply(10.5, 10));
    }

    /*
        *Static Binding

    The ability to associate a specific method call to the method's body is known as binding. In the case of method
    overloading, the binding is performed statically at compile time, hence it's called static (or early) binding.
    The compiler can effectively set the binding at compile time by simply checking the methods' signatures.
     */
}
