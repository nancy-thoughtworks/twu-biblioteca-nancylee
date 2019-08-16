package com.twu.biblioteca;

public abstract class Item {

    private Integer id;
    private String title;
    private int year;
    private boolean available;
    private User borrower;

    public Item(int id, String title, int year, boolean available) {
        this.id = id;
        this.title = title;
        this.year = year;
        this.available = available;
    }

    public int getID() {
        return id;
    }

    public void setID(Integer ID) {
        this.id = ID;
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

    public boolean isAvailable() {
        return available;
    }

    public void setAvailable(boolean value) {
        this.available = value;
    }

    public boolean checkOut() {
        if (this.isAvailable()) {
            this.available = false;
            return true;

        } else {
            return false;
        }

    }


}
