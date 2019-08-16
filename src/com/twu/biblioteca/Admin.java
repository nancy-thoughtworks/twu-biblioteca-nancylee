package com.twu.biblioteca;

/**
 * Admin class extend user
 * Has extra privileges
 */
public class Admin extends User {

    public Admin(String username, String password) {
        super(username, password);
    }

/*    @Override
    public boolean login() {
        final boolean isAuthenticated = super.login();
        //final boolean isAuthorized = isAllowedToDoThis();
        //return isAuthenticated && isAuthorized;
    }*/

    //private boolean isAllowedToDoThis() { }

    public void getMenu() {
         //new AdminMenu();
    }
}
