package com.ahuthj.service;

import com.ahuthj.model.Product;
import com.ahuthj.model.ProductKey;

import java.util.List;

/**
 * Created by Byant on 2018-05-06.
 */
public interface  ProductService {

    List<Product> findAllProduct(int pageNum, int pageSize);

    Product selectByPrimaryKey(ProductKey key);
}
