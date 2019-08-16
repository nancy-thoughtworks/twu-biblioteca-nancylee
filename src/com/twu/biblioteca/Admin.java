package com.twu.biblioteca;

import java.util.HashMap;

/**
 * Admin class extend user
 * Has extra privileges
 */
public class Admin extends User {
    private AdminMenu menu;

    public Admin(String username, String password, Inventory collection) {
        super(username, password,collection);
        this.menu = new AdminMenu(collection);
    }

/*    @Override
    public boolean login() {
        final boolean isAuthenticated = super.login();
        //final boolean isAuthorized = isAllowedToDoThis();
        //return isAuthenticated && isAuthorized;
    }*/

    //private boolean isAllowedToDoThis() { }

    public void getMenu() {
        System.out.println("Welcome \n");

        menu.show();
    }
}
