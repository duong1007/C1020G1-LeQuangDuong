package model.service;

import model.bean.Employee;
import model.repository.Repository;
import model.repository.employee.EmployeeRepositoryImp;

import java.util.List;

public class EmployeeService implements Repository<Employee> {

    Repository<Employee> employeeRepository = new EmployeeRepositoryImp();

    @Override
    public void create(Employee employee) {
        employeeRepository.create(employee);
    }

    @Override
    public List<Employee> readAll() {
        return employeeRepository.readAll();
    }

    @Override
    public boolean update(Employee employee) {
        return employeeRepository.update(employee);
    }

    @Override
    public boolean delete(int id) {
        return employeeRepository.delete(id);
    }

    @Override
    public Employee findById(int id) {
        return employeeRepository.findById(id);
    }

    @Override
    public List<Employee> findByName(String name) {
        return employeeRepository.findByName(name);
    }
}
