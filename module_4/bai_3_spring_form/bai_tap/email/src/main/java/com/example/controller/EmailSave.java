package com.example.controller;


import com.example.model.SettingData;
import com.example.repository.Repository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.servlet.ModelAndView;

@Controller
public class EmailSave {

    @Autowired
    Repository repository;

    @GetMapping("/")
    public String index(){
        return "index";
    }

    @PostMapping("home")
    public ModelAndView showSetting() {
        SettingData settingData = repository.read();
        ModelAndView modelAndView = new ModelAndView("home");
        modelAndView.addObject("email",settingData);
        modelAndView.addObject("languages", new String[]{"English","Vietnamese","Japan","China"});
        modelAndView.addObject("pageSize", new String[]{"5","10","15","25","50","100"});
        return modelAndView;
    }

    @PostMapping("save")
    public ModelAndView setting(@ModelAttribute("email") SettingData email) {
        repository.save(email);
        return new ModelAndView("redirect:/");
    }
}
