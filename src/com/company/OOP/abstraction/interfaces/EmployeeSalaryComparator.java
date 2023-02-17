package com.company.OOP.abstraction.interfaces;

import java.util.Comparator;

public class EmployeeSalaryComparator implements Comparator<Employee> {

    /*
        Behavioral Functionality

    We use interfaces to add certain behavioral functionality that can be used by unrelated classes. For instance,
    Comparable, Comparator, and Cloneable are Java interfaces that can be implemented by unrelated classes.
    Below is an example of the Comparator interface that is used to compare two instances of the Employee class.
     */
    @Override
    public int compare(Employee employeeA, Employee employeeB) {
        if (employeeA.getSalary() < employeeB.getSalary()) {
            return -1;
        }
        else if (employeeA.getSalary() > employeeB.getSalary()) {
            return 1;
        }
        else {
            return 0;
        }
    }
}
