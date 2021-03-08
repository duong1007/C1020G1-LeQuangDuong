package com.example.libary_management.controller;

import com.example.libary_management.service.Imp.BorrowBookServiceImp;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("/borrow")
public class BorrowBookController {

    @Autowired
    BorrowBookServiceImp borrowBookServiceImp;

    @GetMapping("/")
    public String showCode(Model model) {
        model.addAttribute("borrows",borrowBookServiceImp.findAll());
        return "/borrow/code";
    }
}
