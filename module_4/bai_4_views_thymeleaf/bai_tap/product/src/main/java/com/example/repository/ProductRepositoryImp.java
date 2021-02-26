package com.example.repository;

import com.example.model.Product;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class ProductRepositoryImp implements ProductRepository {

    private static Map<Integer,Product> productMap;

    static {
        productMap = new HashMap<>();
        productMap.put(1,new Product(1,"Xiaomi",330.57,"China","Blah blah..."));
        productMap.put(2,new Product(2,"Iphone",256.67,"China","Blah blah..."));
        productMap.put(3,new Product(3,"Samsung",230,"China","Blah blah..."));
        productMap.put(4,new Product(4,"Lenovo",50.09,"China","Blah blah..."));
        productMap.put(5,new Product(5,"Huawei",137.5,"China","Blah blah..."));
    }

    @Override
    public List<Product> findAll() {
        return new ArrayList<>(productMap.values());
    }

    @Override
    public void save(Product product) {
        productMap.put(product.getId(),product);
    }

    @Override
    public Product findById(int id) {
        return productMap.get(id);
    }

    @Override
    public void update(int id, Product product) {
        productMap.put(id,product);
    }

    @Override
    public void remove(int id) {
        productMap.remove(id);
    }
}
