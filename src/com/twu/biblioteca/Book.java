package com.twu.biblioteca;

/**
 * Class for the Book object
 */
public class Book extends Item {
    private String author;

    public Book(int id, String title, String author, int year, boolean available) {
        super(id, title, year, available);
        this.author = author;
    }


    public void setAuthor(String author) {
        this.author = author;
    }

    public String getAuthor() {
        return author;
    }


    public String toString()
    {
        return this.getID() +" "+ this.getTitle() + ", " + this.author + ", " + this.getYear();
    }

}
