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
        Library bangaloreLibrary = new Library();


        System.out.println("Welcome to Biblioteca. your one-stop-shop for great book titles in Bangalore!");
        //HashMap<Integer, Book> booklist = new HashMap<Integer, Book>();
        //ArrayList<Book> booklist = new ArrayList<Book>();
        Book book1 = new Book(1, "The Yield", "Jane Winch", 1990, true);
        Book book2 = new Book(2, "Lonely Planet", "John Doe", 2000, true);
        Book book3 = new Book(3, "I am", "Jane Val", 2010, true);

 /*       booklist.put(book1.getID(), book1);
        booklist.put(book2.getID(), book2);
        booklist.put(book3.getID(), book3);*/

        bangaloreLibrary.addBook(book1);
        bangaloreLibrary.addBook(book2);
        bangaloreLibrary.addBook(book3);

        Movie m1 = new Movie(1, "The Shining", );
        Movie m2 = new Book(2, "Lonely Planet", "John Doe", 2000, true);
        Book book3 = new Book(3, "I am", "Jane Val", 2010, true);



        while(true) {

            //Print the options for the user to choose from
            System.out.println("*****Menu Options*****");
            System.out.println("*. Press s to see List of books");
            System.out.println("*. Press b to borrow a book");
            System.out.println("*. Press r to borrow a book");
            System.out.println("*. Press q to quit");

            //Menu menu = new Menu();
            menuOptions(bangaloreLibrary);

        }

    }

    public static void menuOptions(Library library) {
        Scanner scanner = new Scanner(System.in);
        char userInput = scanner.next().charAt(0);
        int bookID;
        switch (userInput) {
            case 's':
                library.printList();
                break;
            case 'b':
                System.out.println("Enter the book ID you wish to borrow");
                bookID = scanner.nextInt();
                //borrow(library, bookID);
                break;
            case 'r':
                System.out.println("Enter the book ID you wish to return");
                bookID = scanner.nextInt();
                //returnBook(library, bookID);
                break;
            case 'q':
                System.exit(0);
                break;
            default:
                System.out.println("Please select a valid option");

        }

    }

    public static void printList(ArrayList<Book> booklist) {
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
    }


    public static void borrow(HashMap<Integer, Book> booklist, Integer ID) {
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
    }



}
