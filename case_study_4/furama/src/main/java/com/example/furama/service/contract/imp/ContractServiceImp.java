package com.example.furama.service.contract.imp;

import com.example.furama.model.contract.Contract;
import com.example.furama.repository.contract.ContractRepository;
import com.example.furama.service.contract.ContractService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class ContractServiceImp implements ContractService {
    @Autowired
    ContractRepository contractRepository;

    @Override
    public Page<Contract> findAll(Pageable pageable) {
        Page<Contract> contracts = contractRepository.findAll(pageable);
        for (Contract contract : contracts) {
            contract.setContractTotalMoney(100000000);
        }
        return contracts ;
    }

    @Override
    public Contract findById(Long id) {
        return contractRepository.findById(id).orElse(null);
    }

    @Override
    public void save(Contract contract) {
        contractRepository.save(contract);
    }

    @Override
    public void delete(Long id) {
        contractRepository.deleteById(id);
    }

    @Override
    public List<Contract> findAll() {
        return contractRepository.findAll();
    }

    @Override
    public Page<Contract> findAllCustomerActive(String s, Pageable pageable) {
        return contractRepository.findAllByContractStartDateBeforeAndContractEndDateAfter(s,s,pageable);
    }

    @Override
    public Page<Contract> searchCustomerActive(String s, String name, Pageable pageable) {
        return contractRepository.findAllByContractStartDateBeforeAndContractEndDateAfterAndCustomerContract_CustomerNameContaining(s,s,name,pageable);
    }
}
