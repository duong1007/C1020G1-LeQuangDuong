package product_manager.service.iml;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import product_manager.model.Product;
import product_manager.repository.ProductRepository;
import product_manager.repository.iml.ProductRepositoryIml;

import java.util.List;

@Service
public class ProductServiceIml implements ProductRepository {

    @Autowired
    ProductRepositoryIml productRepositoryIml;

    @Override
    public List<Product> findAll() {
        return productRepositoryIml.findAll();
    }

    @Override
    public Product findById(int id) {
        return productRepositoryIml.findById(id);
    }

    @Override
    public Product save(Product product) {
        return productRepositoryIml.save(product);
    }

    @Override
    public boolean exists(int id) {
        return productRepositoryIml.exists(id);
    }

    @Override
    public void delete(int id) {
        productRepositoryIml.delete(id);
    }
}
