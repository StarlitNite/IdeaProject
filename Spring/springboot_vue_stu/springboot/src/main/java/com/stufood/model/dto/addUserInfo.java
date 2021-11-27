package com.stufood.model.dto;

import lombok.Data;

/**
 * 添加用户
 */
@Data
public class addUserInfo {
    private String userName;
    private String userPwd;
    private String nickName;
    private String tel;
    private String userAddress;
}
