package com.itheima;

import com.itheima.domain.Order;
import com.itheima.service.IOrderService;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

import java.util.List;

@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration("classpath:applicationContext.xml")
public class Test03 {
    // 注入service
    @Autowired
    private IOrderService orderService;

    @Test
    public void find(){
        List<Order> list = orderService.findAll();
        System.out.println("---------------------------------------------------");
        System.out.println(list.get(0).getOrderTime());
        System.out.println("---------------------------------------------------");
    }
}
