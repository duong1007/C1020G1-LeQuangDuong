package com.example.furama.service.contract.imp;

import com.example.furama.model.contract.AttackService;
import com.example.furama.repository.contract.AttackServiceRepository;
import com.example.furama.service.contract.AttackServiceService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class AttackServiceImp implements AttackServiceService {

    @Autowired
    AttackServiceRepository attackServiceRepository;

    @Override
    public Page<AttackService> findAll(Pageable pageable) {
        return null;
    }

    @Override
    public AttackService findById(Long id) {
        return null;
    }

    @Override
    public void save(AttackService attackService) {

    }

    @Override
    public void delete(Long id) {

    }

    @Override
    public List<AttackService> findAll() {
        return attackServiceRepository.findAll();
    }
}
