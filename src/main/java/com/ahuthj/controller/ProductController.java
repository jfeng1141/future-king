package com.ahuthj.controller;

import com.ahuthj.model.ProductKey;
import com.ahuthj.service.ProductService;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import java.util.logging.Logger;

/**
 * Created by Byant on 2018-05-06.
 */
@Controller
public class ProductController {

    @Autowired
    private ProductService userService;

    @ResponseBody
    @RequestMapping(value = "/all/{pageNum}/{pageSize}", produces = {"application/json;charset=UTF-8"})
    public Object findAllUser(@PathVariable("pageNum") int pageNum, @PathVariable("pageSize") int pageSize){



        return userService.findAllProduct(pageNum,pageSize);
    }

    @ResponseBody
    @RequestMapping(value = "/select", produces = {"application/json;charset=UTF-8"})
    public Object select(){
        ProductKey key = new ProductKey();


        key.setId(9);
        key.setProductId(1003);
        return userService.selectByPrimaryKey(key);
    }
}
