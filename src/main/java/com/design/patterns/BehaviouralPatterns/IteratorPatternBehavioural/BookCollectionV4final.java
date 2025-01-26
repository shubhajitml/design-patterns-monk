package com.design.patterns.BehaviouralPatterns.IteratorPatternBehavioural;

import java.util.Set;
import java.util.TreeSet;

public class BookCollectionV4final {
    private Set<Book> books = new TreeSet<>();

    public void addBook(Book book) {
        books.add(book);
    }

    public Set<Book> getBooks() {
        return books;
    }

    public MyIterator<Book> createIterator() {
        return new SetBasedConcreteIterator(this.books);
    }
}
