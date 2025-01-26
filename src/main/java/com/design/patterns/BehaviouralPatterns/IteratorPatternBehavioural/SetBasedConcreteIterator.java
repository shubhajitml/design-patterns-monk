package com.design.patterns.BehaviouralPatterns.IteratorPatternBehavioural;

import java.util.Set;

public class SetBasedConcreteIterator implements MyIterator<Book> {
    private java.util.Iterator<Book> iterator;

    public SetBasedConcreteIterator(Set<Book> books) {
        this.iterator = books.iterator();
    }
    @Override
    public boolean hasNext() {
        return iterator.hasNext();
    }

    @Override
    public Book next() {
        return iterator.next();
    }
}
