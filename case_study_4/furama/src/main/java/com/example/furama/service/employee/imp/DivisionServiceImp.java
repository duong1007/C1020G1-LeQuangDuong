package com.example.furama.service.employee.imp;

import com.example.furama.model.Division;
import com.example.furama.repository.employee.DivisionRepository;
import com.example.furama.service.employee.DivisionService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class DivisionServiceImp implements DivisionService {
    @Autowired
    DivisionRepository divisionRepository;
    @Override
    public Page<Division> findAll(Pageable pageable) {
        return null;
    }

    @Override
    public Division findById(Long id) {
        return null;
    }

    @Override
    public void save(Division division) {

    }

    @Override
    public void delete(Long id) {

    }

    @Override
    public List<Division> findAll() {
        return divisionRepository.findAll();
    }
}
