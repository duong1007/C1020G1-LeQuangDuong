package com.example.blog_one_to_many.service.impl;

import com.example.blog_one_to_many.model.BlogUser;
import com.example.blog_one_to_many.repository.BlogUserRepository;
import com.example.blog_one_to_many.service.BlogUserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class BlogUserServiceImp implements BlogUserService {

    @Autowired
    BlogUserRepository blogUserRepository;

    @Override
    public void save(BlogUser blogUser) {
        blogUserRepository.save(blogUser);
    }
}
