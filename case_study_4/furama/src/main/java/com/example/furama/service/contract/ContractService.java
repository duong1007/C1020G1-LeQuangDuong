package com.example.furama.service.contract;

import com.example.furama.model.contract.Contract;
import com.example.furama.service.MainService;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;

public interface ContractService extends MainService<Contract> {

    Page<Contract> findAllByContractEndDateAfter(String s, Pageable pageable);
}
