package product_manager.controller;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.servlet.mvc.support.RedirectAttributes;
import product_manager.model.Product;
import product_manager.service.iml.ProductServiceIml;

import java.util.List;

@Controller
public class ProductController {

    @Autowired
    private ProductServiceIml productServiceIml;

    @GetMapping("/")
    public String index(Model model) {
        List<Product> products = productServiceIml.findAll();
        model.addAttribute("products",products);
        return "index";
    }

    @GetMapping("/create")
    public String create(Model model) {
        model.addAttribute("product", new Product());
        return "create";
    }

    @PostMapping("/create")
    public String save(Product product) {
        productServiceIml.save(product);
        return "redirect:/";
    }

    @GetMapping("/{id}/edit")
    public String update(@PathVariable Integer id,Model model) {
        Product product = productServiceIml.findById(id);
        model.addAttribute("product",product);
        return "edit";
    }

    @PostMapping("/edit")
    public String edit(Product product, RedirectAttributes redirectAttributes){
        productServiceIml.save(product);
        redirectAttributes.addFlashAttribute("success","add success ");
        return "redirect:/";
    }

    @GetMapping("/{id}/delete")
    public String delete(@PathVariable Integer id, RedirectAttributes redirectAttributes) {
        productServiceIml.delete(id);
        redirectAttributes.addFlashAttribute("success","delete success");
        return "redirect:/";
    }

    @GetMapping("/{id}/view")
    public String view(@PathVariable Integer id,Model model) {
        Product product = productServiceIml.findById(id);
        model.addAttribute("product",product);
        return "view";
    }
}
