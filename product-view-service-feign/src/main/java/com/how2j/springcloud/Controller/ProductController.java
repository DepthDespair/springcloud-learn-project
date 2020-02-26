package com.how2j.springcloud.Controller;


import com.how2j.springcloud.pojo.Product;
import com.how2j.springcloud.service.ProductServer;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

import java.util.List;

@Controller
public class ProductController {

@Autowired
    ProductServer productServer;

@RequestMapping("/product")
public Object product(Model m){
    List<Product> ps  = productServer.listProducts();
    m.addAttribute("ps",ps);
    return "product";
}

}
