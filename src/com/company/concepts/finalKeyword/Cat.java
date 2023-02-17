package com.company.concepts.finalKeyword;

public final class Cat {

    /*
    *While inheritance enables us to reuse existing code, sometimes we do need to set limitations on extensibility
    for various reasons; the final keyword allows us to do exactly that.
     */
    /*
        *Final Classes

    *Classes marked as final can’t be extended.

    If we look at the code of Java core libraries, we’ll find many final classes there. One example is the String class.
    Consider the situation if we can extend the String class, override any of its methods, and substitute all the String
    instances with the instances of our specific String subclass. The result of the operations over String objects will
    then become unpredictable. And given that the String class is used everywhere, it’s unacceptable. That’s why the
    String class is marked as final.
     */

    /*
    Any attempt to inherit from a final class will cause a compiler error. To demonstrate this, we have created the
    final class Cat.
     */

    /*
    If we follow the rules of good design strictly, we should create and document a class carefully or declare it final
    for safety reasons. However, we should use caution when creating final classes. Notice that making a class final
    means that no other programmer can improve it. Imagine that we're using a class and don’t have the source code for
    it, and there's a problem with one method. If the class is final, we can’t extend it to override the method and fix
    the problem. In other words, we lose extensibility, one of the benefits of object-oriented programming.
     */
    private int weight;

    public int getWeight() {
        return weight;
    }

    public void setWeight(int weight) {
        this.weight = weight;
    }

    public void methodWithFinalArguments(final int x) {
        // x=1;
    }

    public static void main(String[] args) {
        /*
        *Note that the final keyword in a class declaration doesn’t mean that the objects of this class are immutable.
        We can change the fields of Cat object freely. We just can’t extend it.
         */
        Cat cat = new Cat();
        cat.setWeight(1);
        System.out.println(cat.getWeight()); // 1
    }
}
