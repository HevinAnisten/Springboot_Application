package com.example.springboot_application.Category.service;

import com.example.springboot_application.Category.model.Category;
import com.example.springboot_application.Category.repository.CategoryRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class CategoryService {

    @Autowired
    public CategoryRepository categoryRepository;

    public String InsertCategory(Category category){
        categoryRepository.save(category);
        return "category insert successfully";
    }

    public List<Category>selectAll(){
        return categoryRepository.findAll();
    }
}
