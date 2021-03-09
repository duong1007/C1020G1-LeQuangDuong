package com.example.rest.controller;


import com.example.rest.model.Blog;
import com.example.rest.service.BlogService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class BlogController {
    @Autowired
    BlogService blogService;


    @GetMapping("/")
    public ResponseEntity<Page<Blog>> listBlog(Pageable pageable){
        return new ResponseEntity<>(blogService.findAll(pageable), HttpStatus.OK);
    }


    @GetMapping("/{id}/read")
    public ResponseEntity<Blog> showBlog(@PathVariable Integer id){
        Blog blog = blogService.findById(id);
        if(blog == null){
            return new ResponseEntity<Blog>(HttpStatus.NOT_FOUND);
        }
        return new ResponseEntity<>(blog,HttpStatus.OK);
    }
}
