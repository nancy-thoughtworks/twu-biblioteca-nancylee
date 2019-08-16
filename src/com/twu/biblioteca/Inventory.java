package com.twu.biblioteca;

import java.util.HashMap;
import java.util.Map;

public class Inventory {

    private HashMap<Integer, Item> collection;

    public Inventory() {
        this.collection = new HashMap<Integer, Item>();
    }

    public void add(Item item) {
        this.collection.put(item.getID(), item);
    }

    private Item lookupItem(Integer id) {
        return collection.get(id);
    }

    public HashMap<Integer, Item> getItems() {
        return collection;
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
