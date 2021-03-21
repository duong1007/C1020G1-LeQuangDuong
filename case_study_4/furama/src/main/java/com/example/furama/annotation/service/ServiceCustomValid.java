package com.example.furama.annotation.service;

import com.example.furama.model.service.Service;
import com.example.furama.service.service.ServiceService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import org.springframework.validation.Errors;
import org.springframework.validation.Validator;

@Component
public class ServiceCustomValid implements Validator {
    @Autowired
    ServiceService serviceService;

    @Override
    public boolean supports(Class<?> clazz) {
        return Service.class.isAssignableFrom(clazz);
    }

    @Override
    public void validate(Object target, Errors errors) {
        Service service = (Service) target;
        if (serviceService.findDuplicate(service.getServiceCode()) != null){
            errors.rejectValue("serviceCode",null,"Service with this code is already exists.");
        }
    }
}
