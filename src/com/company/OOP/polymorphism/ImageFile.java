package com.company.OOP.polymorphism;

import java.awt.image.BufferedImage;

public class ImageFile extends GenericFile {

    /*
    *There are two core types of polymorphism:
    *   - static/compile-time/method-overloading polymorphism
    *   - dynamic/runtime/method-overriding polymorphism.
    Static polymorphism is enforced at compile time while dynamic polymorphism is realized at runtime.
     */

    private int height;
    private int width;

    public ImageFile(String name, int height, int width, byte[] content, String version) {
        this.setHeight(height);
        this.setWidth(width);
        this.setContent(content);
        this.setName(name);
        this.setVersion(version);
        this.setExtension(".jpg");
    }

    public ImageFile() {

    }

    public int getHeight() {
        return height;
    }

    public void setHeight(int height) {
        this.height = height;
    }

    public int getWidth() {
        return width;
    }

    public void setWidth(int width) {
        this.width = width;
    }

    /*
        *Dynamic Polymorphism

    *With dynamic polymorphism, the Java Virtual Machine (JVM) handles the detection of the appropriate method to execute
    *when a subclass is assigned to its parent form.
    This is necessary because the subclass may override some or all of the methods defined in the parent class.

    Subclass ImageFile overrides getFileInfo() method defined in superclass GenericFile.
     */
    public String getFileInfo() {
        return "Image File Impl";
    }

    public static void main(String[] args) {
        /*
        When we create an instance of ImageFile and assign it to a GenericFile class, an implicit cast is done. However,
        the JVM keeps a reference to the actual form of ImageFile.

        As expected, genericFile.getFileInfo() triggers the getFileInfo() method of the ImageFile class.

        *The above construct is analogous to method overriding.
         */
        GenericFile genericFile = new ImageFile("SampleImageFile", 200, 100,
                new BufferedImage(100, 200, BufferedImage.TYPE_INT_RGB)
                        .toString()
                        .getBytes(), "v1.0.0");

        System.out.println("File Info: \n" + genericFile.getFileInfo()); // prints "Image File Impl"


        /*
            *Coercion

        Polymorphic coercion deals with implicit type conversion done by the compiler to prevent type errors. A typical
        example is seen in an integer and string concatenation
         */
        String s = "string" + 2;
        System.out.println(s); // prints "string2"

        /*
            *Operator Overloading

        Operator overloading refers to a polymorphic characteristic of same symbol or operator having different meanings
        (forms) depending on the context.

        For example, the plus symbol (+) can be used for mathematical addition as well as String concatenation. In
        either case, only context (i.e. argument types) determines the interpretation of the symbol
         */
        String str = "2" + 2;
        int sum = 2 + 2;
        System.out.printf(" str = %s\n sum = %d\n", str, sum); // str = 22 sum = 4

        /*
            *Polymorphic Subtypes

        Polymorphic subtype conveniently makes it possible for us to assign multiple subtypes to a type and expect all
        invocations on the type to trigger the available definitions in the subtype.

        For example, if we have a collection of GenericFiles and we invoke the getFileInfo() method on each of them, we can
        expect the output to be different depending on the subtype from which each item in the collection was derived.

        *Subtype polymorphism is made possible by a combination of upcasting and late binding.
         */
        GenericFile[] files = {
                new ImageFile("SampleImageFile", 200, 100,
                        new BufferedImage(100, 200, BufferedImage.TYPE_INT_RGB).toString().getBytes(), "v1.0.0"),
                new TextFile("SampleTextFile", "This is a sample text content", "v1.0.0")};

        for (int i = 0; i < files.length; i++) {
            System.out.println(files[i].getFileInfo());
        }

        /*
        Upcasting involves the casting of inheritance hierarchy from a subtype to a supertype.
        GenericFile file = (GenericFile) imageFile;
         */
        ImageFile imageFile = new ImageFile();
        GenericFile file = imageFile;
        /*
        The resulting effect of the above is that ImageFile-specific methods cannot be invoked on the new upcast GenericFile.
         */
        // file.getHeight(); // this won't compile

        /*
        However, methods in the subtype override similar methods defined in the supertype.
        For example method: getFileInfo().
        Method overriding always depends on type of object type(right side of equation), and not class type (left side).

        *Late binding strategy helps the compiler to resolve whose method to trigger after upcasting.
        In the case of imageFile#getFileInfo vs file#getFileInfo in the above example, the compiler keeps a reference to
        ImageFile‘s getFileInfo method.
         */
        System.out.println(file.getFileInfo()); // prints "Image File Impl".
        System.out.println("Class: " + file.getClass());

        /*
        To resolve the problem of not being able to invoke subtype-specific methods when upcasting to a supertype, we
        can do a downcasting of the inheritance from a supertype to a subtype.
         */
        ImageFile newImageFile = (ImageFile) file; // downcasting
        newImageFile.getFileInfo(); // compiles

        /*
            *Type Identification During Downcasting

        Recall that we earlier lost access to some subtype-specific methods after performing an upcast. Although we were
        able to solve this with a downcast, this does not guarantee actual type checking.
        We notice that the compiler allows a downcast of a GenericFile into an ImageFile, even though the class actually
        is a GenericFile and not an ImageFile, but the JVM performs a Run-Time Type Information (RTTI) check and throws
        ClassCastException.
         */
        GenericFile fileA = new GenericFile();
        // ImageFile imageFileA = (ImageFile) fileA; // ClassCastException: class GenericFile cannot be cast to class ImageFile
        /*
        We can attempt an explicit type identification by using the instanceof keyword.
        The above helps to avoid a ClassCastException exception at runtime. Another option that may be used is wrapping
        the cast within a try and catch block and catching the ClassCastException.

        *It should be noted that RTTI check is expensive due to the time and resources needed to effectively verify that
        *a type is correct. In addition, frequent use of the instanceof keyword almost always implies a bad design.
         */
        ImageFile imageFileA;
        if (fileA instanceof ImageFile) {
            imageFileA = (ImageFile) fileA;
        }

    }

    public String read() {
        return this.getContent()
                .toString();
    }
}
