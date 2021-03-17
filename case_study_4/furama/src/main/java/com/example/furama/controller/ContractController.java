package com.example.furama.controller;

import com.example.furama.model.contract.AttackService;
import com.example.furama.model.contract.Contract;
import com.example.furama.model.contract.ContractDetail;
import com.example.furama.model.customer.Customer;
import com.example.furama.model.employee.Employee;
import com.example.furama.model.service.Service;
import com.example.furama.service.contract.AttackServiceService;
import com.example.furama.service.contract.ContractDetailService;
import com.example.furama.service.contract.ContractService;
import com.example.furama.service.customer.CustomerService;
import com.example.furama.service.employee.EmployeeService;
import com.example.furama.service.service.ServiceService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Pageable;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.validation.annotation.Validated;
import org.springframework.web.bind.annotation.*;

import java.time.LocalDate;
import java.util.List;

@Controller
@RequestMapping("/contract")
public class ContractController {

    @Autowired
    ContractService contractService;

    @Autowired
    ContractDetailService contractDetailService;

    @Autowired
    AttackServiceService attackServiceService;

    @Autowired
    EmployeeService employeeService;

    @Autowired
    CustomerService customerService;

    @Autowired
    ServiceService serviceService;



    @ModelAttribute("attackServices")
    public List<AttackService> showAttack(){
        return attackServiceService.findAll();
    }

    @ModelAttribute("employees")
    public List<Employee> showEmployee(){
        return employeeService.findAll();
    }

    @ModelAttribute("customers")
    public List<Customer> showCustomer(){
        return customerService.findAll();
    }

    @ModelAttribute("services")
    public List<Service> showService(){
        return serviceService.findAll();
    }

    @GetMapping("/create/contract")
    public String createContract(Model model){
        model.addAttribute("contract",new Contract());
        return "/contract/create-contract";
    }

    @PostMapping("/create/contract")
    public String createContract(@Validated @ModelAttribute("contract") Contract contract, BindingResult bindingResult){
        if (bindingResult.hasFieldErrors()){
            return "/contract/create-contract";
        }
        contractService.save(contract);
        return "redirect:/";
    }

    @GetMapping("/create/detail")
    public String createContractDetail(Model model){
        model.addAttribute("contractDetail",new ContractDetail());
        return "/contract/create-detail";
    }

    @PostMapping("/create/detail")
    public String createContractDetail(ContractDetail contractDetail) {
        contractDetailService.save(contractDetail);
        return "redirect:/";
    }

    @GetMapping("/search/active")
    public String searchDate(Model model,Pageable pageable){

        model.addAttribute("contracts",contractService.findAllCustomerActive(LocalDate.now().toString(),pageable));
        return "/customer/active";

    }

    @PostMapping("/search/active")
    public String search(@RequestParam("name") String name,Pageable pageable,Model model){
        model.addAttribute("contracts",contractService.searchCustomerActive(LocalDate.now().toString(),name,pageable));
        return "/customer/active";
    }
}
