package com.company.concepts.anonymousClasses;

import java.util.ArrayList;
import java.util.List;

public class Main {

    public static void main(String[] args) {
    /*
        *Anonymous Class Declaration

    *Anonymous classes are inner classes with no name.
    Since they have no name, we can't use them in order to create instances of anonymous classes. As a result, we have
    to declare and instantiate anonymous classes in a single expression at the point of use.

    We may either extend an existing class or implement an interface.
     */

    /*
        *Extend a Class

    When we instantiate an anonymous class from an existent one, we use the following syntax:
        new ParentClass (...) {...};
    In the parentheses, we specify the parameters that are required by the constructor of the class that we are extending.
    Naturally, if the parent class constructor accepts no arguments, we should leave the parentheses empty.
     */

        Book book = new Book("Design Patterns") {
            @Override
            public String description() {
                return "Famous GoF book.";
            }
        };
        System.out.printf("Title: %s, description: %s%n", book.title, book.description()); // Title: Design Patterns, description: Famous GoF book.
    /*
        *Implement an Interface

    We may instantiate an anonymous class from an interface as well:
        new InterfaceName(){...};
    Obviously, Java's interfaces have no constructors, so the parentheses always remain empty. This is the only way we
    should do it to implement the interface's methods.
    Once we have instantiated an anonymous class, we can assign that instance to a variable in order to be able to
    reference it somewhere later.
     */
        Runnable action = new Runnable() {
            @Override
            public void run() {
                System.out.println("Hello from runnable.");
            }

        };
    /*
    *As we already mentioned, an anonymous class declaration is an expression, hence it must be a part of a statement.
    This explains why we have put a semicolon at the end of the statement.
    Obviously, we can avoid assigning the instance to a variable if we create that instance inline.
     */
        final List<Runnable> actions = new ArrayList<>();
        actions.add(action);
        actions.add(new Runnable() {
            @Override
            public void run() {
                System.out.println("Hello from runnable #2.");

            }
        });
    /*
        *Anonymous Class Properties - Constructor

    The syntax of anonymous classes does not allow us to make them implement multiple interfaces.
    *During construction, there might exist exactly one instance of an anonymous class.
    Therefore, they can never be abstract. Since they have no name, we can't extend them. For the same reason, anonymous
    classes cannot have explicitly declared constructors.

    In fact, the absence of a constructor doesn't represent any problem for us for the following reasons:
        - we create anonymous class instances at the same moment as we declare them
        - from anonymous class instances, we can access local variables and enclosing class's members
     */
    /*
        *Anonymous Class Properties - Static Members and Scope of Variables

    Anonymous classes cannot have any static members except for those that are constant.

    Anonymous classes capture local variables that are in the scope of the block in which we have declared the class. As
    we see, the local variables count and action2 are defined in the same block. For this reason, we can access count
    from within the class declaration.
    *Note that in order to be able to use local variables, they must be effectively final.
    Since JDK 8, it is not required anymore that we declare variables with the keyword final. Nevertheless, those
    variables must be final. Otherwise, we get a compilation error: "local variables referenced from an inner class must
    be final or effectively final". In order the compiler decides that a variable is, in fact, immutable, in the code,
    there should be only one place in which we assign a value to it.
    *Let us just mention that as every inner class, an anonymous class can access all members of its enclosing class.
     */
        int count = 1;
        // count = 4; // Compilation error: local variables referenced from an inner class must be final or effectively final
        Runnable action2 = new Runnable() {
            static final int x = 0;
            /*
            Will not throw compilation error "The field y cannot be declared static in a non-static inner type, unless
            initialized with a constant expression" because since JDK 8, it is not required anymore that we declare
            variables with the keyword final. Nevertheless, those variables must be final. Since y is static it is
            effectively final.
             */
            // static int y = 0;

            @Override
            public void run() {
                System.out.printf("Runnable with captured variables: count = %s, x = %s%n", count, x);
            }
        };
        actions.add(action2);

        for (Runnable a : actions) {
            a.run();
        }
    }

    /*
            *Anonymous Class Use Cases

        *Class Hierarchy and Encapsulation
    We should use inner classes in general use cases and anonymous ones in very specific ones in order to achieve a
    cleaner hierarchy of classes in our application. When using inner classes, we may achieve a finer encapsulation of
    the enclosing class's data. If we define the inner class functionality in a top-level class, then the enclosing
    class should have public or package visibility of some of its members. Naturally, there are situations when it is
    not very appreciated or even accepted.

        *Cleaner Project Structure
    We usually use anonymous classes when we have to modify on the fly the implementation of methods of some classes. In
    this case, we can avoid adding new *.java files to the project in order to define top-level classes. This is
    especially true if that top-level class would be used just one time.

        *UI Event Listeners
    In applications with a graphical interface, the most common use case of anonymous classes is to create various event
    listeners. For example, in the following snippet:
        button.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
            ...
            }
        }
    we create an instance of an anonymous class that implements interface ActionListener. Its actionPerformed method
    gets triggered when a user clicks the button. Since Java 8, lambda expressions seem to be a more preferred way though.

    Anonymous classes that we considered above are just a particular case of nested classes.
    *Generally, a nested class is a class that is declared inside another class or interface.
    Anonymous classes along with local and nonstatic member ones form the so-called inner classes. Together with static
    member classes, they form the nested classes.
     */
}
