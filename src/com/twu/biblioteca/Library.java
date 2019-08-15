package com.twu.biblioteca;

import java.util.HashMap;
import java.util.Map;


public class Library {

    private HashMap<Integer, Item> collection;
    //private HashMap<Integer, Movie> movieCollection;


    public Library() {
        this.collection = new HashMap<Integer, Item>();
        //this.movieCollection = new HashMap<Integer, Movie>();
    }


    public void add(Item item) {
        this.bookCollection.put(item.getID(), item);
    }


    /*
    Prints all items in the list that are available
     */

    public void printList() {
        for (Map.Entry<Integer, Item> entry : bookCollection.entrySet()) {
            if (entry.getValue().isAvailable()) {
                System.out.println(entry.getValue().toString());
            }
        }
    }

    /*public boolean borrow(Book book) {

    }*/


}
