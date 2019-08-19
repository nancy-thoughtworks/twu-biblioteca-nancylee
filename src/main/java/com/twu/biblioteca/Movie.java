package com.twu.biblioteca;

public class Movie extends Item{
    private String director;
    private int rating;


    public Movie(Integer id, String title, int year, String director, boolean available) {
        super(id, title, year, available);
        this.director = director;
        this.rating = 0;
    }


    public String getDirector() {
        return director;
    }

    public void setDirector(String director) {
        this.director = director;
    }

    public int getRating() {
        return rating;
    }

    public void setRating(int Rating) {
        this.rating = Rating;
    }

    public String toString() {
        String response = this.getID() +" "+ this.getTitle() + ", " + this.director + ", " + this.getYear();
        if (rating!= 0) {
            response += " " + rating;
        }
        return response;
    }
}