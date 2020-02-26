package com.how2j.springcloud.Services;


import com.how2j.springcloud.client.ProductClientRibbon;
import com.how2j.springcloud.pojo.Product;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;


@Service
public class ProductService {

@Autowired
    ProductClientRibbon productClientRibbon;

public List<Product> ListProducts(){
        return productClientRibbon.listProduct();
    }



}
