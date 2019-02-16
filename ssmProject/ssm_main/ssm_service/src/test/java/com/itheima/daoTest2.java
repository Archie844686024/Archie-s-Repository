package com.itheima;

import com.itheima.domain.Product;
import com.itheima.service.IProductService;
import com.itheima.service.impl.ProductServiceImpl;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;
import org.springframework.web.servlet.tags.Param;

import java.util.List;

@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration("classpath:applicationContext.xml")
public class daoTest2 {
    @Autowired
    private IProductService productService;

    @Test
    public void test(){
        List<Product> all = productService.findAll();
        System.out.println("----------------------------------------------------");
//        System.out.println(all.indexOf(1));
        /*for (int i = 0; i < all.size(); i++) {
            System.out.println(all.get(i));
        }*/
        System.out.println(all.get(0).getCityName());
        System.out.println("----------------------------------------------------");
    }
}
