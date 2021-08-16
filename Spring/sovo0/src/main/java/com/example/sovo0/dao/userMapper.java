package com.example.sovo0.dao;

import com.example.sovo0.entity.user;
import org.mapstruct.Mapper;
import org.springframework.stereotype.Repository;

@Mapper//创建对象

public interface userMapper {

    user FindUserNameByName(String username);

    int register(user user);

    //更新操作
    public int updateUser(user user);
}
