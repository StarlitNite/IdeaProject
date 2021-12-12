package com.stufood.controller;

import com.stufood.entity.Order;
import com.stufood.model.vo.Result;
import com.stufood.service.OrderService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

@RestController
@ResponseBody
public class OrderController {

    @Autowired
    OrderService orderService;


    public Result getOrderList(String query,Integer pageSize,Integer currentPage){
        Map<String, Object> stringObjectMap = new HashMap<String, Object>();

        try {
            stringObjectMap.put("foods", orderService.getOrderList(query,pageSize, currentPage*pageSize));
            stringObjectMap.put("totalFood",orderService.getOrderNum());//总有多少条数据
            stringObjectMap.put("totalPage", Math.ceil(orderService.getOrderNum()/pageSize));/*  然后分为了多少页（函数解决）放进map*/
            stringObjectMap.put("pageSize", pageSize);//一页存放了多少条数据
            stringObjectMap.put("currentPage", currentPage);//当前页
        } catch (Exception e) {
            e.printStackTrace();
        } finally {
            return Result.ok("获取菜单列表成功",stringObjectMap);
        }

    }

}
