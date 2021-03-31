package com.example.furama.service.service.imp;

import com.example.furama.model.service.Service;
import com.example.furama.repository.service.ServiceRepository;
import com.example.furama.service.service.ServiceService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;

import java.util.List;

@org.springframework.stereotype.Service
public class ServiceServiceImp implements ServiceService {
    @Autowired
    ServiceRepository serviceRepository;

    @Override
    public Page<Service> findAll(Pageable pageable) {
        return serviceRepository.findAll(pageable);
    }

    @Override
    public Service findById(Long id) {
        return serviceRepository.findById(id).orElse(null);
    }

    @Override
    public void save(Service service) {
        serviceRepository.save(service);
    }

    @Override
    public void delete(Long id) {
        serviceRepository.deleteById(id);
    }

    @Override
    public List<Service> findAll() {
        return serviceRepository.findAll();
    }

    @Override
    public Service findDuplicate(String duplicate) {
        return serviceRepository.findByServiceCode(duplicate);
    }
}