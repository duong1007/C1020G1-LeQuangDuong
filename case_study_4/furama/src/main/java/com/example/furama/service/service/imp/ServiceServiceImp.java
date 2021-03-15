package com.example.furama.service.service.imp;

import com.example.furama.model.Service;
import com.example.furama.service.service.ServiceService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;

import java.util.List;

@org.springframework.stereotype.Service
public class ServiceServiceImp implements ServiceService {
    @Autowired
    ServiceService serviceService;

    @Override
    public Page<Service> findAll(Pageable pageable) {
        return null;
    }

    @Override
    public Service findById(Long id) {
        return null;
    }

    @Override
    public void save(Service service) {
        serviceService.save(service);
    }

    @Override
    public void delete(Long id) {

    }

    @Override
    public List<Service> findAll() {
        return null;
    }
}
