package com.twu.biblioteca;

/***
 * Item class setting out basic attributes
 */
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

    public String getLoanDetails()
    {
        return this.id + " " + this.title + " loaned by " +borrower;
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

    public void setBorrower(User b) {
        this.borrower = b;
    }

    public boolean checkOut() {
        if (this.isAvailable()) {
            this.available = false;
            return true;

        } else {
            return false;
        }

    }

    public boolean borrow(Item i) {
        //Item i = this.collection.get(itemID);
        if (i.checkOut()) {
            i.setAvailable(false);
            //itemsLoaned.add(i);
            System.out.println("Thank you! Enjoy the book");
            return true;
        } else {
            System.out.println("Sorry that book is not available");
            return false;
        }
    }


}
