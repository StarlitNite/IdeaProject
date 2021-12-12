package com.stufood.dao;

import com.stufood.entity.Order;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;

import java.util.List;

@Mapper
public interface OrderDao {
    List<Order> getOrderList(@Param("query") String query, @Param("pageSize") Integer pageSize, @Param("currentPage") Integer currentPage);

    double getOrderNum();
}
