package product_manager.service;

import product_manager.model.Product;

import java.util.List;

public interface ProductService {
    List<Product> findAll();

    Product findById(int id);

    Product save(Product product);

    boolean exists(int id);

    void delete(int id);
}
