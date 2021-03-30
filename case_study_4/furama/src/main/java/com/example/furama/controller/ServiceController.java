package com.example.furama.controller;

import com.example.furama.model.service.RentType;
import com.example.furama.model.service.Service;
import com.example.furama.model.service.ServiceType;
import com.example.furama.service.service.RentTypeService;
import com.example.furama.service.service.ServiceService;
import com.example.furama.service.service.ServiceTypeService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Pageable;
import org.springframework.data.web.PageableDefault;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.WebDataBinder;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.servlet.mvc.support.RedirectAttributes;

import javax.validation.Valid;
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
    public String showList(Model model,@PageableDefault(size = 5) Pageable pageable){
        model.addAttribute("services",serviceService.findAll(pageable));
        return "/service/list";
    }

    @GetMapping("/villa")
    public String createVilla(Model model){

        model.addAttribute("service", new Service());
        return "/service/villa/create";
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
    public String deleteService(@RequestParam("id") Long id, RedirectAttributes redirectAttributes){
        serviceService.delete(id);
        redirectAttributes.addFlashAttribute("messenger","Delete Success!");
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


    @PostMapping("/service")
    public String createService(@Valid @ModelAttribute("service") Service service, BindingResult bindingResult,
                                @RequestParam("serviceTypeId") Long serviceTypeId, Model model, RedirectAttributes redirectAttributes){

        if (bindingResult.hasFieldErrors()){
            if (serviceTypeId == 1L) {
                if (serviceService.findDuplicate(service.getServiceCode()) != null){
                    bindingResult.rejectValue("serviceCode",null,"Service with code is existed");
                }
                model.addAttribute("warning","Validation Data!");
                return "service/villa/create";
            } else if (serviceTypeId == 2L) {
                if (serviceService.findDuplicate(service.getServiceCode()) != null){
                    bindingResult.rejectValue("serviceCode",null,"Service with code is existed");
                }
                model.addAttribute("warning","Validation Data!");
                return "service/house/create";
            } else {
                if (serviceService.findDuplicate(service.getServiceCode()) != null){
                    bindingResult.rejectValue("serviceCode",null,"Service with code is existed");
                }
                model.addAttribute("warning","Validation Data!");
                return "service/room/create";
            }
        }

        service.setServiceType(serviceTypeService.findById(serviceTypeId));
        serviceService.save(service);
        redirectAttributes.addFlashAttribute("messenger","Create Success!");
        return "redirect:/service/list";
    }

    @PostMapping("/edit")
    public String editService(@Valid @ModelAttribute("service") Service service, BindingResult bindingResult,Model model,RedirectAttributes redirectAttributes){
        if (bindingResult.hasFieldErrors()){
            Long serviceTypeId = service.getServiceType().getServiceTypeId();
            if (serviceTypeId == 1L) {
                model.addAttribute("warning","Validation Data!");
                return "service/villa/edit";
            } else if (serviceTypeId == 2L) {
                model.addAttribute("warning","Validation Data!");
                return "service/house/edit";
            } else {
                model.addAttribute("warning","Validation Data!");
                return "service/room/edit";
            }
        }
        serviceService.save(service);
        redirectAttributes.addFlashAttribute("messenger","Edit Success!");
        return "redirect:/service/list";

    }

}
