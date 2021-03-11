package com.example.globalcustomer.service;





import com.example.globalcustomer.model.Category;

import java.util.List;

public interface CategoryService {

    List<Category> findAll();

    Category findById(Integer id);

    void save(Category category);

    void delete(Integer id);



}
