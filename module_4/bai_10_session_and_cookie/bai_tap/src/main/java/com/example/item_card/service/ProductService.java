package com.example.item_card.service;

import com.example.item_card.model.Product;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.stereotype.Service;


public interface ProductService {
    Page<Product> finAll(Pageable pageable);

    Product findById(Integer id);

    void save(Product product);

    void deleteById(Integer id);

}
