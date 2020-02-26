package com.how2j.springcloud.service;


import com.how2j.springcloud.client.ProductClientFeign;
import com.how2j.springcloud.pojo.Product;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class ProductServer {

    @Autowired
    ProductClientFeign productClientFeign;

    public List<Product> listProducts(){

        return productClientFeign.listProduct();
    }
}
