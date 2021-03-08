package com.example.item_card.controller;

import com.example.item_card.model.Order;
import com.example.item_card.model.Product;
import com.example.item_card.service.imp.ProductServiceImp;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Pageable;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.servlet.mvc.support.RedirectAttributes;

import java.util.ArrayList;
import java.util.List;


@Controller
@SessionAttributes("cart")
public class ProductController {

    @Autowired
    ProductServiceImp productServiceImp;

    @ModelAttribute("cart")
    public List<Order> setUpCart(){
        return new ArrayList<>();
    }

    @GetMapping("/")
    public String showProduct(Model model, Pageable pageable){
        model.addAttribute("products", productServiceImp.finAll(pageable));
        return "/home";
    }

    @GetMapping("/create")
    public String create(Model model){
        model.addAttribute("product",new Product());
        return "/create";
    }

    @PostMapping("/create")
    public String create(Product product, Model model) {
        productServiceImp.save(product);
        model.addAttribute("mess","thêm thành công");
        return "/create";
    }

    @GetMapping("/{id}/view")
    public String showProduct(@PathVariable Integer id,Model model){
        model.addAttribute("product", productServiceImp.findById(id));
        return "/view";
    }

    @PostMapping("/{id}/cart")
    public String addToCart(@ModelAttribute("cart") List<Order> cart,
                            @PathVariable int id,
                            @RequestParam int amount,
                            RedirectAttributes redirectAttributes){
        cart.add(new Order(productServiceImp.findById(id),amount));
        redirectAttributes.addFlashAttribute("mess","Add Success");
        return "redirect:/";
    }


}
