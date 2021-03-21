package com.example.furama.controller;


import com.example.furama.model.account.FuramaRole;
import com.example.furama.model.account.FuramaUser;
import com.example.furama.model.account.FuramaUserRole;
import com.example.furama.model.employee.Division;
import com.example.furama.model.employee.EducationDegree;
import com.example.furama.model.employee.Employee;
import com.example.furama.model.employee.Position;
import com.example.furama.service.account.FuramaRoleService;
import com.example.furama.service.account.FuramaUserRoleService;
import com.example.furama.service.account.FuramaUserService;
import com.example.furama.service.employee.DivisionService;
import com.example.furama.service.employee.EducationDegreeService;
import com.example.furama.service.employee.EmployeeService;
import com.example.furama.service.employee.PositionService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Pageable;
import org.springframework.data.web.PageableDefault;
import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.validation.annotation.Validated;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.servlet.mvc.support.RedirectAttributes;

import java.util.List;
import java.util.Optional;

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

    @Autowired
    FuramaUserService furamaUserService;

    @Autowired
    FuramaUserRoleService furamaUserRoleService;

    @Autowired
    FuramaRoleService furamaRoleService;



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
    public String showEmployee(Model model,@PageableDefault(size = 5) Pageable pageable){
        model.addAttribute("employees",employeeService.findAll(pageable));
        return "/employee/list";
    }

    @GetMapping("/create")
    public String createEmployee(Model model){
        model.addAttribute("employee",new Employee());
        return "/employee/create";
    }

    @PostMapping("/create")
    public String createEmployee(@Validated @ModelAttribute("employee") Employee employee, BindingResult bindingResult,
                                 @RequestParam Optional<String> createAccount,Model model){
        if(bindingResult.hasFieldErrors()){
            model.addAttribute("warning","Validation Data!");
            return "/employee/create";
        }

        if(createAccount.isPresent()){
            FuramaUser furamaUser = new FuramaUser();
            furamaUser.setUsername(employee.getEmployeeEmail());
            furamaUser.setPassword(new BCryptPasswordEncoder().encode("1"));
            employee.setFuramaUser(furamaUser);

            FuramaUserRole furamaUserRole = new FuramaUserRole();
            furamaUserRole.setFuramaUser(furamaUser);
            if (employee.getEmployeeDivision().getDivisionId() == 4L){
                furamaUserRole.setFuramaRole(furamaRoleService.findByName("ROLE_MANAGER"));
            } else {
                furamaUserRole.setFuramaRole(furamaRoleService.findByName("ROLE_EMPLOYEE"));
            }
            furamaUserService.save(furamaUser);
            furamaUserRoleService.save(furamaUserRole);
        }

        employeeService.save(employee);
        model.addAttribute("messenger","Create Success!");
        return "employee/create";
    }

    @GetMapping("/{id}/edit")
    public String editEmployee(@PathVariable Long id,Model model){
       model.addAttribute("employee", employeeService.findById(id));
       return "/employee/edit";
    }

    @PostMapping("/edit")
    public String editEmployee(@Validated @ModelAttribute("employee") Employee employee, BindingResult bindingResult,
                               Model model,
                               RedirectAttributes redirectAttributes){
        if(bindingResult.hasFieldErrors()){
            model.addAttribute("warning","Validation Data!");
            return "/employee/edit";
        }

        employeeService.save(employee);
        redirectAttributes.addFlashAttribute("messenger","Edit Success");
        return "redirect:/employee";
    }

    @GetMapping("/delete")
    public String deleteEmployee(@RequestParam("id") Long id,RedirectAttributes redirectAttributes){
        employeeService.delete(id);
        redirectAttributes.addFlashAttribute("messenger","Delete Success!");
        return "redirect:/employee";
    }

}
