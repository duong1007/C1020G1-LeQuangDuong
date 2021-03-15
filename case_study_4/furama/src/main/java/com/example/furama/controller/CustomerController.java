package com.example.furama.controller;

import com.example.furama.model.Customer;
import com.example.furama.model.CustomerType;
import com.example.furama.service.customer.CustomerService;
import com.example.furama.service.customer.CustomerTypeService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Pageable;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.servlet.mvc.support.RedirectAttributes;

import java.util.List;

@Controller
@RequestMapping("/customer")
public class CustomerController {

    @Autowired
    CustomerService customerService;

    @Autowired
    CustomerTypeService customerTypeService;

    @ModelAttribute("customerTypes")
    public List<CustomerType> customerTypes(){
        return customerTypeService.findAll();
    }

    @GetMapping
    public String showCustomer(Model model, Pageable pageable){
        model.addAttribute("customers",customerService.findAll(pageable));
        return "/customer/show";
    }

    @GetMapping("/create")
    public String create(Model model){
        model.addAttribute("customer",new Customer());
        return "/customer/create";
    }

    @PostMapping("/create")
    public String createCustomer(Model model,Customer customer){
        customerService.save(customer);
        model.addAttribute("success","Create success!!!!");
        return "/customer/create";
    }

    @GetMapping("{id}/edit")
    public String edit(Model model, @PathVariable Long id){
        model.addAttribute("customer",customerService.findById(id));
        return "/customer/edit";
    }

    @PostMapping("/edit")
    public String editCustomer(Customer customer){
        customerService.save(customer);
        return "redirect:/customer/show";
    }

    @GetMapping("/delete")
    public String deleteCustomer(@RequestParam("id") Long id, RedirectAttributes redirectAttributes){
        customerService.delete(id);
        redirectAttributes.addFlashAttribute("success","delete success");
        return "redirect:/";
    }
}
