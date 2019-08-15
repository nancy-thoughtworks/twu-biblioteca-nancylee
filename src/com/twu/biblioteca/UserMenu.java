package com.twu.biblioteca;

public class UserMenu implements Menu {
    @Override
    public void show() {
        //show user menu
    }

    public boolean authenticate(String username, String pass) {
        return this.username.equals(username) && this.password.equals(pass);
    }
}
