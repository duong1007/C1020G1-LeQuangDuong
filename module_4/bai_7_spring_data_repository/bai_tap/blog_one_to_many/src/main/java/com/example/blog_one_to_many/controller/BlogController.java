package com.example.blog_one_to_many.controller;


import com.example.blog_one_to_many.model.Blog;
import com.example.blog_one_to_many.model.Category;
import com.example.blog_one_to_many.service.impl.BlogServiceImpl;
import com.example.blog_one_to_many.service.impl.CategoryServiceImp;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.domain.Sort;
import org.springframework.data.web.PageableDefault;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.servlet.mvc.support.RedirectAttributes;

import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import java.util.Date;
import java.util.List;
import java.util.Optional;

@Controller
public class BlogController {

    @Autowired
    BlogServiceImpl blogService;

    @Autowired
    CategoryServiceImp categoryServiceImp;

    @ModelAttribute("categories")
    public List<Category> categories(){
        return categoryServiceImp.findAll();
    }

    @GetMapping("/")
    public String home(@RequestParam("s") Optional<String> s, Model model,@PageableDefault(size = 5, sort = "localDate") Pageable pageable){
        Page<Blog> blogs;
        if(s.isPresent()){
            blogs = blogService.findAllByNameContaining(s.get(), pageable);
        } else {
            blogs = blogService.findAll(pageable);
        }
        model.addAttribute("blogs", blogs);
        return "blog/home";
    }

    @GetMapping("/create")
    public String create(Model model){
        model.addAttribute("blog",new Blog());
        return "blog/create";
    }

    @PostMapping("/create")
    public String create(Blog blog,
                         Model model) {
        DateTimeFormatter dft = DateTimeFormatter.ofPattern("yyyy/MM/dd HH:mm:ss");
        LocalDateTime now = LocalDateTime.now();
        blog.setLocalDate(dft.format(now));
        blogService.save(blog);
        model.addAttribute("success","create success");
        return "blog/create";
    }

    @GetMapping("/{id}/edit")
    public String edit(@PathVariable Integer id, Model model) {
       Blog blog = blogService.findById(id);
       model.addAttribute("blog",blog);
       return "blog/edit";
    }

    @PostMapping("/edit")
    public String update(@ModelAttribute Blog blog,
                         RedirectAttributes redirectAttributes) {
        blogService.save(blog);
        redirectAttributes.addFlashAttribute("success","edit success");
        return "redirect:/";
    }

    @GetMapping("/{id}/delete")
    public String delete(@PathVariable Integer id, RedirectAttributes redirectAttributes){
        blogService.delete(id);
        redirectAttributes.addFlashAttribute("success","delete success");
        return "redirect:/";
    }

    @GetMapping("/{id}/view")
    public String view(@PathVariable Integer id, Model model) {
        Blog blog = blogService.findById(id);
        model.addAttribute("blog",blog);
        return "blog/view";
    }

    @GetMapping("/{id}/view-category")
    public String viewCategory(@PathVariable Integer id,Model model){
        List<Blog> blogs = categoryServiceImp.findById(id).getBlog();
        model.addAttribute("blogs",blogs);
        return "/blog/home";
    }


}
