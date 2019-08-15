package com.twu.biblioteca;

public class Admin extends User {
    @Override
    public Menu getMenu() {
        return new AdminMenu();
    }
}
