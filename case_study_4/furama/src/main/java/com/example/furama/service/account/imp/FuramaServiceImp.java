package com.example.furama.service.account.imp;

import com.example.furama.model.account.FuramaUser;
import com.example.furama.repository.account.FuramaUserRepository;
import com.example.furama.service.account.FuramaUserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class FuramaServiceImp implements FuramaUserService {
    @Autowired
    FuramaUserRepository furamaUserRepository;
    @Override
    public Page<FuramaUser> findAll(Pageable pageable) {
        return null;
    }

    @Override
    public FuramaUser findById(Long id) {
        return null;
    }

    @Override
    public void save(FuramaUser furamaUser) {
        furamaUserRepository.save(furamaUser);
    }

    @Override
    public void delete(Long id) {

    }

    @Override
    public List<FuramaUser> findAll() {
        return null;
    }
}
