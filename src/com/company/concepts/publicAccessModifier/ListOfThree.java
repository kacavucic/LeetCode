package com.company.concepts.publicAccessModifier;

import java.util.AbstractList;
import java.util.Arrays;

public class ListOfThree<E> extends AbstractList<E> {

    /*
    Moreover, we can design public classes for inheritance by using the optional abstract modifier. When we're using
    the abstract modifier, the class is like a skeleton that has fields and pre-implemented methods that any concrete
    implementation can use, in addition to having abstract methods that each subclass needs to implement.

    For example, the Java collections framework provides the AbstractList class as a basis for creating customized lists
    So, we only have to implement the get() and size() methods. Other methods like indexOf() and containsAll()
    are already implemented for us.
     */

    private static final int LENGTH = 3;
    private Object[] elements;

    public ListOfThree(E[] data) {
        if (data == null || data.length != LENGTH) {
            throw new IllegalArgumentException();
        }
        this.elements = Arrays.copyOf(data, data.length); //shallow copy
    }

    @Override
    @SuppressWarnings("unchecked")
    public E get(int index) {
        //custom implementation
        return (E) elements[index];
    }

    @Override
    public int size() {
        //custom implementation
        return LENGTH;
    }

}
