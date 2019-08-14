package com.twu.biblioteca;


import org.junit.Before;
import org.junit.Test;

import java.util.HashMap;

import static org.junit.Assert.assertEquals;

public class ExampleTest {
    HashMap<Integer, Book> testlist;
    Book book1, book2, book3;
    Menu m;

    @Before
    public void setUp() {
        m = new Menu();
        testlist = new HashMap<Integer, Book>();
        book1 = new Book(1, "A book", "Eleanor Gooodall", 1704, true);
        book2 = new Book(2, "Something interesting", "John Doe", 2017, false);
        book3 = new Book(3, "Another book", "Jason Smith", 1980, false);

    }

    @Test
    public void testBorrow() {
        String response = "Thank you! Enjoy the book";
        assertEquals(response, m.borrow(testlist, 1));

    }

    @Test
    public void testReturn() {
        String response = "That is not a valid book to return";
        assertEquals(response, m.returnBook(testlist, 1));

    }
}
