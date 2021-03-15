package com.example.furama.repository.employee;

import com.example.furama.model.EducationDegree;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface EducationDegreeRepository extends JpaRepository<EducationDegree,Long> {
}
