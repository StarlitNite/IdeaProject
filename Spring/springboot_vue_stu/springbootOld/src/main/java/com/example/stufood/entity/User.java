package com.example.stufood.entity;

import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class User {
    private String userID;
    private String userName;
    private String userPwd;
    private String tel;
    private String userAddress;
    private String role;
}
