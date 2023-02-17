package com.company.concepts.thisKeyword;

public class Keyword {
    /*
    *In Java, this keyword is a reference to the current object whose method is being called.
     */

    /*
        *Disambiguating Field Shadowing

    *The keyword is useful for disambiguating instance variables from local parameters.
    The most common reason is when we have constructor parameters with the same name as instance fields.

    As we can see here, we're using this with the name and age instance fields – to distinguish them from parameters.
    Another usage is to use this with the parameter hiding or shadowing in the local scope.
     */
    private String name;
    private int age;

    public Keyword(String name, int age) {
        this.name = name;
        this.age = age;
    }

}
