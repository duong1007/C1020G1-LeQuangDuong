package com.example.thi_cuoi_ky.service;

import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;

import java.util.List;
import java.util.Set;

public interface MainService<T> {

    Page<T> findAll(Pageable pageable);

    T findById(Integer id);

    void save(T t);

    void delete(Integer id);

    List<T> findAll();

    T findById(String id);

    void delete(String id);

}
