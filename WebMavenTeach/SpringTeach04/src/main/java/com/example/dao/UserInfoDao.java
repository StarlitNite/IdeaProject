package com.example.dao;

import com.example.po.UserInfo;
import org.springframework.stereotype.Repository;

/**
 *  Dao层：（数据访问层：数据库的增删改查操作）
 */
@Repository
public class UserInfoDao {

    private final String USER_NAME = "admin";//用户名
    private final String USER_PWD = "123456";//密码

    /**
     * 通过用户名查询用户记录，返回用户对象
     * @param userName
     * @return
     */


    public UserInfo queryUserByName(String userName){
        UserInfo userInfo =null;
        //
        if(USER_NAME.equals(userName)){
            userInfo = new UserInfo();
            userInfo.setUserId(1);
            userInfo.setUserName(USER_NAME);//这个地方用USER_NAME和userName一样 他俩相等
            userInfo.setUserPwd(USER_PWD);
        }
        return userInfo;
    }

}
