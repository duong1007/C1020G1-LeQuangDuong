package com.example.blog_one_to_many.controller;


import com.example.blog_one_to_many.model.Blog;
import com.example.blog_one_to_many.service.BlogService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.web.PageableDefault;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@CrossOrigin
@RestController
@RequestMapping("test")
public class BlogRestController {
    @Autowired
    private BlogService blogService;

    @GetMapping("/")
    public ResponseEntity<Page<Blog>> getAllBlog(@PageableDefault(size = 5) Pageable pageable) {


        Page<Blog> blogs = blogService.findAll(pageable);

        return new ResponseEntity<>(blogs, HttpStatus.OK);
    }

    @GetMapping("/search")
    public ResponseEntity<Page<Blog>> search(@PageableDefault(size = 5) Pageable pageable,
                                             @RequestParam String search) {
        Page<Blog> blogs = blogService.findAllByNameContaining(search,pageable);
        return new ResponseEntity<>(blogs,HttpStatus.OK);
    }



    @GetMapping("/detail/{id}")
    public ResponseEntity<Blog> getDetailBlog(@PathVariable Integer id) {
        Blog blog = this.blogService.findById(id);

        return new ResponseEntity<>(blog, HttpStatus.OK);
    }


}
