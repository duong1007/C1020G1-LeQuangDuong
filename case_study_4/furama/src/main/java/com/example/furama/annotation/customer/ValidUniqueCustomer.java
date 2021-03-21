package com.example.furama.annotation.customer;

import com.example.furama.annotation.customer.UniqueCustomer;
import com.example.furama.service.customer.CustomerService;
import org.springframework.beans.factory.annotation.Autowired;

import javax.validation.ConstraintValidator;
import javax.validation.ConstraintValidatorContext;

public class ValidUniqueCustomer implements ConstraintValidator<UniqueCustomer,String> {

    @Autowired
    CustomerService customerService;

    @Override
    public boolean isValid(String value, ConstraintValidatorContext context) {

        return customerService.findDuplicate(value) == null;
    }

}
