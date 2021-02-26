package com.example.service;

import com.example.model.Product;
import com.example.repository.ProductRepository;
import com.example.repository.ProductRepositoryImp;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class ProductService implements ProductRepository {

    ProductRepository productRepository = new ProductRepositoryImp();

    @Override
    public List<Product> findAll() {
        return productRepository.findAll();
    }

    @Override
    public void save(Product product) {
        productRepository.save(product);
    }

    @Override
    public Product findById(int id) {
        return productRepository.findById(id);
    }

    @Override
    public void update(int id, Product product) {
        productRepository.update(id,product);
    }

    @Override
    public void remove(int id) {
        productRepository.remove(id);
    }
}
