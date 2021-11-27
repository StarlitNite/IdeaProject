package com.stufood.service;


import com.stufood.entity.Menu;
import com.stufood.entity.User;
import com.stufood.model.dto.addUserInfo;
import com.stufood.model.dto.editUserInfo;
import org.apache.ibatis.annotations.Param;

import java.util.List;

public interface MenuService {

     /*菜单列表*/
     List<Menu> MenuTree();
     /*二级菜单*/
     List<Menu> getChildren(Menu root,List<Menu> all);
     /*用户列表*/
     List<User> getUserList(@Param("query") String query,@Param("pageSize") Integer pageSize, @Param("currentPage") Integer currentPage);
     double getUserNum();

     int addUser(addUserInfo userInfo);

     User getUserById(Integer userId);

     int editUserById(Integer userId, editUserInfo editUserInfo);

    int delUserById(Integer userId);
}


