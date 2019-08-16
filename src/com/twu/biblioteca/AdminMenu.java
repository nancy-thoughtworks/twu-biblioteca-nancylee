package com.twu.biblioteca;

import java.util.HashMap;

public class AdminMenu implements Menu {
    private Inventory collection;

    public AdminMenu(Inventory collection) {
        this.collection = collection;
    }

    public void show() {
        System.out.println("Users who have borrowed...");
/*        for (HashMap.Entry<Integer, Item> entry : collection.entrySet()) {
            if (!entry.getValue().isAvailable()) {
                System.out.println(entry.getValue().getLoanDetails()
                );
            }

        }*/
    }
}
