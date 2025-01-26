package com.design.patterns.BehaviouralPatterns.IteratorPatternBehavioural;

public class ClientV2Issue {
    public static void main(String[] args){
        BookCollectionV2 bookCollection = new BookCollectionV2();
        bookCollection.addBook(new Book("Java Book"));
        bookCollection.addBook(new Book("C++ Book"));
        bookCollection.addBook(new Book("Python Book"));

        for(int i = 0; i < bookCollection.getBooks().size(); i++){
//            System.out.println(bookCollection.getBooks().get(i));
            // get(i) can't be applied on TreeSet => client code needs to be changed
        }
    }
}
