package com.example.thi_cuoi_ky.controller;

import com.example.thi_cuoi_ky.model.Customer;
import com.example.thi_cuoi_ky.model.Transaction;
import com.example.thi_cuoi_ky.service.customer.CustomerService;
import com.example.thi_cuoi_ky.service.transaction.TransactionService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Pageable;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.servlet.mvc.support.RedirectAttributes;

import javax.validation.Valid;
import java.util.List;

@Controller
public class TransactionController {

    @Autowired
    TransactionService transactionService;

    @Autowired
    CustomerService customerService;

    @ModelAttribute("customers")
    private List<Customer> showCustomer() {
        return customerService.findAll();
    }

    @GetMapping("/")
    public String showTransaction(Model model, Pageable pageable) {
        model.addAttribute("transactions", transactionService.findAll(pageable));
        return "/show";
    }

    @GetMapping("/create")
    public String createTransaction(Model model){
        model.addAttribute("transaction",new Transaction());
        return "/create";
    }

    @PostMapping("/create")
    public String createTransaction(@Valid @ModelAttribute("transaction") Transaction transaction,
                                    BindingResult bindingResult,Model model) {
        if(bindingResult.hasFieldErrors()){
            model.addAttribute("warning","Validation Success");
            return "/create";
        }
        transactionService.save(transaction);
        model.addAttribute("messenger","Create Success!");
        return "/create";
    }

    @GetMapping("{id}/view")
    public String viewTransaction(@PathVariable("id") String id,Model model){
        model.addAttribute("transaction",transactionService.findById(id));
        return "/view";
    }

    @GetMapping("/delete")
    public  String delete(@RequestParam("id") String id, RedirectAttributes redirectAttributes){
        transactionService.delete(id);
       redirectAttributes.addFlashAttribute("messenger","Delete success");
       return "redirect:/";
    }


}
