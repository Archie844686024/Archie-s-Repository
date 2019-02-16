package com.itheima.service;

import com.itheima.domain.Order;

import java.util.List;

public interface IOrderService {
    //查询全部
    List<Order> findAll();
}
