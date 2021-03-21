package com.example.furama.service.account.imp;

import com.example.furama.model.account.FuramaUser;
import com.example.furama.model.account.FuramaUserRole;
import com.example.furama.repository.account.FuramaUserRoleRepository;
import com.example.furama.service.account.FuramaUserRoleService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class FuramaUserRoleServiceImp implements FuramaUserRoleService {
    @Autowired
    FuramaUserRoleRepository furamaUserRoleRepository;

    @Override
    public Page<FuramaUserRole> findAll(Pageable pageable) {
        return null;
    }

    @Override
    public FuramaUserRole findById(Long id) {
        return null;
    }

    @Override
    public void save(FuramaUserRole furamaUserRole) {
        furamaUserRoleRepository.save(furamaUserRole);
    }

    @Override
    public void delete(Long id) {

    }

    @Override
    public List<FuramaUserRole> findAll() {
        return null;
    }

    @Override
    public List<FuramaUserRole> findAllByFuramaUser(FuramaUser furamaUser) {
        return furamaUserRoleRepository.findAllByFuramaUser(furamaUser);
    }
}
