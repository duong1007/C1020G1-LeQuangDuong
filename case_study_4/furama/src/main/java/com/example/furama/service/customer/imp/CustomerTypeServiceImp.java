package com.example.furama.service.customer.imp;

import com.example.furama.model.customer.CustomerType;
import com.example.furama.repository.customer.CustomerTypeRepository;
import com.example.furama.service.customer.CustomerTypeService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class CustomerTypeServiceImp implements CustomerTypeService {

    @Autowired
    CustomerTypeRepository customerTypeRepository;

    @Override
    public Page<CustomerType> findAll(Pageable pageable) {
        return null;
    }

    @Override
    public CustomerType findById(Long id) {
        return null;
    }

    @Override
    public void save(CustomerType customerType) {

    }

    @Override
    public void delete(Long id) {

    }

    @Override
    public List<CustomerType> findAll() {
        return customerTypeRepository.findAll();
    }
}
