package com.example.furama.service.account.imp;

import com.example.furama.model.account.FuramaRole;
import com.example.furama.repository.account.FuramaRoleRepository;
import com.example.furama.service.account.FuramaRoleService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.stereotype.Service;

import javax.management.relation.Role;
import java.util.List;

@Service
public class FuramaRoleServiceImp implements FuramaRoleService {
    @Autowired
    FuramaRoleRepository furamaRoleRepository;


    @Override
    public Page<FuramaRole> findAll(Pageable pageable) {
        return null;
    }

    @Override
    public FuramaRole findById(Long id) {
        return null;
    }

    @Override
    public void save(FuramaRole furamaRole) {
        furamaRoleRepository.save(furamaRole);
    }

    @Override
    public void delete(Long id) {

    }

    @Override
    public List<FuramaRole> findAll() {
        return null;
    }

    @Override
    public FuramaRole findByName(String name) {
        return furamaRoleRepository.findByFuramaRoleName(name);
    }
}
