package com.example.controller;

import com.example.service.CalculatorService;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.ModelAndView;

@Controller
public class CalculatorController {

    @RequestMapping("/")
    public String calculators() {
        return "/index";
    }

    @RequestMapping("/calculator")
    public ModelAndView addition(@RequestParam double numberA, @RequestParam double numberB,
                                 @RequestParam String cal) {
        double result = CalculatorService.calculator(cal,numberA,numberB);
        return new ModelAndView("/index","result",result);
    }

}
