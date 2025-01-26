package com.design.patterns.BehaviouralPatterns.IteratorPatternBehavioural;

import java.util.TreeSet;

public class BookCollectionV2 {

    private TreeSet<Book> books = new TreeSet<>();
    // if changing the data structure to TreeSet<>, Client code also needs to change for accessing

    public void addBook(Book book) {
        books.add(book);
    }

    public TreeSet<Book> getBooks() {
        return books;
    }
}
