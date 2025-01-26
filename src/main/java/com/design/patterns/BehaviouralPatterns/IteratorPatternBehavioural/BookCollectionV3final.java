package com.design.patterns.BehaviouralPatterns.IteratorPatternBehavioural;

import java.util.ArrayList;
import java.util.List;


public class BookCollectionV3final {
    private ArrayList<Book> books = new ArrayList<>(); // List based

    public void addBook(Book book) {
        books.add(book);
    }

    public List<Book> getBooks() {
        return books;
    }

    public MyIterator<Book> createIterator() {
        return new ListBasedConcreteIterator(this.books);
    }
}
