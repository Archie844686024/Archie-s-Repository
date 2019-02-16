package com.itheima.controller;

import com.itheima.domain.Order;
import com.itheima.domain.Product;
import com.itheima.service.IOrderService;
import com.itheima.service.IProductService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

import java.util.List;

@Controller
@RequestMapping("/order")
public class OrderController {

    // 注入service
    @Autowired
    private IOrderService orderService;

    /**
     * 1. 产品列表(order-list.jsp)
     */
    @RequestMapping("/findAll")
    public ModelAndView findAll(){
        //1.1 调用service查询
        List<Order> list = orderService.findAll();
        //1.2 返回
        ModelAndView mv = new ModelAndView();
        //a. 设置跳转结果页面
        mv.setViewName("order-list");
        //b. 存储数据
        mv.addObject("list",list);
        return mv;
    }
}















