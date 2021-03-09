package com.example.customerrest.repository;


import com.example.customerrest.model.Customer;
import org.springframework.data.jpa.repository.JpaRepository;

@org.springframework.stereotype.Repository
public interface Repository extends JpaRepository<Customer,Long>{

}
