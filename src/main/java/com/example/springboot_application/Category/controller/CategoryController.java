package com.example.springboot_application.Category.controller;


import com.example.springboot_application.Category.model.Category;
import com.example.springboot_application.Category.service.CategoryService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/category")
public class CategoryController {

    @Autowired
    public CategoryService categoryService;


    @GetMapping("/addAll")
    public List<Category> getAllCategories(){
        return categoryService.selectAll();

    }
    @PostMapping("/Insert")
    public Category Insert(){
        return categoryService.
    }
}
