package com.example.blog_one_to_many.controller;

import com.example.blog_one_to_many.model.Category;
import com.example.blog_one_to_many.service.CategoryService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.mvc.support.RedirectAttributes;

@Controller
@RequestMapping("/category")
public class CategoryController {

    @Autowired
    CategoryService categoryService;

    @GetMapping("/")
    public String home(Model model){
        model.addAttribute("categories", categoryService.findAll());
        return "/category/home";
    }

    @GetMapping("/create")
    public String create(Model model){
        model.addAttribute("category", new Category());
        return "/category/create";
    }

    @PostMapping("/create")
    public String save(Category category, Model model){
        categoryService.save(category);
        model.addAttribute("success","create success");
        return "/category/create";
    }

    @GetMapping("/{id}/edit")
    public String edit(@PathVariable Integer id, Model model){
        model.addAttribute("category", categoryService.findById(id));
        return "/category/edit";
    }

    @PostMapping("/edit")
    public String update(Category category,RedirectAttributes redirectAttributes){
        categoryService.save(category);
        redirectAttributes.addFlashAttribute("success","update success");
        return "redirect:/category/";
    }

    @GetMapping("/{id}/delete")
    public String delete(@PathVariable Integer id, RedirectAttributes redirectAttributes){
        categoryService.delete(id);
        redirectAttributes.addFlashAttribute("success","delete success");
        return "redirect:/category/";
    }

}
