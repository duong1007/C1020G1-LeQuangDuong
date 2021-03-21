package com.example.furama.annotation.employee;

import com.example.furama.service.employee.EmployeeService;
import org.springframework.beans.factory.annotation.Autowired;

import javax.validation.ConstraintValidator;
import javax.validation.ConstraintValidatorContext;

public class ValidUniqueEmployee implements ConstraintValidator<UniqueEmployee,String> {

    @Autowired
    EmployeeService employeeService;

    @Override
    public boolean isValid(String value, ConstraintValidatorContext context) {

        return employeeService.findDuplicate(value) == null;
    }

}
