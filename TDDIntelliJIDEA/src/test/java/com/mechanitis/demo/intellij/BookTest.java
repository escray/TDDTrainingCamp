package com.mechanitis.demo.intellij;

import org.hamcrest.CoreMatchers;
import org.junit.Assert;
import org.junit.Test;

public class BookTest {
    @Test
    public void shouldAddBookToLibrary(){
        Library library = new Library();
        Book book = new Book("The ruby programming language", "Development");
        library.addBook(book);
        Assert.assertThat(library.getTotalBookNumber(), CoreMatchers.is(1));
    }

    @Test
    public void shouldGetBooksByCategory() {
        Library library = new Library();
        Book book1 = new Book("The ruby Programming language", "Development");
        Book book2 = new Book("The python programming language", "Development");
        Book book3 = new Book("The lean startup", "Business");
        library.addBook(book1);
        library.addBook(book2);
        library.addBook(book3);
        Assert.assertThat(library.getBookByCategory("Development").size(), CoreMatchers.is(2));
    }

    @Test
    public void shouldCanReturnBookToLibrary() {
        Library library = new Library();
        String bookName = "The ruby programming language";
        Book originBook = new Book(bookName, "Development");
        library.addBook(originBook);
        Assert.assertThat(library.getBookCount(bookName), CoreMatchers.is(1));
        Book borrowed = library.borrowBook(bookName);
        Assert.assertThat(library.getBookCount(bookName), CoreMatchers.is(0));
        library.returnBook(borrowed);
        Assert.assertThat(library.getBookCount(bookName), CoreMatchers.is(1));
    }
}
