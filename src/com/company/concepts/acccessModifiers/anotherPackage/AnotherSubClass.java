package com.company.concepts.acccessModifiers.anotherPackage;

import com.company.concepts.acccessModifiers.SuperPublic;

public class AnotherSubClass extends SuperPublic {
    public AnotherSubClass() {
        SuperPublic.protectedMethod(); // Available in subclass. Let's note different package.
    }
}
