package com.twu.biblioteca;
import java.util.HashMap;
import java.util.Scanner;

/***
 * User menu to show to borrowers
 */

public class UserMenu implements Menu {
    private Inventory library;
    private User user;

    public UserMenu(Inventory collection) {
        this.library = collection;
        //this.user = user;
    }

    public void show() {

            System.out.println("*****Menu Options*****");
            System.out.println("*. Press s to see List of items");
            System.out.println("*. Press b to borrow an item");
            System.out.println("*. Press r to borrow an item");
            System.out.println("*. Press q to quit");
        Scanner scanner = new Scanner(System.in);
        char userInput = scanner.next().charAt(0);
        int itemID;
        switch (userInput) {
            case 's':
                library.printList();
                break;
            case 'b':
                System.out.println("Enter the item ID you wish to borrow");
                itemID = scanner.nextInt();
                library.checkout(itemID);
                //user.borrow(itemID);
                break;
            case 'r':
                System.out.println("Enter the book ID you wish to return");
                itemID = scanner.nextInt();
                library.returnItem(itemID);
                break;
            case 'q':
                System.exit(0);
                break;
            default:
                System.out.println("Please select a valid option");

        }

    }
/*
    public boolean authenticate(String username, String pass) {
        return this.username.equals(username) && this.password.equals(pass);
    }*/
}
