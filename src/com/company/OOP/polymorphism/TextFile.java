package com.company.OOP.polymorphism;

public class TextFile extends GenericFile {

    /*
    *There are two core types of polymorphism:
    *   - static/compile-time/method-overloading polymorphism
    *   - dynamic/runtim/method-overriding polymorphism.
    Static polymorphism is enforced at compile time while dynamic polymorphism is realized at runtime.
     */

    private int wordCount;

    /*
        *Polymorphic Parameters

    Parametric polymorphism allows a name of a parameter or method in a class to be associated with different types.
    We have a typical example below where we define content as a String and later as an Integer.

    *It's also important to note that declaration of polymorphic parameters can lead to a problem known as variable
    *hiding where a local declaration of a parameter always overrides the global declaration of another parameter with
    *the same name.
    To solve this problem, it is often advisable to use global references such as this keyword to point
    to global variables within a local context.
     */
    private String content;
    public void setContentDelimiter() {
        int content = 100; // polymorphic parameter
        this.content = this.content + content;
    }

    public TextFile(String name, String content, String version) {
        String[] words = content.split(" ");
        this.setWordCount(words.length > 0 ? words.length : 1);
        this.setContent(content.getBytes());
        this.setName(name);
        this.setVersion(version);
        this.setExtension(".txt");
    }

    public int getWordCount() {
        return wordCount;
    }

    public void setWordCount(int wordCount) {
        this.wordCount = wordCount;
    }


    public String getFileInfo() {
        return "Text File Impl";
    }

    /*
        *Static Polymorphism

    *Static polymorphism is an imitation of polymorphism which is resolved at compile time and thus does away with run-time virtual-table lookups.

    In Java, the method with the same name can have different method signatures and perform different functions.
    For example, our TextFile class in a file manager app can have three methods with the same name but different parameters:
        - The parameters number should vary.
        - The parameter types should be different.
        - Different order of parameters. For example, if a method accepts a string and a long, while the other method
          accepts a long and a string.

    During code compilation, the compiler verifies that all invocations of the read method correspond to at least one of
    the three methods defined above.
     */
    public String read() {
        return this.getContent()
                .toString();
    }

    public String read(int limit) {
        return this.getContent()
                .toString()
                .substring(0, limit);
    }

    public String read(int start, int stop) {
        return this.getContent()
                .toString()
                .substring(start, stop);
    }
}
