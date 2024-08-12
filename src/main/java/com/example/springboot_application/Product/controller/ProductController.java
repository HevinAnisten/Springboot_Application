package com.example.springboot_application.Product.controller;

import com.example.springboot_application.Product.service.ProductService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/product")
public class ProductController {

    @Autowired
    public ProductService productService;

  /*  @GetMapping
    public String getProductAll(){
        return productService.
    }*/

}
