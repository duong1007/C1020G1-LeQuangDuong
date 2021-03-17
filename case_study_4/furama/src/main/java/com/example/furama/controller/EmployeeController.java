package com.example.furama.controller;


import com.example.furama.model.employee.Division;
import com.example.furama.model.employee.EducationDegree;
import com.example.furama.model.employee.Employee;
import com.example.furama.model.employee.Position;
import com.example.furama.service.employee.DivisionService;
import com.example.furama.service.employee.EducationDegreeService;
import com.example.furama.service.employee.EmployeeService;
import com.example.furama.service.employee.PositionService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Pageable;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.validation.annotation.Validated;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@Controller
@RequestMapping("/employee")
public class EmployeeController {
    @Autowired
    EmployeeService employeeService;

    @Autowired
    DivisionService divisionService;

    @Autowired
    PositionService positionService;

    @Autowired
    EducationDegreeService educationDegreeService;


    @ModelAttribute("divisions")
    public List<Division> showDivision(){
        return divisionService.findAll();
    }

    @ModelAttribute("positions")
    public List<Position> showPosition(){
        return positionService.findAll();
    }

    @ModelAttribute("educationDegrees")
    public List<EducationDegree> showEducationDegree(){
        return educationDegreeService.findAll();
    }


    @GetMapping
    public String showEmployee(Model model, Pageable pageable){
        model.addAttribute("employees",employeeService.findAll(pageable));
        return "/employee/list";
    }

    @GetMapping("/create")
    public String createEmployee(Model model){
        model.addAttribute("employee",new Employee());
        return "/employee/create";
    }

    @PostMapping("/create")
    public String createEmployee(@Validated @ModelAttribute("employee") Employee employee, BindingResult bindingResult){
        if(bindingResult.hasFieldErrors()){
            return "/employee/create";
        }
        employeeService.save(employee);
        return "employee/create";
    }

    @GetMapping("/{id}/edit")
    public String editEmployee(@PathVariable Long id,Model model){
       model.addAttribute("employee", employeeService.findById(id));
       return "/employee/edit";
    }

    @PostMapping("/edit")
    public String editEmployee(@Validated @ModelAttribute("employee") Employee employee, BindingResult bindingResult){
        if(bindingResult.hasFieldErrors()){
            return "/employee/edit";
        }

        employeeService.save(employee);
        return "redirect:/employee";
    }

    @GetMapping("/delete")
    public String deleteEmployee(@RequestParam("id") Long id){
        employeeService.delete(id);
        return "redirect:/employee";
    }

}
