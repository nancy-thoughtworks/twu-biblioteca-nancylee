package com.twu.biblioteca;

/**
 * Class for testing
 */

import org.junit.Before;
import org.junit.Rule;
import org.junit.Test;
import org.mockito.Mockito.*;
import org.mockito.Mock;
import org.mockito.junit.MockitoJUnit;
import org.mockito.junit.MockitoRule;

import java.util.HashMap;

import static org.junit.Assert.assertEquals;

public class ExampleTest {

    @Mock
    MyDatabase databaseMock;

    @Rule
    public MockitoRule mockitoRule = MockitoJUnit.rule();

    @Test
    public void testItem() {
        Item i = new Item (databaseMock);
        boolean check = i.query("* from t");
        assertTrue(check);
        verify(databaseMock).query("* from t");
    }

/*
    Inventory testlist;
    Book testBook;
    Movie testMovie;
    Borrower b;
    Admin a;


    @Before
    public void setUp() {
        testBook = new Book(1, "A book", "Eleanor Gooodall", 1704, true);
        testMovie = new Movie(2, "The Lion King", 2019, "J Cohen", true);
        testlist.add(testBook);
        testlist.add(testMovie);

        b = new Borrower("111-1111", "mmm", testlist,"john doe","alskdj@jfdl.com", 4848444);
        a = new Admin("222-2222", "aaa", testlist);

    }
*/

/*
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

    }*/
}
