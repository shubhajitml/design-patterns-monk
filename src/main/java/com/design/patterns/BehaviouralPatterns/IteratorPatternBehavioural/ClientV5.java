package com.design.patterns.BehaviouralPatterns.IteratorPatternBehavioural;

import java.util.Iterator;

public class ClientV5 {
    public static void main(String[] args) {
        BookCollectionV5final bookCollection = new BookCollectionV5final();
        bookCollection.addBook(new Book("Java Book"));
        bookCollection.addBook(new Book("C++ Book"));
        bookCollection.addBook(new Book("Python Book"));

        Iterator<Book> bookIterator = bookCollection.iterator(); //standardized way
        while(bookIterator.hasNext()){
            Book book = bookIterator.next();
            System.out.println(book);
        }
    }
}
