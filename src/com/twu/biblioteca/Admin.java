package com.twu.biblioteca;

public class Admin extends User {

    public Admin(String username, String password) {
        super(username, password);
    }

    @Override
    public boolean login() {
        final boolean isAuthenticated = super.login();
        //final boolean isAuthorized = isAllowedToDoThis();
        //return isAuthenticated && isAuthorized;
    }

    @Override
    public Menu getMenu() {
        return new AdminMenu();
    }
}
