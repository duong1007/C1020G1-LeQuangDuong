package manager_product.model.service;

import manager_product.model.bean.Product;

import java.util.List;

public interface ProductService {

    List<Product> findAll();

    void save(Product product);

    Product findById(Integer id);

    void update(Integer id, Product product);

    void delete(Integer id);

}
