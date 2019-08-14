package com.twu.biblioteca;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class Menu {

    public void menuOptions(HashMap<Integer, Book> booklist) {
        Scanner scanner = new Scanner(System.in);
        char userInput = scanner.next().charAt(0);
        int bookID;
        String response;
        switch (userInput) {
            case 's':
                printList(booklist);
                break;
            case 'b':
                System.out.println("Enter the book ID you wish to borrow");
                bookID = scanner.nextInt();
                response = borrow(booklist, bookID);
                System.out.println(response);
                break;
            case 'r':
                System.out.println("Enter the book ID you wish to return");
                bookID = scanner.nextInt();
                response = returnBook(booklist, bookID);
                System.out.println(response);
                break;
            case 'q':
                System.exit(0);
                break;
            default:
                System.out.println("Please select a valid option");

        }

    }

    public void printList(HashMap<Integer, Book> booklist) {
        for (Map.Entry<Integer, Book> entry : booklist.entrySet()) {
            if (entry.getValue().isAvailable()) {
                System.out.println(entry.getValue().toString());
            }

        }
    }


    public String borrow(HashMap<Integer, Book> booklist, Integer ID) {
        Book b = booklist.get(ID);
        if (b!=null && b.isAvailable()) {
            b.setAvailable(false);
            return "Thank you! Enjoy the book";

        } else {
            return "Sorry that book is not available";
        }
    }

    public String returnBook(HashMap<Integer, Book> booklist, Integer ID) {
        Book b = booklist.get(ID);
        if (b!=null && !b.isAvailable()) {
            b.setAvailable(true);
            return "Thank you for returning the book";

        } else {
            return "That is not a valid book to return";
        }
    }
}
