package product_manager.repository;

import product_manager.model.Product;

import java.util.List;

public interface ProductRepository {
    List<Product> findAll();

    Product findById(int id);

    Product save(Product product);

    boolean exists(int id);

    void delete(int id);


}
