package com.example.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.ModelAndView;

@Controller
public class Calculator {

    @RequestMapping("/")
    public String calculators() {
        return "/index";
    }

    @RequestMapping("/calculator")
    public ModelAndView addition(@RequestParam double numberA, @RequestParam double numberB,
                                 @RequestParam String cal) {
        double result;
        switch (cal) {
            case "add":
                result = numberA + numberB;
                break;
            case "sub":
                result = numberA - numberB;
                break;
            case "mul":
                result = numberA*numberB;
                break;
            default:
                result = numberA/numberB;
        }
        return new ModelAndView("/index","result",result);
    }

}
