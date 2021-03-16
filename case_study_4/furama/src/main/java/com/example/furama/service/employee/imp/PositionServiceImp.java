package com.example.furama.service.employee.imp;

import com.example.furama.model.employee.Position;
import com.example.furama.repository.employee.PositionRepository;
import com.example.furama.service.employee.PositionService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class PositionServiceImp implements PositionService {
    @Autowired
    PositionRepository positionRepository;

    @Override
    public Page<Position> findAll(Pageable pageable) {
        return null;
    }

    @Override
    public Position findById(Long id) {
        return null;
    }

    @Override
    public void save(Position position) {

    }

    @Override
    public void delete(Long id) {

    }

    @Override
    public List<Position> findAll() {
        return positionRepository.findAll();
    }
}
