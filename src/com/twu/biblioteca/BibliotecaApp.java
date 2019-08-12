package com.twu.biblioteca;

public class BibliotecaApp {

    public static void main(String[] args) {
        System.out.println("Welcome to Biblioteca. your one-stop-shop for great book titles in Bangalore!");

        ArrayList<Book> booklist = new ArrayList<Book>();
        Book book1 = new Book(1, "The Yield", "Jane Winch", 1990);
        Book book2 = new Book(2, "Lonely Planet", "John Doe", 2000);
        Book book3 = new Book(3, "I am", "Jane Val", 2010);
        booklist.add(book1);
        booklist.add(book2);
        booklist.add(book3);




}
