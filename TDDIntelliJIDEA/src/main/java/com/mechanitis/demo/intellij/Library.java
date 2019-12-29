package com.mechanitis.demo.intellij;

import java.util.BitSet;
import java.util.LinkedList;
import java.util.List;

public class Library {
    private List<Book> books;

    public Library() {
        books = new LinkedList<Book>();
    }

    public void addBook(Book book) {
        books.add(book);
    }

    public Integer getTotalBookNumber() {
        return books.size();
    }

    public List<Book> getBookByCategory(String category) {
        List<Book> grouped = new LinkedList<Book>();
        for (Book book : books){
            if (book.getCategory().equals(category)){
                grouped.add(book);
            }
        }
        return grouped;
    }

    public int getBookCount(String name) {
        int bookCount = 0;
        for (Book book : books) {
            if (book.getName().equals(name)){
                bookCount++;
            }
        }
        return bookCount;
    }

    public Book borrowBook(String name) {
        Book book = null;
        if (getBookCount(name) == 0) {
            return null;
        }
        for (int i = 0; i < books.size(); i++) {
            if (books.get(i).getName().equals(name)){
                book = books.remove(i);
                break;
            }
        }
        return book;
    }

    public void returnBook(Book book) {
        books.add(book);
    }
}
