package com.company.concepts.acccessModifiers.anotherPackage;

import com.company.concepts.acccessModifiers.SuperPublic;

public class AnotherPublic {
    public AnotherPublic() {
        SuperPublic.publicMethod(); // Available everywhere. Let's note different package.
    }
}
