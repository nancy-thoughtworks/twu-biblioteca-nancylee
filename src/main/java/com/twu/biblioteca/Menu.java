package com.twu.biblioteca;
/**
 * Class for the Menu object
 */

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public interface Menu {

/*    public void menuOptions(HashMap<Integer, Book> booklist) {
        Scanner scanner = new Scanner(System.in);
        char userInput = scanner.next().charAt(0);
        int bookID;
        String response;
        switch (userInput) {
            case 's':
                bangaloreLibrary.printList();
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

    }*/
    /*
    Prints all items in the book list that are available
     */

/*    public void printList(HashMap<Integer, Book> booklist) {
        for (Map.Entry<Integer, Book> entry : booklist.entrySet()) {
            if (entry.getValue().isAvailable()) {
                System.out.println(entry.getValue().toString());
            }

        }
    }*/

    /*
    If the book exists and is available then it is set to unavailable
    Otherwise error message is returned
     */

 /*   public String borrow(HashMap<Integer, Book> booklist, Integer ID) {
        Book b = booklist.get(ID);
        if (b!=null && b.isAvailable()) {
            b.setAvailable(false);
            return "Thank you! Enjoy the book";

        } else {
            return "Sorry that book is not available";
        }
    }*/

    /*
    If the book exists and is not available then is set to available
    Otherwise error message returned
     */

/*    public String returnBook(HashMap<Integer, Book> booklist, Integer ID) {
        Book b = booklist.get(ID);
        if (b!=null && !b.isAvailable()) {
            b.setAvailable(true);
            return "Thank you for returning the book";

        } else {
            return "That is not a valid book to return";
        }
    }*/
}
