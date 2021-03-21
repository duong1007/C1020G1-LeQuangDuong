package com.example.furama.service.employee;

import com.example.furama.model.employee.Employee;
import com.example.furama.service.MainService;

public interface EmployeeService extends MainService<Employee> {
    Employee findDuplicate(String duplicate);
}
