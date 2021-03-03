package com.example.extent_blog.service;

import com.example.extent_blog.model.BlogCategory;

import java.util.List;
import java.util.Set;

public interface BlogCategoryService {
    void save(BlogCategory blogCategory);

    void delete(BlogCategory blogCategory);

    void deleteById(Integer id);

    void saveAll(List<BlogCategory> blogCategories);
}
