package com.stufood.service.Impl;

import com.stufood.dao.FoodDao;
import com.stufood.entity.Food;
import com.stufood.model.dto.addFoodInfo;
import com.stufood.model.dto.editFoodInfo;
import com.stufood.model.dto.editUserInfo;
import com.stufood.service.FoodService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class FoodServiceImpl implements FoodService {

    @Autowired
    FoodDao foodDao;

    @Override
    public List<Object> getFoodList(String query,Integer pageSize, Integer currentPage) {
        return foodDao.getFoodList(query,pageSize, currentPage);
    }

    @Override
    public double getFoodNum() {
        return foodDao.getFoodNum();
    }

    @Override
    public int addFood(addFoodInfo addFoodInfo) {
        return foodDao.addFood(addFoodInfo);
    }

    @Override
    public Food getFoodById(Integer foodId) {
        return foodDao.getFoodById(foodId);
    }

    @Override
    public int editFoodById(Integer foodId, editFoodInfo editFoodInfo) {
        return foodDao.editFoodById(foodId,editFoodInfo);
    }

    @Override
    public int delFoodById(Integer foodId) {
        return foodDao.delFoodById(foodId);
    }
}
