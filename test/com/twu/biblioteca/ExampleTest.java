package com.twu.biblioteca;


import org.junit.Test;
import static org.junit.Assert.assertEquals;

public class ExampleTest {
    @Rule
    public final TextFromStandardInputStream systemInMock = emptyStandardInputStream();

    @Test
    public void test() {
        systemInMock.provideLines("5");
        InputOutput inputOutput = new InputOutput();


    }
}
