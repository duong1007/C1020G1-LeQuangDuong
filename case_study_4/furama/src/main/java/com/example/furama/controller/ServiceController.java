package com.example.furama.controller;

import com.example.furama.model.employee.Employee;
import com.example.furama.model.service.RentType;
import com.example.furama.model.service.Service;
import com.example.furama.model.service.ServiceType;
import com.example.furama.service.service.RentTypeService;
import com.example.furama.service.service.ServiceService;
import com.example.furama.service.service.ServiceTypeService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Pageable;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.validation.annotation.Validated;
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
        return "/service/villa/create";
    }

    @PostMapping("/service")
    public String createService(@Validated @ModelAttribute("service") Service service, BindingResult bindingResult){
        if (bindingResult.hasFieldErrors()){
            Long serviceTypeId = service.getServiceType().getServiceTypeId();
            if (serviceTypeId == 1L) {
                return "service/villa/create";
            } else if (serviceTypeId == 2L) {
                return "service/house/create";
            } else {
                return "service/room/create";
            }
        }
        serviceService.save(service);
        return "redirect:/service/list";
    }

    @GetMapping("/house")
    public String createHouse(Model model){
        model.addAttribute("service", new Service());
        return "/service/house/create";
    }

    @GetMapping("/room")
    public String createRoom(Model model){
        model.addAttribute("service", new Service());
        return "/service/room/create";
    }

    @GetMapping("/delete")
    public String deleteService(@RequestParam("id") Long id){
        serviceService.delete(id);
        return "redirect:/service/list";
    }

    @GetMapping("/{id}/edit")
    public String editService(@PathVariable Long id, Model model){
        Service service = serviceService.findById(id);
        model.addAttribute("service",service);
        Long serviceTypeId = service.getServiceType().getServiceTypeId();
        if (serviceTypeId == 1L) {
            return "service/villa/edit";
        } else if (serviceTypeId == 2L) {
            return "service/house/edit";
        } else {
            return "service/room/edit";
        }
    }

    @PostMapping("/edit")
    public String editService(@Validated @ModelAttribute("service") Service service, BindingResult bindingResult){
        if (bindingResult.hasFieldErrors()){
            Long serviceTypeId = service.getServiceType().getServiceTypeId();
            if (serviceTypeId == 1L) {
                return "service/villa/edit";
            } else if (serviceTypeId == 2L) {
                return "service/house/edit";
            } else {
                return "service/room/edit";
            }
        }
        serviceService.save(service);
        return "redirect:/service/list";

    }

}
