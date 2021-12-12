package com.stufood.service.Impl;

import com.stufood.dao.OrderDao;
import com.stufood.entity.Order;
import com.stufood.service.OrderService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class OrderServiceImpl implements OrderService {

    @Autowired
    OrderDao orderDao;

    @Override
    public List<Order> getOrderList(String query, Integer pageSize, Integer currentPage) {
        return orderDao.getOrderList(query,pageSize,currentPage);
    }

    @Override
    public double getOrderNum() {
        return orderDao.getOrderNum();
    }
}
