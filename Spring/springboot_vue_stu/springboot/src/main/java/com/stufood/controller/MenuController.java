package com.stufood.controller;

import com.stufood.entity.Menu;
import com.stufood.entity.User;
import com.stufood.model.dto.addUserInfo;
import com.stufood.model.dto.editUserInfo;
import com.stufood.model.vo.Result;
import com.stufood.service.MenuService;
import org.apache.ibatis.annotations.Param;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

@RestController
@ResponseBody
public class MenuController {
    @Autowired
    MenuService menuService;

    /**
     * 获取左侧菜单栏列表
     * @return
     */
    @GetMapping("/menus")
    public Result getMenuTree(){
        List<Menu> menu = menuService.MenuTree();

        return Result.ok("获取列表成功",menu);
    }

    /**
     * 获取用户列表
     * @param query
     * @param pageSize
     * @param currentPage
     * @return
     */
    @GetMapping("/user")
    public Result getUserList(String query,Integer pageSize, Integer currentPage){
        Map<String, Object> stringObjectMap = new HashMap<String, Object>();
        try {
            stringObjectMap.put("users", menuService.getUserList(query,pageSize, currentPage*pageSize));
            stringObjectMap.put("totalUser",menuService.getUserNum());//总有多少条数据
            stringObjectMap.put("totalPage", Math.ceil(menuService.getUserNum()/pageSize));/*  然后分为了多少页（函数解决）放进map*/
            stringObjectMap.put("pageSize", pageSize);//一页存放了多少条数据
            stringObjectMap.put("currentPage", currentPage);//当前页
        } catch (Exception e) {
            e.printStackTrace();
        } finally {
            return Result.ok("获取用户列表成功",stringObjectMap);
        }
    }

    /**
     * 添加用户
     * @param userInfo
     * @return
     */
    @PostMapping("/addUser")
    public Result addUser(@RequestBody addUserInfo userInfo) {
        try {
            menuService.addUser(userInfo);
        } catch (Exception e) {
            e.printStackTrace();
            Result.error("添加用户失败！");
        }finally {
            return Result.ok("添加用户成功！");
        }
    }

    /**
     * 根据用户ID查询用户信息
     * @param userId
     * @return
     */
    @GetMapping("/user/{userId}")
    public Result getUserById(@PathVariable Integer userId){
            User user = menuService.getUserById(userId);
            return Result.ok("获取用户信息成功！",user);
    }

    @PutMapping("/editUser/{userId}")
    public Result editUserById(@PathVariable Integer userId,@RequestBody editUserInfo editUserInfo){
        try {
            menuService.editUserById(userId,editUserInfo);
        } catch (Exception e) {
            e.printStackTrace();
        } finally {
            return Result.ok("修改用户信息成功!");
        }
    }

    @DeleteMapping("/delUser/{userId}")
    public Result delUserById(@PathVariable Integer userId){
        try {
            menuService.delUserById(userId);
        } catch (Exception e) {
            e.printStackTrace();
        } finally {
            return Result.ok("删除用户成功！");
        }
    }
}
