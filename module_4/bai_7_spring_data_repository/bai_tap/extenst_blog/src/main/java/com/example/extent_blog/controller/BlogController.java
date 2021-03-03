package com.example.extent_blog.controller;


import com.example.extent_blog.model.Blog;
import com.example.extent_blog.model.BlogCategory;
import com.example.extent_blog.model.Category;
import com.example.extent_blog.service.BlogCategoryService;
import com.example.extent_blog.service.impl.BlogServiceImpl;
import com.example.extent_blog.service.impl.CategoryServiceImp;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.servlet.mvc.support.RedirectAttributes;

import java.util.ArrayList;
import java.util.List;

@Controller
public class BlogController {

    @Autowired
    BlogServiceImpl blogService;

    @Autowired
    CategoryServiceImp categoryServiceImp;

    @Autowired
    BlogCategoryService blogCategoryService;

    @ModelAttribute("categories")
    public List<Category> categories(){
        return categoryServiceImp.findAll();
    }

    @GetMapping("/")
    public String home(Model model){
        List<Blog> blogs = blogService.findAll();
        model.addAttribute("blogs", blogs);
        return "blog/home";
    }

    @GetMapping("/create")
    public String create(Model model){
        model.addAttribute("blog",new Blog());
        return "blog/create";
    }

    @PostMapping("/create")
    public String create(@ModelAttribute Blog blog,@RequestParam Integer[] categoriesId,
                         RedirectAttributes redirectAttributes) {
        blogService.save(blog);
        List<BlogCategory> blogCategories = new ArrayList<>();

        for (Integer categoryId : categoriesId) {
            BlogCategory blogCategory = new BlogCategory();
            blogCategory.setBlog(blog);
            blogCategory.setCategory(categoryServiceImp.findById(categoryId));
            blogCategories.add(blogCategory);
            blog.setBlogCategories(blogCategories);
        }
        blogService.save(blog);
        blogCategoryService.saveAll(blogCategories);
        redirectAttributes.addFlashAttribute("success","delete success");
        return "blog/create";
    }

    @GetMapping("/{id}/edit")
    public String edit(@PathVariable Integer id, Model model) {
       Blog blog = blogService.findById(id);
       model.addAttribute("blog",blog);
       return "blog/edit";
    }

    @PostMapping("/edit")
    public String update(@ModelAttribute Blog blog,@RequestParam Integer[] categoriesId,
                         RedirectAttributes redirectAttributes) {
        List<BlogCategory> blogCategories = new ArrayList<>();
        BlogCategory blogCategory = new BlogCategory();

        for (Integer categoryId : categoriesId) {
            blogCategory.setBlog(blog);
            blogCategory.setCategory(categoryServiceImp.findById(categoryId));
            blogCategories.add(blogCategory);
            blog.setBlogCategories(blogCategories);
            blogService.save(blog);
        }

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
        List<BlogCategory> blogCategorySet = categoryServiceImp.findById(id).getBlogCategories();
        List<Blog> blogs = new ArrayList<>();
        for (BlogCategory blogCategory : blogCategorySet) {
           blogs.add(blogCategory.getBlog());
        }
      model.addAttribute("blogs",blogs);
        return "/blog/home";
    }
}
