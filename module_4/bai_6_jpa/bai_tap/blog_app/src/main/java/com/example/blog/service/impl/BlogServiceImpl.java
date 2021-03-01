package com.example.blog.service.impl;

import com.example.blog.model.Blog;
import com.example.blog.repository.BlogRepository;
import com.example.blog.service.BlogService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class BlogServiceImpl implements BlogService {

    @Autowired
    BlogRepository blogRepository;


    @Override
    public List<Blog> findAll() {
        return blogRepository.findAll();
    }

    @Override
    public Blog findById(Integer id) {
        return blogRepository.findById(id).orElse(null);
    }

    @Override
    public void create(Blog blog) {
        blogRepository.save(blog);
    }

    @Override
    public void update(Integer id, Blog blog) {
       Blog oldBlog = blogRepository.findById(id).get();
       oldBlog.setName(blog.getName());
       oldBlog.setContent(blog.getContent());
       oldBlog.setType(blog.getType());
       blogRepository.save(oldBlog);
    }

    @Override
    public void delete(Integer id) {
        blogRepository.deleteById(id);
    }
}
