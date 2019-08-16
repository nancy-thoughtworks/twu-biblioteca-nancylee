package com.twu.biblioteca;

import java.util.*;
import java.util.HashMap;
/**
 * Abstract user class
 */
public abstract class User {
    private String username;
    private String password;
    private Inventory collection;


    public User(String username, String password, Inventory collection) {
        this.username = username;
        this.password = password;
        this.collection = collection;

    }

    public boolean authenticate(String username, String pass) {
        return this.username.equals(username) && this.password.equals(pass);

    }



 /*   public boolean login() {
        return correctPassword && correctUsername;
    }*/

    public abstract void getMenu();

/*    public boolean borrow(Integer itemID) {
        Item i = this.collection.get(itemID);
        if (i.checkOut()) {
            i.setAvailable(false);
            System.out.println("Thank you! Enjoy the book");
            return true;
        } else {
            System.out.println("Sorry that book is not available");
            return false;
        }
    }

    public boolean returnItem(Integer itemID) {
        Item i = this.collection.get(itemID);
        if (i != null && !i.isAvailable()) {
            i.setAvailable(true);
            System.out.println("Thank you for returning the book");
            return true;

        } else {
            System.out.println("That is not a valid book to return");
            return false;
        }
    }*/




}
