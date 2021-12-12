package com.stufood.service.Impl;

import com.stufood.dao.ShopDao;
import com.stufood.entity.Shop;
import com.stufood.model.dto.addShopInfo;
import com.stufood.model.dto.editShopInfo;
import com.stufood.service.ShopService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
@Service
public class ShopServiceImpl implements ShopService {
    @Autowired
    ShopDao shopDao;

    @Override
    public List<Object> getShopList(String query, Integer pageSize, Integer currentPage) {
        return shopDao.getShopList(query,pageSize, currentPage);
    }

    @Override
    public double getShopNum() {
        return shopDao.getShopNum();
    }

    @Override
    public int addShop(addShopInfo addShopInfo) {
        return shopDao.addShop(addShopInfo);
    }

    @Override
    public Shop getShopById(Integer shopId) {
        return shopDao.getShopById(shopId);
    }

    @Override
    public int editShopById(Integer shopId, editShopInfo editShopInfo) {
        return shopDao.editShopById(shopId,editShopInfo);
    }

    @Override
    public int delShopById(Integer shopId) {
        return shopDao.delShopById(shopId);
    }
}
