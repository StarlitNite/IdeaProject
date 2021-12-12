package com.stufood.service;

import com.stufood.entity.Food;

import com.stufood.model.dto.addFoodInfo;
import com.stufood.model.dto.editFoodInfo;
import com.stufood.model.dto.editUserInfo;
import org.apache.ibatis.annotations.Param;

import java.util.List;

public interface FoodService {

    List<Object> getFoodList(@Param("query") String query, @Param("pageSize") Integer pageSize, @Param("currentPage") Integer currentPage);
    double getFoodNum();

    int addFood(addFoodInfo addFoodInfo);

    Food getFoodById(Integer foodId);

    int editFoodById(Integer foodId, editFoodInfo editFoodInfo);

    int delFoodById(Integer foodId);
}
