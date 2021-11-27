package com.stufood.model.dto;

import lombok.NoArgsConstructor;
import lombok.Getter;
import lombok.Setter;
import lombok.ToString;
/**
 * 登录账号密码
 */
@NoArgsConstructor
@Getter
@Setter
@ToString
public class LoginInfo {
    private String username;
    private String password;
}
