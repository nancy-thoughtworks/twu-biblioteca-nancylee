package com.twu.biblioteca;

/**
 * Class for testing
 */

import org.junit.Before;
import org.junit.Test;

import java.util.HashMap;

import static org.junit.Assert.assertEquals;

public class ExampleTest {
    HashMap<Integer, Book> testlist;
    Book book1, book2;
    Menu m;

    @Before
    public void setUp() {
        m = new Menu();
        testlist = new HashMap<Integer, Book>();
        book1 = new Book(1, "A book", "Eleanor Gooodall", 1704, true);
        book2 = new Book(2, "Something interesting", "John Doe", 2017, false);

        testlist.put(book1.getID(), book1);
        testlist.put(book2.getID(), book2);

    }

    @Test
    public void testBorrowPositive() {
        String response = "Thank you! Enjoy the book";
        assertEquals(response, m.borrow(testlist, 1));

    }

    @Test
    public void testBorrowNegative() {
        String response = "Sorry that book is not available";
        assertEquals(response, m.borrow(testlist, 2));

    }

    @Test
    public void testReturnPositive() {
        String response = "Thank you for returning the book";
        assertEquals(response, m.returnBook(testlist, 2));

    }

    @Test
    public void testReturnNegative() {
        String response = "That is not a valid book to return";
        assertEquals(response, m.returnBook(testlist, 1));

    }
}
