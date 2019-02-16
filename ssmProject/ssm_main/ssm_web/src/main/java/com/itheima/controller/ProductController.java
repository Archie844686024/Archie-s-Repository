package com.itheima.controller;

import com.itheima.domain.Product;
import com.itheima.service.IProductService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

import java.util.List;

@Controller
@RequestMapping("/product")
public class ProductController {

    //注入service
    @Autowired
    private IProductService productService;

    /**
     * 产品列表
     */
    @RequestMapping("/findAll")
    public ModelAndView findAll(){
        //调用service查询
        List<Product> list = productService.findAll();

        //返回
        ModelAndView mv = new ModelAndView();

        //设置跳转结果页面
        mv.setViewName("product-list");

        //存储数据
        mv.addObject("list",list);
        return mv;
    }

    //添加保存
    @RequestMapping("/save")
    public String save(Product product){
        // 调用service，保存
        productService.save(product);
        // 添加成功，重定向到列表
        return "redirect:/product/findAll";
    }

    //进入修改页面
    @RequestMapping("/toUpdate")
    public ModelAndView toUpdate(Long id){
        //根据id查询
        Product product = productService.findById(id);
        //创建对象封装数据，返回
        ModelAndView mv = new ModelAndView();
        mv.addObject("product",product);
        mv.setViewName("product-update");
        return mv;
    }

    //修改保存
    @RequestMapping("/update")
    public String update(Product product){
        //2.0 调用service
        productService.update(product);
        //2.1 修改成功，重定向到列表
        return "redirect:/product/findAll";
    }

    //删除
    @RequestMapping("/delete")
    public String delete(String ids){
        //判断
        if (ids != null && !"".equals(ids)){
            //分隔字符串
            String array[] = ids.split(",");
            //遍历
            for (String id : array){
                productService.delete(Integer.parseInt(id));
            }
        }
        //删除成功，重定向到列表
        return "redirect:/product/findAll";
    }
}
