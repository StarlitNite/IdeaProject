package com.stufood.service;


import com.stufood.entity.Shop;
import com.stufood.model.dto.addShopInfo;
import com.stufood.model.dto.editShopInfo;
import org.apache.ibatis.annotations.Param;

import java.util.List;

public interface ShopService {
    List<Object> getShopList(@Param("query") String query, @Param("pageSize") Integer pageSize, @Param("currentPage") Integer currentPage);

    double getShopNum();

    int addShop(addShopInfo addShopInfo);

    Shop getShopById(Integer shopId);

    int editShopById(Integer shopId, editShopInfo editShopInfo);

    int delShopById(Integer shopId);
}
