package com.example.furama.controller;

import com.example.furama.model.contract.AttackService;
import com.example.furama.model.contract.Contract;
import com.example.furama.model.contract.ContractDetail;
import com.example.furama.service.contract.AttackServiceService;
import com.example.furama.service.contract.ContractDetailService;
import com.example.furama.service.contract.ContractService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Pageable;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;

import java.time.LocalDate;
import java.time.LocalDateTime;
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

    @ModelAttribute("attackServices")
    public List<AttackService> showAttack(){
        return attackServiceService.findAll();
    }

    @GetMapping("/create/contract")
    public String createContract(Model model){
        model.addAttribute("contract",new Contract());
        return "/contract/create-contract";
    }

    @PostMapping("/create/contract")
    public String createContract(Contract contract){
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

        model.addAttribute("contracts",contractService.findAllByContractEndDateAfter(LocalDate.now().toString(),pageable));
        return "/customer/active";

    }
}
