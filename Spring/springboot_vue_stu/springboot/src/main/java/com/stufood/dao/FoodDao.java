package com.stufood.dao;

import com.stufood.entity.Food;
import com.stufood.model.dto.addFoodInfo;
import com.stufood.model.dto.editFoodInfo;
import com.stufood.model.dto.editUserInfo;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;

import java.util.List;

@Mapper
public interface FoodDao {


    List<Object> getFoodList(@Param("query") String query, @Param("pageSize") Integer pageSize, @Param("currentPage") Integer currentPage);

    double getFoodNum();

    int addFood(addFoodInfo addFoodInfo);

    Food getFoodById(Integer foodId);

    int editFoodById(Integer foodId,@Param("editFoodInfo") editFoodInfo editFoodInfo);

    int delFoodById(Integer foodId);
}
