package com.company.OOP.inheritance;

public interface SpaceTraveller extends Floatable, Flyable {

    /*
        *Interfaces Extending Other Interfaces

    An interface can extend multiple interfaces.
    An interface inherits other interfaces by using the keyword extends.
    Classes use the keyword implements to inherit an interface.
     */

    int duration = 10;

    void remoteControl();

    /*
    For repair() method the issue with multiple inheritances is the same, so we must override it here, and additionally
    mark it as default since SpaceTraveller is interface.
     */
    @Override
    default void repair() {
        Floatable.super.repair();
    }

}
