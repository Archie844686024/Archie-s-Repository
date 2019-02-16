package com.itheima.service;

import com.itheima.domain.Product;

import java.util.List;

/**
 * 产品模块
 */
public interface IProductService {
    /**
     * 查询全部
     */
    List<Product> findAll();

    void save(Product product);

    Product findById(Long id);

    void update(Product product);

    void delete(int id);
}
