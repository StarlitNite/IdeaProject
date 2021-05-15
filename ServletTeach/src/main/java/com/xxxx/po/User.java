package com.xxxx.po;

public class User {
    private Integer UserId;
    private String Username;
    private String Password;

    public User(){
    }

    public User(Integer UserId,String Username,String Password){
        this.UserId = UserId;
        this.Username = Username;
        this.Password = Password;
    }

    public Integer getUserId() {
        return UserId;
    }

    public void setUserId(Integer userId) {
        UserId = userId;
    }

    public String getUsername() {
        return Username;
    }

    public void setUsername(String username) {
        Username = username;
    }

    public String getPassword() {
        return Password;
    }

    public void setPassword(String password) {
        Password = password;
    }
}
