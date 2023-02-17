package com.company.concepts.anonymousClasses;

public class Book {

    final String title;

    public Book(String title) {
        this.title = title;
    }

    public String description() {
        return "Title: " + title;
    }
}
