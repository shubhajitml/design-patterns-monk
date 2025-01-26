package com.design.patterns.BehaviouralPatterns.IteratorPatternBehavioural;

import java.util.Iterator;
import java.util.Set;
import java.util.TreeSet;

public class BookCollectionV5final implements Iterable<Book> {
    private Set<Book> books = new TreeSet<>();

    public void addBook(Book book){
        books.add(book);
    }

    @Override
    public Iterator<Book> iterator() {
        return books.iterator();
    }
}
