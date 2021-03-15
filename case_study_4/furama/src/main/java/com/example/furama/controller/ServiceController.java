package com.example.furama.controller;

import com.example.furama.model.RentType;
import com.example.furama.model.Service;
import com.example.furama.model.ServiceType;
import com.example.furama.service.service.RentTypeService;
import com.example.furama.service.service.ServiceService;
import com.example.furama.service.service.ServiceTypeService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Pageable;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@Controller
@RequestMapping("/service")
public class ServiceController {
    @Autowired
    ServiceService serviceService;

    @Autowired
    RentTypeService rentTypeService;

    @Autowired
    ServiceTypeService serviceTypeService;

    @ModelAttribute("rentTypes")
    public List<RentType> showRentType(){
        return rentTypeService.findAll();
    }

    @ModelAttribute("serviceTypes")
    public List<ServiceType> showServiceType(){
        return serviceTypeService.findAll();
    }

    @GetMapping("/list")
    public String showList(Model model, Pageable pageable){
        model.addAttribute("services",serviceService.findAll(pageable));
        return "/service/list";
    }

    @GetMapping("/villa")
    public String createVilla(Model model){
        model.addAttribute("service", new Service());
        return "/service/villa";
    }

    @PostMapping("/service")
    public String createService(Service service, @RequestParam Long idServiceType){
        service.setServiceType(serviceTypeService.findById(idServiceType));
        serviceService.save(service);
        return "/service/list";
    }

    @GetMapping("/house")
    public String createHouse(Model model){
        model.addAttribute("service", new Service());
        return "/service/house";
    }

    @GetMapping("/room")
    public String createRoom(Model model){
        model.addAttribute("service", new Service());
        return "/service/room";
    }
}
