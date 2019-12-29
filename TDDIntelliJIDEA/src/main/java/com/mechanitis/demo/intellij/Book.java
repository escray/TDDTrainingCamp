package com.mechanitis.demo.intellij;

public class Book {

    String name;
    String category;

    public Book(String name, String category) {
        this.name = name;
        this.category = category;
    }

    public String getCategory() {
        return this.category;
    }

    public String getName() {
        return this.name;
    }
}
