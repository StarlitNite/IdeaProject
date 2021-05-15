package com.example.LOGIN;

public class UserData {
    private String ID;
    private String username;
    private String password;
    private String email;


    public UserData(String ID, String username, String password, String email){
        this.ID = ID;
        this.username = username;
        this.password = password;
        this.password = email;

    }

    public String getID() {
        return ID;
    }

    public void setID(String ID) {
        this.ID = ID;
    }

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }
    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

}