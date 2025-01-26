package com.design.patterns.BehaviouralPatterns.IteratorPatternBehavioural;

import java.util.ArrayList;
import java.util.List;

public class BookCollectionV1 {
    private ArrayList<Book> books = new ArrayList<>();

    public void addBook(Book book) {
        books.add(book);
    }

    public List<Book> getBooks() {
        return books;
    }
}
