package com.example.rest.controller;

import com.example.rest.model.Blog;
import com.example.rest.model.Category;
import com.example.rest.service.BlogService;
import com.example.rest.service.CategoryService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
public class CategoryController {
    @Autowired
    CategoryService categoryService;

    @Autowired
    BlogService blogService;

    @GetMapping("/category")
    public ResponseEntity<List<Category>> showCategory(){
        return new ResponseEntity<>(categoryService.findAll(), HttpStatus.OK);
    }

    @GetMapping("/blogOfCategories/{id}")
    public ResponseEntity<List<Blog>> showBlogOfCategories(@PathVariable Integer id, Model model){
        Category category = categoryService.findById(id);
        List<Blog> blogList = blogService.findAllByCategory(category);
        return new ResponseEntity<>(blogList, HttpStatus.OK);
    }
}
