package com.ahuthj.service.impl;

import com.ahuthj.mapper.ProductMapper;
import com.ahuthj.model.Product;
import com.ahuthj.model.ProductKey;
import com.ahuthj.service.ProductService;
import com.github.pagehelper.PageHelper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * Created by Byant on 2018-05-06.
 */
@Service
public class ProductServiceImpl implements ProductService {

    @Autowired
    private ProductMapper productMapper;//这里会报错，但是并不会影响

    /*
   * 这个方法中用到了我们开头配置依赖的分页插件pagehelper
   * 很简单，只需要在service层传入参数，然后将参数传递给一个插件的一个静态方法即可；
   * pageNum 开始页数
   * pageSize 每页显示的数据条数
   * */
    @Override
    public List<Product> findAllProduct(int pageNum, int pageSize) {
        //将参数传给这个方法就可以实现物理分页了，非常简单。
        PageHelper.startPage(pageNum, pageSize);
        return productMapper.selectAllProduct();
    }

    @Override
    public Product selectByPrimaryKey(ProductKey key) {
        return productMapper.selectByPrimaryKey(key);
    }
}
