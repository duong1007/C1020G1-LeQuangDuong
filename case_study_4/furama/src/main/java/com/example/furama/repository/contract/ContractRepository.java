package com.example.furama.repository.contract;

import com.example.furama.model.contract.Contract;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import javax.validation.constraints.NotNull;

@Repository
public interface ContractRepository extends JpaRepository<Contract,Long> {

    Page<Contract> findAllByContractStartDateBeforeAndContractEndDateAfter(String contractStartDate, String contractEndDate, Pageable pageable);
    Page<Contract> findAllByContractStartDateBeforeAndContractEndDateAfterAndCustomerContract_CustomerNameContaining(String contractStartDate,
                                                                                                           String contractEndDate,
                                                                                                           String customerContract_customerName,
                                                                                                           Pageable pageable);
}
