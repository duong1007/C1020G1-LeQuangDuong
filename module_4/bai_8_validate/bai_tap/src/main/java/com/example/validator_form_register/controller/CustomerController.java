package com.example.validator_form_register.controller;

import com.example.validator_form_register.model.Customer;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.validation.annotation.Validated;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;

@Controller
public class CustomerController {

    @GetMapping("/")
    public String showForm(Model model){
        model.addAttribute("customer",new Customer());
        return "/form";
    }

    @PostMapping("/")
    public String checkValid(@Validated @ModelAttribute("customer") Customer customer, BindingResult bindingResult){
        if(bindingResult.hasFieldErrors()){
            return "/form";
        } else {
            return "/result";
        }
    }
}
