package com.twu.biblioteca;

public class Book {
    private Integer id;
    private String title;
    private String author;
    private int year;

    public Book(int id, String title, String author, int year) {
        this.id = id;
        this.title = title;
        this.author = author;
        this.year = year;
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

    public String toString()
    {
        return id +" "+ title + ", " + author + ", " + year;
    }


}
