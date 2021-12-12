package com.stufood.controller;

import com.stufood.entity.Shop;
import com.stufood.model.dto.addShopInfo;
import com.stufood.model.dto.editShopInfo;
import com.stufood.model.vo.Result;
import com.stufood.service.ShopService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import java.util.HashMap;
import java.util.Map;

@RestController
@ResponseBody
public class ShopController {
    @Autowired
    ShopService shopService;

    @GetMapping("/shop")
    public Result getShopList(String query, Integer pageSize, Integer currentPage){/*currentPage*pageSize*/
        Map<String, Object> stringObjectMap = new HashMap<String, Object>();
        try {
            stringObjectMap.put("Shops", shopService.getShopList(query,pageSize, currentPage*pageSize));
            stringObjectMap.put("totalShop",shopService.getShopNum());//总有多少条数据
            stringObjectMap.put("totalPage", Math.ceil(shopService.getShopNum()/pageSize));/*  然后分为了多少页（函数解决）放进map*/
            stringObjectMap.put("pageSize", pageSize);//一页存放了多少条数据
            stringObjectMap.put("currentPage", currentPage);//当前页
        } catch (Exception e) {
            e.printStackTrace();
        } finally {
            return Result.ok("获取商家列表成功",stringObjectMap);
        }
    }

    @PostMapping("/addShop")
    public Result addShop(@RequestBody addShopInfo addShopInfo){
        try {
            shopService.addShop(addShopInfo);
        } catch (Exception e) {
            e.printStackTrace();
            Result.error("添加菜品失败！");
        }finally {
            return Result.ok("添加菜品成功！");
        }
    }

    @GetMapping("/shop/{shopId}")
    public Result getShopById(@PathVariable Integer shopId){
        Shop shop = shopService.getShopById(shopId);
        return Result.ok("获取用户信息成功！",shop);
    }

    @PutMapping("/editShop/{shopId}")
    public Result editShopById(@PathVariable Integer shopId,@RequestBody editShopInfo editShopInfo){
        try {
            shopService.editShopById(shopId,editShopInfo);
        } catch (Exception e) {
            e.printStackTrace();
        } finally {
            return Result.ok("修改用户信息成功!");
        }
    }

    @DeleteMapping("/delShop/{shopId}")
    public Result delShopById(@PathVariable Integer shopId){
        try {
            shopService.delShopById(shopId);
        } catch (Exception e) {
            e.printStackTrace();
        } finally {
            return Result.ok("删除用户成功！");
        }
    }
}
