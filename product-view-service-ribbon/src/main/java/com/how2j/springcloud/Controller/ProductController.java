package com.how2j.springcloud.Controller;


import com.how2j.springcloud.Services.ProductService;
import com.how2j.springcloud.pojo.Product;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

import java.util.List;

@Controller
public class ProductController {
@Autowired
    ProductService productService;
@RequestMapping("/products")
    public Object products(Model m){
    List<Product> ps= productService.ListProducts();
    m.addAttribute("ps",ps);
    return  "products";
}

}
