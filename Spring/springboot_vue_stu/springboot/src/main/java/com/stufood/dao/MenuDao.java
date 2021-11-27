package com.stufood.dao;

import com.stufood.entity.Menu;
import com.stufood.entity.User;
import com.stufood.model.dto.addUserInfo;

import com.stufood.model.dto.editUserInfo;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;

import java.util.List;

@Mapper
public interface MenuDao {

    List<Menu> MenuTree();

    List<User> getUserList(@Param("query") String query,@Param("pageSize") Integer pageSize, @Param("currentPage") Integer currentPage);

    double getUserNum();

    int addUser(addUserInfo userInfo);

    User getUserById(Integer userId);

    int editUserById(Integer userId,@Param("editUserInfo") editUserInfo editUserInfo);

    int delUserById(Integer userId);
}
