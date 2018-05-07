package com.ahuthj.mapper;

import com.ahuthj.model.Product;
import com.ahuthj.model.ProductKey;

import java.util.List;

public interface ProductMapper {
    int deleteByPrimaryKey(ProductKey key);

    int insert(Product record);

    int insertSelective(Product record);

    Product selectByPrimaryKey(ProductKey key);

    int updateByPrimaryKeySelective(Product record);

    int updateByPrimaryKey(Product record);

    List<Product> selectAllProduct();
}