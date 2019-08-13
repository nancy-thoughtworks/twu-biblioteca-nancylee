package com.twu.biblioteca;
import java.io.*;
import java.util.*;
import java.util.Scanner;
import java.util.HashMap;
import java.lang.reflect.Array;

public class BibliotecaApp {

    public static void main(String[] args) {
        System.out.println("Welcome to Biblioteca. your one-stop-shop for great book titles in Bangalore!");
        HashMap<Integer, Book> booklist = new HashMap<Integer, Book>();
        //ArrayList<Book> booklist = new ArrayList<Book>();
        Book book1 = new Book(1, "The Yield", "Jane Winch", 1990);
        Book book2 = new Book(2, "Lonely Planet", "John Doe", 2000);
        Book book3 = new Book(3, "I am", "Jane Val", 2010);
        /*booklist.add(book1);
        booklist.add(book2);
        booklist.add(book3);
         */

        booklist.put(book1.getID(), book1);
        booklist.put(book2.getID(), book2);
        booklist.put(book3.getID(), book3);



        while(true) {
            Scanner scanner = new Scanner(System.in);
            //Print the options for the user to choose from
            System.out.println("*****Menu Options*****");
            System.out.println("*. Press s to see List of books");
            System.out.println("*. Press b to borrow a book");
            System.out.println("*. Press q to quit");

            char userInput = scanner.next().charAt(0);

            switch (userInput) {
                case 's':
                    printList(booklist);
                    break;
                case 'b':
                    System.out.println("Enter the book ID you wish to borrow");
                    int bookID = scanner.nextInt();
                    borrow(booklist, bookID);
                    break;
                case 'q':
                    System.exit(0);
                    break;
                default:
                    System.out.println("Please select a valid option");

            }


        }

    }

/*
    public static void printList(ArrayList<Book> booklist) {
        for (Book b : booklist) {
            System.out.println(b);
        }
    }
    */

    public static void printList(HashMap<Integer, Book> booklist) {
        for (Map.Entry<Integer, Book> entry : booklist.entrySet()) {
            if (entry.getValue().isAvailable()) {
                System.out.println(entry.getValue().toString());
            }

        }
    }


    public static void borrow(HashMap<Integer, Book> booklist, Integer ID) {
        if (booklist.get(ID).isAvailable()) {
            booklist.get(ID).setAvailable(false);
            System.out.println("Thank you! Enjoy the book");

        } else {
            System.out.println("Sorry that book is not available");
        }
    }



}
