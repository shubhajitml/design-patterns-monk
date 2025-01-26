package com.design.patterns.BehaviouralPatterns.IteratorPatternBehavioural;


import java.util.List;

public class ListBasedConcreteIterator implements MyIterator<Book> {
    private List<Book> books;
    private int position = 0;

    public ListBasedConcreteIterator(List<Book> books){
        this.books = books;
    }

    @Override
    public boolean hasNext() {
        return position < books.size();
    }

    @Override
    public Book next() {
        return books.get(position++);
    }
}
