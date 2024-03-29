package com.twu.biblioteca;

import java.util.HashMap;
import java.util.Map;

/**
 * Inventory class holding the collection of items
 */
public class Inventory {

    private static Inventory inventory = new Inventory();

    private HashMap<Integer, Item> collection;

    public Inventory() {
        this.collection = new HashMap<Integer, Item>();
    }

    public void add(Item item) {
        this.collection.put(item.getID(), item);
    }

    public Item lookupItem(Integer id) {
        return collection.get(id);
    }

    public HashMap<Integer, Item> getItems() {
        return collection;
    }

    public static Inventory getInstance() {
        return inventory;
    }

    public void checkout(Integer itemID) {
        Item i = lookupItem(itemID);
        if (i.checkOut()) {
            i.setAvailable(false);
            System.out.println("Thank you! Enjoy the book");
        } else {
            System.out.println("Sorry that book is not available");
        }
    }

    public void returnItem(Integer itemID) {
        Item i = collection.get(itemID);
        if (i!=null && !i.isAvailable()) {
            i.setAvailable(true);
            System.out.println( "Thank you for returning the book");

        } else {
            System.out.println( "That is not a valid book to return");
        }
    }

    public void printList() {
        for (Map.Entry<Integer, Item> entry : collection.entrySet()) {
            if (entry.getValue().isAvailable()) {
                System.out.println(entry.getValue().toString());
            }
        }
    }

    public void printLoaned() {
        for (HashMap.Entry<Integer, Item> entry : collection.entrySet()) {
            if (!entry.getValue().isAvailable()) {
                System.out.println(entry.getValue().getLoanDetails()
                );
            }

        }

    }


}
