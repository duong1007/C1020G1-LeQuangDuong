package com.example.furama.service;

import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;

import java.util.List;
import java.util.Set;

public interface MainService<T> {

    Page<T> findAll(Pageable pageable);

    T findById(Long id);

    void save(T t);

    void delete(Long id);

    List<T> findAll();

}
