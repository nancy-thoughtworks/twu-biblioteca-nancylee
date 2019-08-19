package com.twu.biblioteca;

import java.util.HashMap;

/***
 * Admin menu to show to librarian
 */
public class AdminMenu implements Menu {
    private Inventory collection;

    public AdminMenu(Inventory collection) {
        this.collection = collection;
    }

    public void show() {
        System.out.println("Users who have borrowed...");
        collection.printLoaned();
/*        for (HashMap.Entry<Integer, Item> entry : collection.entrySet()) {
            if (!entry.getValue().isAvailable()) {
                System.out.println(entry.getValue().getLoanDetails()
                );
            }

        }*/
    }
}
