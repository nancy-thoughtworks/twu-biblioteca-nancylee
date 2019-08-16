package com.twu.biblioteca;

import java.util.*;

/**
 * The Library class which holds the collection of items to lend and users
 */

public class Library {

    //private HashMap<Integer, Item> collection;
    private Inventory inventory;
    private HashMap<String, User> users;
    //private ArrayList<User> users;
    //private HashMap<Integer, Movie> movieCollection;



    public Library() {
        //this.collection = new HashMap<Integer, Item>();
        this.inventory = new Inventory();
        this.users = new HashMap<String, User>();
        //this.users = new ArrayList<User>();
        //this.movieCollection = new HashMap<Integer, Movie>();


    }

    public void create(Item item) {
        inventory.add(item);
    }
    public Inventory getInventory() {
        return inventory;
    }

    /*public void add(Item item) {
        this.collection.put(item.getID(), item);
    }*/

    public void createUser(String username, User user) {
        this.users.put(username, user);
    }


    /*

     */
    public boolean login(String username, String password) {
        User user = lookupUser(username);
        return user.authenticate(username, password);
    }

    public void getUserMenu(String username) {
        User u = lookupUser(username);
            u.getMenu();

    }

    private User lookupUser(String username) {
        return users.get(username);
    }



/*    private Item lookupItem(Integer id) {
        return collection.get(id);
    }

    public HashMap<Integer, Item> getItems() {
        return collection;
    }*/

    public HashMap<String, User> getUsers() {
        return users;
    }
    /*
    Prints all items in the list that are available
     */

/*    public void printList() {
        for (Map.Entry<Integer, Item> entry : collection.entrySet()) {
            if (entry.getValue().isAvailable()) {
                System.out.println(entry.getValue().toString());
            }
        }
    }*/

/*    public void borrow(Integer itemID) {
        Item i = this.collection.get(itemID);
        if (i.checkOut()) {
            System.out.println("Thank you! Enjoy the book");
        } else {
            System.out.println("Sorry that book is not available");
        }
    }*/


/*
    public void returnItem(Integer itemID) {
        Item i = this.collection.get(itemID);
        if (i!=null && !i.isAvailable()) {
            i.setAvailable(true);
            System.out.println( "Thank you for returning the book");

        } else {
            System.out.println( "That is not a valid book to return");
        }
    }*/



}
