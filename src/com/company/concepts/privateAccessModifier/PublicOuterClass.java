package com.company.concepts.privateAccessModifier;

public class PublicOuterClass {
    /*
    There is one special case where we can create a private class — as an inner class of some other class. Otherwise,
    if we were to declare an outer class as private, we'd be forbidding other classes from
    accessing it, making it useless.
     */


    public PrivateInnerClass getInnerClassInstance() {
        PrivateInnerClass myPrivateClassInstance = this.new PrivateInnerClass();
        myPrivateClassInstance.id = "ID1";
        myPrivateClassInstance.name = "Bob";
        return myPrivateClassInstance;
    }

    /*
    We created a private inner class inside our PublicOuterClass by specifying the private access modifier.

    Because we used the private keyword, if we, for some reason, try to instantiate our PrivateInnerClass from outside
    the PublicOuterClass, the code won't compile. To solve this, we created public getInnerClassInstance() method
    which internally instantiates PrivateInnerClass and returns it.
     */
    private class PrivateInnerClass {
        public String name;
        public String id;
    }
}
