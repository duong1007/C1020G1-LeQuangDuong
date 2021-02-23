package com.example.controller;

import com.example.model.Login;
import com.example.model.User;
import com.example.repository.Repository;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.servlet.ModelAndView;

import java.util.ArrayList;
import java.util.List;

@Controller
public class UserController {

    @GetMapping("/")
    public ModelAndView home(){
        return new ModelAndView("index", "login", new Login());
    }

    @PostMapping("/login")
    public ModelAndView login(@ModelAttribute("login") Login login){
        User user = Repository.checkLogin(login);
        if(user == null){
            return new ModelAndView("error");
        } else {
            ModelAndView modelAndView = new ModelAndView("user");
            modelAndView.addObject("user", user);
            return modelAndView;
        }
    }
}