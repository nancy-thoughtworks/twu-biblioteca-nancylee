package com.twu.biblioteca;

public class User {
    private String username;
    private String password;

    public Menu getMenu() {
        return new UserMenu();
    }

    public boolean authenticate(String username, String pass) {
        return this.username.equals(username) && this.password.equals(pass);
    }
}
