package com.example.furama.controller;

import com.example.furama.model.account.FuramaUser;
import com.example.furama.model.employee.Employee;
import com.example.furama.service.account.FuramaUserService;
import com.example.furama.service.employee.EmployeeService;
import com.example.furama.util.WebUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Pageable;
import org.springframework.data.web.PageableDefault;
import org.springframework.security.core.Authentication;
import org.springframework.security.core.userdetails.User;
import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;

import java.security.Principal;

@Controller
public class MainController {

    @Autowired
    FuramaUserService furamaUserService;

    @Autowired
    EmployeeService employeeService;


    @GetMapping("/")
    public String home(){
        return "/home";
    }

    @GetMapping("/register")
    public String register(Model model){
        model.addAttribute("furamaUser",new FuramaUser());
        return "/account/register";
    }

    @PostMapping("/register")
    public String register(FuramaUser furamaUser,@RequestParam("employeeId") Long id){
        BCryptPasswordEncoder encoder = new BCryptPasswordEncoder();
        furamaUser.setPassword(encoder.encode(furamaUser.getPassword()));
        furamaUserService.save(furamaUser);

        Employee employee = employeeService.findById(id);
        employee.setFuramaUser(furamaUser);
        employeeService.save(employee);
        return "redirect:/";
    }

    @GetMapping("/login")
    public String loginPage(){
        return "/account/login";
    }

    @GetMapping(value = "/403")
    public String accessDenied(Model model, Principal principal) {

        if (principal != null) {
            User loginedUser = (User) ((Authentication) principal).getPrincipal();

            String userInfo = WebUtils.toString(loginedUser);

            model.addAttribute("userInfo", userInfo);

            String message = "Hi " + principal.getName() //
                    + "<br> You do not have permission to access this page!";
            model.addAttribute("message", message);

        }

        return "403Page";
    }

    @GetMapping(value = "/logoutSuccessful")
    public String logoutSuccessfulPage() {
        return "redirect:/login";
    }

    @GetMapping("/userAccountInfo")
    public String login(){
        return "/home";
    }

}
