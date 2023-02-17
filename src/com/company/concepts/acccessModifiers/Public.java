package com.company.concepts.acccessModifiers;

public class Public {

    public Public() {
        SuperPublic.defaultMethod(); // Available in the same package 'accessModifiers'.
        SuperPublic.publicMethod(); // Available everywhere.
        SuperPublic.protectedMethod(); // Available in the same package 'accessModifiers'.
    }
}
