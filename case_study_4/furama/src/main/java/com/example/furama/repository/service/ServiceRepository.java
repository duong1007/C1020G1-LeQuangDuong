package com.example.furama.repository.service;

import com.example.furama.model.service.Service;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import javax.validation.constraints.NotEmpty;
import javax.validation.constraints.Pattern;


@Repository
public interface ServiceRepository extends JpaRepository<Service,Long> {
    Service findByServiceCode( String serviceCode);
}
