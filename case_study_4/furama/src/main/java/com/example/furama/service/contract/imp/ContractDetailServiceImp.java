package com.example.furama.service.contract.imp;

import com.example.furama.model.contract.ContractDetail;
import com.example.furama.repository.contract.ContractDetailRepository;
import com.example.furama.service.contract.ContractDetailService;
import com.example.furama.service.contract.ContractService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class ContractDetailServiceImp implements ContractDetailService {
    @Autowired
    ContractDetailRepository contractDetailRepository;

    @Override
    public Page<ContractDetail> findAll(Pageable pageable) {
        return null;
    }

    @Override
    public ContractDetail findById(Long id) {
        return null;
    }

    @Override
    public void save(ContractDetail contractDetail) {
        contractDetailRepository.save(contractDetail);
    }

    @Override
    public void delete(Long id) {

    }

    @Override
    public List<ContractDetail> findAll() {
        return contractDetailRepository.findAll();
    }
}
