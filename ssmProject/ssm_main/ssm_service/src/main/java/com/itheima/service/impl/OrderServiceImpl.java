package com.itheima.service.impl;

import com.itheima.dao.IOrderDao;
import com.itheima.domain.Order;
import com.itheima.service.IOrderService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

@Service
@Transactional
public class OrderServiceImpl implements IOrderService {
    @Autowired
    private IOrderDao orderDao;
    @Override
    public List<Order> findAll() {
        return orderDao.findAll();
    }
}
