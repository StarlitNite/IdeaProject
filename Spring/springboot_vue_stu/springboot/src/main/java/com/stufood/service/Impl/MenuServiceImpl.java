package com.stufood.service.Impl;

import com.stufood.dao.MenuDao;
import com.stufood.entity.Menu;
import com.stufood.entity.User;
import com.stufood.model.dto.addUserInfo;
import com.stufood.model.dto.editUserInfo;
import com.stufood.service.MenuService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Service
public class MenuServiceImpl implements MenuService {
    @Autowired
    MenuDao menuDao;

    @Override
    public List<Menu> MenuTree() {
        //1.查询出Menu中所有内容
        List<Menu> menu = menuDao.MenuTree();
        //2.组装成父子树形结构
        List<Menu> menuList = new ArrayList<>();
        //找到所有一级分类
        for (Menu menuDad : menu){
            if (menuDad.getParentId()==0){
                menuList.add(menuDad);
            }
        }

        //找出二级分类，加入到Children数组中
        for (Menu menuChild : menuList){
            menuChild.setChildren(getChildren(menuChild, menu));
        }
        return menuList;
    }
    @Override
    public List<Menu> getChildren(Menu root,List<Menu> all){
        List<Menu> children = new ArrayList<>();
        for (Menu menuChildren:all){
            if (menuChildren.getParentId().equals(root.getMenuId())){
                menuChildren.setChildren(getChildren(menuChildren, all));
                children.add(menuChildren);
            }
        }
       return children;
    }

    /**
     * 获取用户列表
     * @param pageSize
     * @param currentPage
     * @return
     */
    @Override
    public List<User> getUserList(String query,Integer pageSize, Integer currentPage) {
        return menuDao.getUserList(query,pageSize, currentPage);
    }

    @Override
    public double getUserNum() {
        return menuDao.getUserNum();
    }


    @Override
    public int addUser(addUserInfo userInfo) {
        System.out.println(userInfo.toString());
        return menuDao.addUser(userInfo);
    }

    @Override
    public User getUserById(Integer userId) {
        return menuDao.getUserById(userId);
    }

    @Override
    public int editUserById(Integer userId, editUserInfo editUserInfo) {
        return menuDao.editUserById(userId,editUserInfo);
    }

    @Override
    public int delUserById(Integer userId) {
        return menuDao.delUserById(userId);
    }


}

