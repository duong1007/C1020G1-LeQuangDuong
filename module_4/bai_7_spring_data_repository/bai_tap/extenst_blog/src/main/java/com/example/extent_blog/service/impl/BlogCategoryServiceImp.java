package com.example.extent_blog.service.impl;

import com.example.extent_blog.model.BlogCategory;
import com.example.extent_blog.repository.BlogCategoryRepository;
import com.example.extent_blog.service.BlogCategoryService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Set;

@Service
public class BlogCategoryServiceImp implements BlogCategoryService {

    @Autowired
    BlogCategoryRepository blogCategoryRepository;

    @Override
    public void save(BlogCategory blogCategory) {
        blogCategoryRepository.save(blogCategory);
    }

    @Override
    public void delete(BlogCategory blogCategory) {
        blogCategoryRepository.delete(blogCategory);
    }

    @Override
    public void deleteById(Integer id) {
        blogCategoryRepository.deleteById(id);
    }

    @Override
    public void saveAll(List<BlogCategory> blogCategories) {
        blogCategoryRepository.saveAll(blogCategories);
    }
}
