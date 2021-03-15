package com.example.furama.service.employee.imp;

import com.example.furama.model.EducationDegree;
import com.example.furama.repository.employee.EducationDegreeRepository;
import com.example.furama.service.employee.EducationDegreeService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class EducationDegreeServiceImp implements EducationDegreeService {
    @Autowired
    EducationDegreeRepository educationDegreeRepository;

    @Override
    public Page<EducationDegree> findAll(Pageable pageable) {
        return null;
    }

    @Override
    public EducationDegree findById(Long id) {
        return null;
    }

    @Override
    public void save(EducationDegree educationDegree) {

    }

    @Override
    public void delete(Long id) {

    }

    @Override
    public List<EducationDegree> findAll() {
        return educationDegreeRepository.findAll();
    }
}
