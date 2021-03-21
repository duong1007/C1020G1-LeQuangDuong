package com.example.furama.controller;

import com.example.furama.model.customer.Customer;
import com.example.furama.model.customer.CustomerType;
import com.example.furama.service.customer.CustomerService;
import com.example.furama.service.customer.CustomerTypeService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Pageable;
import org.springframework.data.web.PageableDefault;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.validation.annotation.Validated;
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
    public String showCustomer(Model model,@PageableDefault(size = 5) Pageable pageable){
        model.addAttribute("customers",customerService.findAll(pageable));
        return "/customer/show";
    }

    @GetMapping("/create")
    public String create(Model model){
        model.addAttribute("customer",new Customer());
        return "/customer/create";
    }

    @PostMapping("/create")
    public String createCustomer(@Validated @ModelAttribute("customer") Customer customer, BindingResult bindingResult,
                                 RedirectAttributes redirectAttributes,Model model){
        if (bindingResult.hasFieldErrors()){
            model.addAttribute("warning","Validation Success");
            return "/customer/create";
        } else {
            customerService.save(customer);
            redirectAttributes.addFlashAttribute("messenger","Create Success!");
            return "redirect:/customer";
        }
    }

    @GetMapping("{id}/edit")
    public String edit(Model model, @PathVariable Long id){
        model.addAttribute("customer",customerService.findById(id));
        return "/customer/edit";
    }

    @PostMapping("/edit")
    public String editCustomer(@Validated @ModelAttribute("customer") Customer customer, BindingResult bindingResult,
                               Model model,
                               RedirectAttributes redirectAttributes){

        if (bindingResult.hasFieldErrors()){
            model.addAttribute("warning","Validation Success");
            return "/customer/edit";
        }
        customerService.save(customer);
        redirectAttributes.addFlashAttribute("messenger","Create Success!");
        return "redirect:/customer/show";
    }

    @GetMapping("/delete")
    public String deleteCustomer(@RequestParam("id") Long id, RedirectAttributes redirectAttributes){
        customerService.delete(id);
        redirectAttributes.addFlashAttribute("messenger","delete success");
        return "redirect:/";
    }

    @GetMapping("/search/customer")
    public String searchCustomer(@RequestParam("s") String s,Model model,Pageable pageable){
        model.addAttribute("customers",customerService.searchCustomer(s,pageable));
        return "/customer/show";

    }
}
