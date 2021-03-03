package com.example.extent_blog.service;


import com.example.extent_blog.model.Blog;
import com.example.extent_blog.model.BlogCategory;

import java.util.List;

public interface BlogService {

    List<Blog> findAll();

    Blog findById(Integer id);

    void save(Blog blog);

    void delete(Integer id);


}
