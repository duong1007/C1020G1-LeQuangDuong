package com.example.blog_one_to_many.controller;


import com.example.blog_one_to_many.model.Blog;
import com.example.blog_one_to_many.model.Category;
import com.example.blog_one_to_many.service.BlogService;
import com.example.blog_one_to_many.service.CategoryService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.web.PageableDefault;
import org.springframework.http.HttpStatus;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import java.util.List;

@CrossOrigin
@RestController
@RequestMapping("test")
public class BlogRestController {
    @Autowired
    private BlogService blogService;

    @Autowired
    private CategoryService categoryService;


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

    @PostMapping(value = "/createBlog",produces = MediaType.APPLICATION_JSON_VALUE,
            consumes = MediaType.APPLICATION_JSON_VALUE)
    public ResponseEntity<Void> createBlog(@RequestBody Blog blog){
        DateTimeFormatter dft = DateTimeFormatter.ofPattern("yyyy/MM/dd HH:mm:ss");
        LocalDateTime now = LocalDateTime.now();
        blog.setLocalDate(dft.format(now));
        blogService.save(blog);
        return new ResponseEntity<Void>(HttpStatus.CONFLICT);
    }

    @GetMapping("/category")
    public ResponseEntity<List<Category>> categoryView(){
        List<Category> categories = categoryService.findAll();
        return new ResponseEntity<List<Category>>(categories,HttpStatus.OK);
    }


}
