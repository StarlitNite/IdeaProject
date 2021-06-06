package com.example.WebProject.pojo;

import java.util.Date;

public class User {
    private Integer UserID;
    private String UserName;
    private String UserPassword;
    private String UserTel;
    private String Ident;


    public Integer getUserID() {
        return UserID;
    }

    public void setUserID(Integer userID) {
        UserID = userID;
    }

    public String getUserName() {
        return UserName;
    }

    public void setUserName(String userName) {
        UserName = userName;
    }

    public String getUserPassword() {
        return UserPassword;
    }

    public void setUserPassword(String userPassword) {
        UserPassword = userPassword;
    }

    public String getUserTel() {
        return UserTel;
    }

    public void setUserTel(String userTel) {
        UserTel = userTel;
    }

    public String getIdent() {
        return Ident;
    }

    public void setIdent(String ident) {
        Ident = ident;
    }

    @Override
    public String toString() {
        return "User{" +
                "UserID=" + UserID +
                ", UserName='" + UserName + '\'' +
                ", UserPassword='" + UserPassword + '\'' +
                ", UserTel='" + UserTel + '\'' +
                ", Ident='" + Ident + '\'' +
                '}';
    }
}
