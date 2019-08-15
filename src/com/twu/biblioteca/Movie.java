package com.twu.biblioteca;

public class Movie {
    private int ID;
    private String title;
    private int year;
    private String director;
    private int rating;


    public Movie(int ID, String title, int year, String director, int rating) {
        this.ID = ID;
        this.title = title;
        this.year = year;
        this.director = director;
        this.rating = rating;
    }

    public int getID() {
        return ID;
    }

    public void setID(int ID) {
        this.ID = ID;
    }


    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public int getYear() {
        return year;
    }

    public void setYear(int year) {
        this.year = year;
    }

    public String getDirector() {
        return director;
    }

    public void setDirector(String director) {
        this.title = director;
    }

    public int getRating() {
        return rating;
    }

    public void setRating(int Rating) {
        this.rating = Rating;
    }
}