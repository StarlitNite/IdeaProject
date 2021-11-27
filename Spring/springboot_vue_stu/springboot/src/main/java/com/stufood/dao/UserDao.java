package com.stufood.dao;

import com.stufood.entity.User;
import org.apache.ibatis.annotations.Mapper;

@Mapper
public interface UserDao {

    User findUserByNameAndPwd(String userName, String userPwd);


}
