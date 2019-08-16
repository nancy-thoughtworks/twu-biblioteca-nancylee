package com.twu.biblioteca;

public class User {
    private String username;
    private String password;

    public User(String username, String password) {
        this.username = username;
        this.password = password;
    }

    public boolean authenticate(String username, String pass) {
        return this.username.equals(username) && this.password.equals(pass);
    }

 /*   public boolean login() {
        return correctPassword && correctUsername;
    }*/

    public Menu getMenu() {
        return new UserMenu();
    }




}
