package com.project.restaurant.models;

public class Login {
    String userName;
    String password;

    public Login(String userName, String password) {
        this.userName = userName;
        this.password = password;
    }

    public Login() {

    }

    public String getUserName() {
        return userName;
    }

    public void setUserName(String userName) {
        this.userName = userName;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }
}
