package com.twu.biblioteca;

import java.util.*;

/**
 * The Library class which holds the collection of items to lend and users
 */

public class Library {

    private HashMap<Integer, Item> collection;
    private HashMap<String, User> users;
    //private ArrayList<User> users;
    //private HashMap<Integer, Movie> movieCollection;

    private Admin admin;
    private User user;


    public Library() {
        this.collection = new HashMap<Integer, Item>();
        this.users = new HashMap<String, User>();
        //this.users = new ArrayList<User>();
        //this.movieCollection = new HashMap<Integer, Movie>();

        this.user = new User("321-4567", "mmm");
        users.put("123-3334", new Admin("123-3334", "a_password"));
    }


    public void add(Item item) {
        this.collection.put(item.getID(), item);
    }

    public void add(String username, User user) {
        this.users.put(username, user);
    }

    /*

     */
    public boolean login(String username, String password) {
        User user = lookupUser(username);
        return user.authenticate(username, password);

    }

    private User lookupUser(String username) {
        return users.get(username);
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
