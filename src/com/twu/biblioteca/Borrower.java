package com.twu.biblioteca;

import java.util.ArrayList;
import java.util.HashMap;

public class Borrower extends User {
    private String name;
    private String email;
    private int phone;
    private ArrayList<Item> itemsLoaned;
    private UserMenu menu;

    public Borrower(String username, String password, Inventory collection, String name, String email, int phone) {
        super(username, password, collection);
        this.name = name;
        this.email = email;
        this.phone = phone;
        this.itemsLoaned = new ArrayList<Item>();
        this.menu = new UserMenu(collection);
    }

    public void getMenu() {
        System.out.println("Welcome " + toString());

        menu.show();
    }

    public String toString()
    {
        return this.name +"\n"+  "email: " + this.email+ "\nphone:" + this.phone;
    }


    public boolean borrow(Item i) {
        //Item i = this.collection.get(itemID);
        if (i.checkOut()) {
            i.setAvailable(false);
            itemsLoaned.add(i);
            System.out.println("Thank you! Enjoy the book");
            return true;
        } else {
            System.out.println("Sorry that book is not available");
            return false;
        }
    }

    public boolean returnItem(Item i) {
        //Item i = this.collection.get(itemID);
        if (i != null && !i.isAvailable()) {
            i.setAvailable(true);
            System.out.println("Thank you for returning the book");
            return true;

        } else {
            System.out.println("That is not a valid book to return");
            return false;
        }
    }
}
