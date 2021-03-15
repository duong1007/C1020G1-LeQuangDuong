package com.example.furama.repository.Customer;

import com.example.furama.model.CustomerType;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;


@Repository
public interface CustomerTypeRepository extends JpaRepository<CustomerType,Long> {
}
