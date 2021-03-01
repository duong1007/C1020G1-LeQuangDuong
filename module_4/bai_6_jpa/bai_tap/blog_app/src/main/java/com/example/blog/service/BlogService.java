package com.example.blog.service;

import com.example.blog.model.Blog;

import java.util.List;

public interface BlogService {

    List<Blog> findAll();

    Blog findById(Integer id);

    void create(Blog blog);

    void update(Integer id,Blog blog);

    void delete(Integer id);

}
