package com.stufood.service;

import com.stufood.entity.Order;
import org.apache.ibatis.annotations.Param;

import java.util.List;

public interface OrderService {


    List<Order> getOrderList(@Param("query") String query, @Param("pageSize") Integer pageSize, @Param("currentPage") Integer currentPage);

    double getOrderNum();
}
