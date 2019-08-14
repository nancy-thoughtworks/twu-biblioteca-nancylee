package com.twu.biblioteca;

/**
 * Class for the Book object
 */
public class Book {
    private Integer id;
    private String title;
    private String author;
    private int year;
    private boolean available;

    public Book(int id, String title, String author, int year, boolean available) {
        this.id = id;
        this.title = title;
        this.author = author;
        this.year = year;
        this.available = available;
    }

    public int getID() {
        return id;
    }
    public String getTitle() {
        return id +" "+ title;
    }

    public String getAuthor() {
        return author;
    }

    public int getYear() {
        return year;
    }

    public boolean isAvailable() {
        return available;
    }

    public void setID(int id) {
        this.id= id;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public void setAuthor(String author) {
        this.author = author;
    }

    public void setYear(int year) {
        this.year = year;
    }

    public void setAvailable(boolean value) {
        this.available = value;
    }

    public String toString()
    {
        return id +" "+ title + ", " + author + ", " + year;
    }


}
