package model.service;

import model.bean.Customer;
import model.repository.Repository;
import model.repository.customer.CustomerRepositoryImp;

import java.util.List;

public class CustomerService implements Repository<Customer> {

    Repository<Customer> customerRepositoryImp = new CustomerRepositoryImp();


    @Override
    public void create(Customer customer) {
        customerRepositoryImp.create(customer);
    }

    @Override
    public List<Customer> readAll() {
        return customerRepositoryImp.readAll();
    }


    @Override
    public boolean update(Customer customer) {
        return customerRepositoryImp.update(customer);
    }

    @Override
    public boolean delete(int id) {
        return customerRepositoryImp.delete(id);
    }

    @Override
    public Customer findById(int id) {
        return customerRepositoryImp.findById(id);
    }

    @Override
    public List<Customer> findByName(String name) {
        return customerRepositoryImp.findByName(name);
    }
}
