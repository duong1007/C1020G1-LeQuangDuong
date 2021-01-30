package model.repository;

import model.bean.Customer;

import java.util.List;

public interface CustomerRepository {

    void create(Customer customer);

    List<Customer> readAll();

    boolean update(Customer customer);

    boolean delete(int id);

    Customer findById(int id);

}
