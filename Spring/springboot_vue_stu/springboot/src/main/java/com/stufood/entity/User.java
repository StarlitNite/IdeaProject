package com.stufood.entity;

import lombok.Data;



@Data
public class User {
    private String userId;
    private String userName;
    private String userPwd;
    private String nickName;
    private String tel;
    private String userAddress;
    private Boolean state;
    private String role;
}
