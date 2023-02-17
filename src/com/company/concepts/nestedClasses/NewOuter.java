package com.company.concepts.nestedClasses;

public class NewOuter {

    /*
         *Shadowing

    The declaration of the members of an inner class shadow those of the enclosing class if they have the same name.
    In this case, the this keyword refers to the instances of the nested class and the members of the outer class can
    be referred to using the name of the outer class.
     */

    int a = 1;
    static int b = 2;

    public class InnerClass {
        int a = 3;
        static final int b = 4;

        public void run() {
            System.out.println("a = " + a);
            System.out.println("b = " + b);
            System.out.println("NewOuter.this.a = " + NewOuter.this.a);
            System.out.println("NewOuter.b = " + NewOuter.b);
            System.out.println("NewOuter.this.b = " + NewOuter.this.b);
        }
    }

    public static void main(String[] args) {
        NewOuter outer = new NewOuter();
        InnerClass inner = outer.new InnerClass();
        inner.run();
    }

    /*
    To avoid a java.io.NotSerializableException while attempting to serialize a nested class, we should:
        - Declare the nested class as static
        - Make both the nested class and the enclosing class implement Serializable
     */

}
