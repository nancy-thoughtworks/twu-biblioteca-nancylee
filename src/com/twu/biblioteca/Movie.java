package com.twu.biblioteca;

public class Movie {
    private String director;
    private int rating;


    public Movie(Integer ID, String title, int year, String director, boolean available) {
        super(id, title, year, available);
        this.director = director;
        this.rating = null;
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