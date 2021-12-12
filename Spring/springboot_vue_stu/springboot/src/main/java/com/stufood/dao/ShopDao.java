package com.stufood.dao;

import com.stufood.entity.Shop;
import com.stufood.model.dto.addShopInfo;
import com.stufood.model.dto.editShopInfo;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;

import java.util.List;

@Mapper
public interface ShopDao {

    List<Object> getShopList(@Param("query") String query, @Param("pageSize") Integer pageSize, @Param("currentPage") Integer currentPage);

    double getShopNum();

    int addShop(addShopInfo addFoodInfo);

    Shop getShopById(Integer foodId);

    int editShopById(Integer foodId,@Param("editFoodInfo") editShopInfo editFoodInfo);

    int delShopById(Integer foodId);
}
