package com.twu.biblioteca;

import java.util.HashMap;
import java.util.Map;


public class Library {

    private HashMap<Integer, Book> bookCollection;
    private HashMap<Integer, Movie> movieCollection;


    public Library() {
        this.bookCollection = new HashMap<Integer, Book>();
        this.movieCollection = new HashMap<Integer, Movie>();
    }


    public void add(Book book) {
        this.bookCollection.put(book.getID(), book);
    }

    public void add(Movie movie) {
        this.movieCollection.put(movie.getID(), movie);
    }

    /*
    Prints all items in the book list that are available
     */

    public void printList() {
        for (Map.Entry<Integer, Book> entry : bookCollection.entrySet()) {
            if (entry.getValue().isAvailable()) {
                System.out.println(entry.getValue().toString());
            }
        }
    }

    public boolean borrow(Book book) {

    }


}
