package src.test.java;

import org.junit.*;
import org.mockito.*;

import static org.mockito.Mockito.mock;

public class TestItem {
    private static Inventory mockInventory;
    private static Book book1;
    private static Movie movie1;


    @BeforeClass
    public static void setUp() {
        mockInventory = mock(Inventory.class);

        book1 = new Book(1, "A book", "Eleanor Gooodall", 1704, true);
        //movie1 = new Movie(2, "The Lion King", 2019, "J Cohen", true);

        //when(mockInventory.getAllBooks()).thenReturn(Arrays.asList(book1, book2));

    }

    @Test
    public void testAddBook() {
        mockInventory.add(book1);
        Item i = mockInventory.lookupItem(1);
        assertNotNull(i);
        assertEquals(i, book1);

    }
}
