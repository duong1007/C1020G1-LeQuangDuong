package com.example.blog_one_to_many.service;



import com.example.blog_one_to_many.model.Blog;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.domain.Slice;

import java.util.List;


public interface BlogService {

    Page<Blog> findAll(Pageable pageable);

    Slice<Blog> findAllSlice(Pageable pageable);

    List<Blog> findAll();

    Blog findById(Integer id);

    void save(Blog blog);

    void delete(Integer id);

    Page<Blog> findAllByNameContaining(String name, Pageable pageable);
}
