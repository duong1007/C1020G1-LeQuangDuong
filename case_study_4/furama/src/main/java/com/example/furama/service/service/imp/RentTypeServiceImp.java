package com.example.furama.service.service.imp;

import com.example.furama.model.RentType;
import com.example.furama.repository.service.RentTypeRepository;
import com.example.furama.service.service.RentTypeService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class RentTypeServiceImp implements RentTypeService {

    @Autowired
    RentTypeRepository rentTypeRepository;

    @Override
    public Page<RentType> findAll(Pageable pageable) {
        return null;
    }

    @Override
    public RentType findById(Long id) {
        return null;
    }

    @Override
    public void save(RentType rentType) {

    }

    @Override
    public void delete(Long id) {

    }

    @Override
    public List<RentType> findAll() {
        return rentTypeRepository.findAll();
    }
}
