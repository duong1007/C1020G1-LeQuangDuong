package model.service;

import model.bean.Customer;
import model.repository.CustomerRepository;
import model.repository.CustomerRepositoryImp;

import java.util.List;

public class CustomerService implements CustomerRepository{

    CustomerRepository customerRepositoryImp = new CustomerRepositoryImp();


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
}
