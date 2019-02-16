package com.itheima.dao;

import com.itheima.domain.Product;
import org.apache.ibatis.annotations.Delete;
import org.apache.ibatis.annotations.Insert;
import org.apache.ibatis.annotations.Select;
import org.apache.ibatis.annotations.Update;

import java.util.List;

/**
 * 产品模块
 */
public interface IProductDao {
    /**
     * 查询全部
     */
    @Select("select * from product")
    List<Product> findAll();

    @Insert("INSERT INTO product(id,productNum,productName,cityName,departureTime," +
            "productPrice,productDesc,productStatus)VALUES(seq_product.nextval,#{productNum},#{productName}," +
            "#{cityName},#{departureTime},#{productPrice},#{productDesc},#{productStatus})")
    void save(Product product);

    /*
    * 主键查询
    * */
    @Select("select * from product where id = #{id}")
    Product findById(Long id);

    @Update("update product set productNum=#{productNum},productName=#{productName}" +
            ",cityName=#{cityName},departureTime=#{departureTime},productPrice=#{productPrice}," +
            "productDesc=#{productDesc},productStatus=#{productStatus} where id=#{id}")
    void update(Product product);

    @Delete("delete from product where id = #{id}")
    void delete(int id);
}
