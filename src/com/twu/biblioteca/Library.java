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
        this.collection.put(item.getID(), item);
    }


    /*
    Prints all items in the list that are available
     */

    public void printList() {
        for (Map.Entry<Integer, Item> entry : collection.entrySet()) {
            if (entry.getValue().isAvailable()) {
                System.out.println(entry.getValue().toString());
            }
        }
    }

    public void borrow(Integer itemID) {
        Item i = this.collection.get(itemID);
        if (i.checkOut()) {
            System.out.println("Thank you! Enjoy the book");
        } else {
            System.out.println("Sorry that book is not available");
        }
    }

    public void returnItem(Integer itemID) {
        Item i = this.collection.get(itemID);
        if (i!=null && !i.isAvailable()) {
            i.setAvailable(true);
            System.out.println( "Thank you for returning the book");

        } else {
            System.out.println( "That is not a valid book to return");
        }
    }



}
