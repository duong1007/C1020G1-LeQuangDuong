package com.example.furama.service.account;

import com.example.furama.model.account.FuramaUser;
import com.example.furama.service.MainService;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;

import java.util.List;

public interface FuramaUserService {

    Page<FuramaUser> findAll(Pageable pageable);

    FuramaUser findById(String id);

    void save(FuramaUser t);

    void delete(String id);

    List<FuramaUser> findAll();

}
