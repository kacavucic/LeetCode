package com.company.concepts.overrideAnnotation;

public class Machine {

    /*
    In a subclass, we can override or overload instance methods. Overriding indicates that the subclass is replacing
    inherited behavior. Overloading is when a subclass is adding new behavior.
    Sometimes, we'll overload by accident when we actually intended to override. It's easy to make this mistake in Java.
     */

    /*
    We overloaded equals method of Object class, by defining parameter of type Machine.
    equals method defined in Object class accepts parameter of type Object.
     */
    // @Override // compiler error: Method does not override method from its superclass
    public boolean equals(Machine obj) {
        return true;
    }

    // Type - overload
    // Instance - override

    // parameters - list of variables in a method declaration
    // arguments - the actual values that are passed in when the method is invoked

    public static void main(String[] args) {
        Object first = new Machine();
        Object second = new Machine();
        /*
        first.equals(second) will produce false
        This is because equals method is overloading Object#equals, not overriding it, so instance first (which is of
        type Object) doesn't have access to equals method defined in Machine class.
         */
        System.out.println(first.equals(second)); // false
    }
    /*
    We can use the @Override annotation on inherited methods to protect us from this mistake.
    In this example, we can add the @Override annotation above the equals method. At this point, the compiler will raise
    an error, informing us that we aren't overriding equals like we think. Then, we can correct our mistake by defining
    equals method with input paramater of type Object (instead of type Machine) and the compiler won't raise any errors.
    This is because now we are overriding Object#equals method (previously we were overloading it).

        @Override //overriding
        public boolean equals(Object obj) {
            return true;
        }
    Because of how easy it's to accidentally overload, it's a common recommendation to use the @Override annotation on
    all inherited methods.
     */
}
