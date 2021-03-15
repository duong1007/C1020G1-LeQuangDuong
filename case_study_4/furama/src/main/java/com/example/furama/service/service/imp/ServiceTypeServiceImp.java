package com.example.furama.service.service.imp;

import com.example.furama.model.RentType;
import com.example.furama.model.ServiceType;
import com.example.furama.repository.Service.ServiceTypeRepository;
import com.example.furama.service.service.RentTypeService;
import com.example.furama.service.service.ServiceTypeService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class ServiceTypeServiceImp implements ServiceTypeService {

    @Autowired
    ServiceTypeRepository serviceTypeRepository;

    @Override
    public Page<ServiceType> findAll(Pageable pageable) {
        return null;
    }

    @Override
    public ServiceType findById(Long id) {
        return serviceTypeRepository.findById(id).orElse(null);
    }

    @Override
    public void save(ServiceType serviceType) {

    }

    @Override
    public void delete(Long id) {

    }

    @Override
    public List<ServiceType> findAll() {
        return serviceTypeRepository.findAll();
    }


}
