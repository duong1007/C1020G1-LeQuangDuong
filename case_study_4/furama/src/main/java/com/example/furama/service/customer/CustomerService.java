package com.example.furama.service.customer;

import com.example.furama.model.customer.Customer;
import com.example.furama.service.MainService;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;

public interface CustomerService extends MainService<Customer> {
    Customer findDuplicate(String duplicate);
    Page<Customer> searchCustomer(String s, Pageable pageable);
}
