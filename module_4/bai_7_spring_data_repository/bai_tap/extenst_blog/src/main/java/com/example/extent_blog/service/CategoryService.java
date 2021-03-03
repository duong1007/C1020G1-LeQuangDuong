package com.example.extent_blog.service;


import com.example.extent_blog.model.Category;

import java.util.List;

public interface CategoryService {

    List<Category> findAll();

    Category findById(Integer id);

    void save(Category category);

    void delete(Integer id);



}
