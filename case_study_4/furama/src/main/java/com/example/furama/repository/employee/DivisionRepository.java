package com.example.furama.repository.employee;

import com.example.furama.model.Division;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface DivisionRepository extends JpaRepository<Division,Long> {

}
