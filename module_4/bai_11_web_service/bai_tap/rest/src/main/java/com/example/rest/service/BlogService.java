package com.example.rest.service;



import com.example.rest.model.Blog;
import com.example.rest.model.Category;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.domain.Sort;

import java.util.List;


public interface BlogService {

    Page<Blog> findAll(Pageable pageable);

    Blog findById(Integer id);

    void save(Blog blog);

    void delete(Integer id);

    Page<Blog> findAllByNameContaining(String name, Pageable pageable);

    List<Blog> findAllByCategory(Category category);
}
