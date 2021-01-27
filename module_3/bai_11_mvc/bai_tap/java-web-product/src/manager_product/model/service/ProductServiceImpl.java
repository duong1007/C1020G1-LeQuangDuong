package manager_product.model.service;

import manager_product.model.bean.Product;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class ProductServiceImpl implements ProductService {

    private static Map<Integer, Product> productMap;

    static {
        productMap = new HashMap<>();
        productMap.put(1, new Product(1, "Xiaomi",100,"Smart Phone","China","https://encrypted-tbn0.gstatic.com/images?q=tbn:ANd9GcTNQQpnea_ohhr4DgntqF12vJho00VL4ddwTQ&usqp=CAU"));
        productMap.put(2, new Product(2, "Lg",100,"Television","Japan","https://encrypted-tbn0.gstatic.com/images?q=tbn:ANd9GcSnTuXgQRnmD5jPzh5AkdSnKRi3kUX3sBdnTg&usqp=CAU"));
        productMap.put(3, new Product(3, "Huawei",100,"Camera","Hong Kong","https://encrypted-tbn0.gstatic.com/images?q=tbn:ANd9GcTN1Uw47tXlFtI5Tm0C8nCQy_wg6kogtMMPBA&usqp=CAU"));
        productMap.put(4, new Product(4, "Iphone",100,"Smart Phone","America","https://encrypted-tbn0.gstatic.com/images?q=tbn:ANd9GcQR3_IxngpBd5BqZO2wU27rok4ru-b9ZfyXhw&usqp=CAU"));
        productMap.put(5, new Product(5, "Samsung",100,"fridge","Korea","https://encrypted-tbn0.gstatic.com/images?q=tbn:ANd9GcSdR9Ez-dxEJ8dBynZPP57sxu1vzEnKpZJZOA&usqp=CAU"));
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
    public Product findById(Integer id) {
        return productMap.get(id);
    }

    @Override
    public void update(Integer id, Product product) {
        productMap.put(id,product);
    }

    @Override
    public void delete(Integer id) {
        productMap.remove(id);

    }
}
