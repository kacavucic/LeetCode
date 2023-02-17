package com.company.concepts.overloadingAndOverriding.util;

public class TypePromotion {
    /*
        *Type Promotion
    One neat feature provided by method overloading is the so-called type promotion, a.k.a. widening primitive conversion.
    In simple terms, one given type is implicitly promoted to another one when there's no matching between the types of
    the arguments passed to the overloaded method and a specific method implementation.

    To understand more clearly how type promotion works, consider the following implementations of the multiply() method.
     */

    public double multiply(int a, long b) {
        return a * b;
    }

    public int multiply(int a, int b, int c) {
        return a * b * c;
    }

    /*
    Now, calling the method with two int arguments will result in the second argument being promoted to long, as in this
    case there's not a matching implementation of the method with two int arguments.

    Conversely, if we call the method with a matching implementation, type promotion just doesn't take place.
     */
    public static void main(String[] args) {
        TypePromotion typePromotion = new TypePromotion();
        System.out.println(typePromotion.multiply(10, 10)); // prints 100.0
        System.out.println(typePromotion.multiply(10, 10, 10)); // prints 1000
    }

    /*
    Here's a summary of the type promotion rules that apply for method overloading:
        - byte can be promoted to short, int, long, float, or double
        - short can be promoted to int, long, float, or double
        - char can be promoted to int, long, float, or double
        - int can be promoted to long, float, or double
        - long can be promoted to float or double
        - float can be promoted to double
     */
}
