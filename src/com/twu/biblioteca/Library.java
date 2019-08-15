package com.twu.biblioteca;

import java.util.HashMap;
import java.util.Map;


public class Library {

    private HashMap<Integer, Book> bookCollection;
    private HashMap<Integer, Movie> movieCollection;


    public Library(HashMap<Integer, Book> bookCollection, HashMap<Integer, Movie> movieCollection) {
        this.bookCollection = new HashMap<Integer, Book>();
        this.movieCollection = new HashMap<Integer, Movie>();
    }




}
