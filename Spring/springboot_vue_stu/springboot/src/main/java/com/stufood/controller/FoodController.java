package com.stufood.controller;

import com.stufood.entity.Food;
import com.stufood.entity.User;
import com.stufood.model.dto.addFoodInfo;
import com.stufood.model.dto.editFoodInfo;
import com.stufood.model.vo.Result;
import com.stufood.service.FoodService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.HashMap;

import java.util.Map;

@RestController
@ResponseBody
public class FoodController {

    @Autowired
    FoodService foodService;

    @GetMapping("/food")
    public Result getFoodList(String query,Integer pageSize, Integer currentPage){
        Map<String, Object> stringObjectMap = new HashMap<String, Object>();
        try {
            stringObjectMap.put("foods", foodService.getFoodList(query,pageSize, currentPage*pageSize));
            stringObjectMap.put("totalFood",foodService.getFoodNum());//总有多少条数据
            stringObjectMap.put("totalPage", Math.ceil(foodService.getFoodNum()/pageSize));/*  然后分为了多少页（函数解决）放进map*/
            stringObjectMap.put("pageSize", pageSize);//一页存放了多少条数据
            stringObjectMap.put("currentPage", currentPage);//当前页
        } catch (Exception e) {
            e.printStackTrace();
        } finally {
            return Result.ok("获取菜单列表成功",stringObjectMap);
        }
    }

    @PostMapping("/addFood")
    public Result addFood(@RequestBody addFoodInfo addFoodInfo){
        try {
            foodService.addFood(addFoodInfo);
        } catch (Exception e) {
            e.printStackTrace();
            Result.error("添加菜品失败！");
        }finally {
            return Result.ok("添加菜品成功！");
        }
    }

    @GetMapping("/food/{foodId}")
    public Result getFoodById(@PathVariable Integer foodId){
        Food food = foodService.getFoodById(foodId);
        return Result.ok("获取用户信息成功！",food);
    }

    @PutMapping("/editFood/{foodId}")
    public Result editFoodById(@PathVariable Integer foodId,@RequestBody editFoodInfo editFoodInfo){
        try {
            foodService.editFoodById(foodId,editFoodInfo);
        } catch (Exception e) {
            e.printStackTrace();
        } finally {
            return Result.ok("修改用户信息成功!");
        }
    }

    @DeleteMapping("/delFood/{foodId}")
    public Result delFoodById(@PathVariable Integer foodId){
        try {
            foodService.delFoodById(foodId);
        } catch (Exception e) {
            e.printStackTrace();
        } finally {
            return Result.ok("删除用户成功！");
        }
    }
}
