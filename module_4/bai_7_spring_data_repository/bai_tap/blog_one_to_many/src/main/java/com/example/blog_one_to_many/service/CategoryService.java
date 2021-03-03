package com.example.blog_one_to_many.service;



import com.example.blog_one_to_many.model.Category;

import java.util.List;

public interface CategoryService {

    List<Category> findAll();

    Category findById(Integer id);

    void save(Category category);

    void delete(Integer id);



}
