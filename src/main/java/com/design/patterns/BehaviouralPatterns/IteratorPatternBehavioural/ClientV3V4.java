package com.design.patterns.BehaviouralPatterns.IteratorPatternBehavioural;

public class ClientV3V4 {
    public static void main(String[] args){
//        BookCollectionV3 bookCollection = new BookCollectionV3();
        BookCollectionV4final bookCollection = new BookCollectionV4final();
        // works with both List based and set based iterator, without changing client code

        bookCollection.addBook(new Book("Java Book"));
        bookCollection.addBook(new Book("C++ Book"));
        bookCollection.addBook(new Book("Python Book"));

        MyIterator<Book> bookIterator = bookCollection.createIterator();
        while(bookIterator.hasNext()){
            Book book = bookIterator.next();
            System.out.println(book);
        }

    }
}
