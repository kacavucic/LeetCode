package com.company.concepts.publicAccessModifier;

import java.math.BigDecimal;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.util.Date;
import java.util.HashMap;
import java.util.Map;

public class Example {

    /*
    Public classes and interfaces, along with public members, define an API. It's that part of our code that others can
    see and use to control the behavior of our objects.

    However, overusing the public modifier violates the Object-Oriented Programming (OOP) encapsulation principle and
    has a few downsides:
        - It increases the size of an API, making it harder for clients to use
        - It's becoming harder to change our code because clients rely on it — any future changes might break their code
     */

    /*
        Public Interfaces

        A public interface defines a specification that can have one or more implementations. These implementations can
        be either provided by us or written by others.

        For example, the Java API exposes the Connection interface to define database connection operations,
        leaving actual implementation to each vendor. At run-time, we get the desired connection based on the
        project setup.

        Interface can only have public or default access modifier.
     */

    // The getConnection method returns an instance of a technology-specific implementation.
    public Connection getConnection() throws SQLException {

        final String URL = "jdbc:h2:~/test";
        return DriverManager.getConnection(URL, "sa", "");

    }

    /*
        Public Classes

        We define public classes so that clients can use their members by instantiation and static referencing.
     */

    int instanceMember = new BigDecimal(0).intValue();
    int staticMember = Integer.MAX_VALUE;

    /*
    Similar to public top-level classes and interfaces, nested public classes and interfaces define an API datatype.
    However, they are particularly useful in two ways:
        - They indicate to the API end user that the enclosing top-level type and its enclosed types have a logical
          relationship and are used together
        - They make our codebase more compact by reducing the number of source code files that we would've used if
          we'd declared them as top-level classes and interfaces

    Public (or default) class can be nested in another public (or default) class or interface.
    Public (or default) interface can be nested in another public (or default) interface or class.

    An example is the Map.Entry interface from the core Java API
    Making Map.Entry a nested interface strongly relates it to the java.util.Map interface and has saved us from
    creating another file inside the java.util package.
     */

    public void someMethod() {
        Map<String, String> mapObject = new HashMap<>();
        for (Map.Entry<String, String> entry : mapObject.entrySet()) {
        }
    }

    /*
        Public Methods

        Public methods enable users to execute ready-made operations.
        An example is the public toLowerCase method in the String API

        We can safely make a public method static if it doesn't use any instance fields.
        The parseInt method from the Integer class is an example of a public static method.

        Constructors are usually public so that we can instantiate and initialize objects,
        although sometimes they might be private like in singletons.
     */

    String alex = "ALEX".toLowerCase();
    int one = Integer.parseInt("1");

    /*
        Public Fields

        Public fields allow changing the state of an object directly. The rule of thumb is that we shouldn't
        use public fields.
     */

    /*
        Thread-Safety

        Using public visibility with non-final fields or final mutable fields is not thread-safe. We can't control
        changing their references or states in different threads.
     */

    /*
        Taking Actions on Modifications

        We have no control over a non-final public field because its reference or state can be set directly.
        Instead, it's better to hide the fields using a private modifier and use a public setter.
     */

    private int age;

    public void setAge(int age) {
        if (age < 0 || age > 150) {
            throw new IllegalArgumentException();
        }

        this.age = age;
    }

    public int getAge() {
        return age;
    }

    /*
        Changing the Data Type

        Public fields, mutable or immutable, are part of the client's contract. It's harder to change the data
        representation of these fields in a future release because clients may need to refactor their implementations.
        By giving fields private scope and using accessors, we have the flexibility to change the internal
        representation while maintaining the old data type as well.
     */

    //    private int grade; // old data representation
    private StudentGrade grade; // new data representation

    public int getGrade() {
        return this.grade.getGrade().intValue(); // int is returned for backward compatibility
    }

    public void setGrade(int grade) {
        this.grade = new StudentGrade(grade);
    }

    private class StudentGrade {
        private BigDecimal grade = BigDecimal.ZERO;
        private Date updatedAt;

        public StudentGrade(int grade) {
            this.grade = new BigDecimal(grade);
            this.updatedAt = new Date();
        }

        public BigDecimal getGrade() {
            return grade;
        }

        public Date getDate() {
            return updatedAt;
        }
    }

    /*
    The only exception for using public fields is the use of static final immutable fields to represent constants.
     */

    public static final String SLASH = "/";
}
