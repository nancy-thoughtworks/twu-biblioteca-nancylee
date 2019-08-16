package com.twu.biblioteca;
import java.io.*;
import java.util.*;
import java.util.Scanner;
import java.util.HashMap;
import java.lang.reflect.Array;

/**
 * Entry point for the app
 */


public class BibliotecaApp {


    public static void main(String[] args) {
        Library bangaloreLibrary= new Library();

        System.out.println("Welcome to Biblioteca. your one-stop-shop for great book titles in Bangalore!");

        int ID = 1;
        Book book1 = new Book(ID, "The Yield", "Jane Winch", 1990, true);
        Book book2 = new Book(ID++, "Lonely Planet", "John Doe", 2000, true);
        Book book3 = new Book(ID++, "I am", "Jane Val", 2010, true);

 /*       booklist.put(book1.getID(), book1);
        booklist.put(book2.getID(), book2);
        booklist.put(book3.getID(), book3);*/

        bangaloreLibrary.add(book1);
        bangaloreLibrary.add(book2);
        bangaloreLibrary.add(book3);

        Movie m1 = new Movie(ID++, "The Shining", 2000, "J Cohen", true);
        Movie m2 = new Movie(ID++, "Fast and Furious", 2010, "Brad Pitt", false);

        bangaloreLibrary.add(m1);
        bangaloreLibrary.add(m2);


        //users.put();
        //Borrower b = new Borrower("321-4567", "mmm");
        //users.put("321-4567", b);
        bangaloreLibrary.createUser("111-1111", new Borrower("111-1111", "mmm", bangaloreLibrary.getItems(),"john doe","alskdj@jfdl.com", 4848444));

        bangaloreLibrary.createUser("123-3334", new Admin("123-3334", "a_password", bangaloreLibrary.getItems() ) );


        Scanner scanner = new Scanner(System.in);
        System.out.println("*****LOGIN*****");
        System.out.println("Enter username");
        String username = scanner.next();

        System.out.println("Enter password");
        String password = scanner.next();

        if (bangaloreLibrary.login(username, password)) {
            System.out.println("login success");
            bangaloreLibrary.getUserMenu(username);
        } else {
            System.out.println("login failure");
        }

        while(true) {


            //Print the options for the user to choose from
/*            System.out.println("*****Menu Options*****");
            System.out.println("*. Press s to see List of items");
            System.out.println("*. Press b to borrow an item");
            System.out.println("*. Press r to borrow an item");
            System.out.println("*. Press q to quit");

            //Menu menu = new Menu();
            menuOptions(bangaloreLibrary);*/

        }

    }

/*    public static void menuOptions(Library library) {
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
                library.borrow(itemID);
                break;
            case 'r':
                System.out.println("Enter the book ID you wish to return");
                itemID = scanner.nextInt();
                //library.returnItem(itemID);
                break;
            case 'q':
                System.exit(0);
                break;
            default:
                System.out.println("Please select a valid option");

        }

    }*/

/*    public static void printList(ArrayList<Book> booklist) {
        for (Book b : booklist) {
            System.out.println(b);
        }
    }


    public static void printList(HashMap<Integer, Book> booklist) {
        for (Map.Entry<Integer, Book> entry : booklist.entrySet()) {
            if (entry.getValue().isAvailable()) {
                System.out.println(entry.getValue().toString());
            }

        }
    }*/


/*    public static void borrow(HashMap<Integer, Book> booklist, Integer ID) {
        Book b = booklist.get(ID);
        if (b!=null && b.isAvailable()) {
            b.setAvailable(false);
            System.out.println("Thank you! Enjoy the book");

        } else {
            System.out.println("Sorry that book is not available");
        }
    }

    public static void returnBook(HashMap<Integer, Book> booklist, Integer ID) {
        Book b = booklist.get(ID);
        if (b!=null && !b.isAvailable()) {
            b.setAvailable(true);
            System.out.println("Thank you for returning the book");

        } else {
            System.out.println("That is not a valid book to return");
        }
    }*/



}
