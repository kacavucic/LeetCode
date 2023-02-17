package com.company.concepts.privateAccessModifier;

public class Employee {

    /*
    The private access modifier is important because it allows encapsulation and information hiding, which are core
    principles of object-oriented programming. Encapsulation is responsible for bundling methods and data, while
    information hiding is a consequence of encapsulation — it hides an object's internal representation.

    The first thing to remember is that elements declared as private can be accessed only by the class in
    which they're declared.
     */

    /*
    We marked the privateId variable as private because we want to add some logic to the id generation.
    And, as we can see, we did the same thing with position attribute because we don't want to allow direct modification
    of this field.
     */
    private String privateId;
    private String name;
    private String position;

    // By marking our constructor as private, we can use it only from inside our class.
    private Employee(String id, String name, String position) {
        this.privateId = id + "_ID";
        this.name = name;
        this.position = position;
    }

    // A static method that will be our only way to use this private constructor from outside the Employee class.
    public static Employee buildEmployee(String id, String name) {
        return new Employee(id, name, "Salesman");
    }

    // A private setter for position field.
    private void setPosition(String position) {
        this.position = position;
    }

    /*
    And let's suppose, for some reason, we have an arbitrary rule in our company in which only an employee
    named “Carl” can be promoted to manager position, although other classes aren't aware of this. We'll create a public
    method with some logic to handle this rule that calls our private method.
     */
    public void elevateToManager() {
        if ("Carl".equals(this.name)) {
            setPosition("Manager");
        }
    }

}
