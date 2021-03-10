package com.example.phone.service;

import com.example.phone.model.Smartphone;

public interface SmartphoneService {
    Iterable<Smartphone> findAll();
    Smartphone findById(Integer id);
    Smartphone save(Smartphone phone);
    Smartphone remove(Integer id);
}
