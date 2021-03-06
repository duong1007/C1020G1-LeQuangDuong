package com.example.libary_management.service;


import com.example.libary_management.model.BorrowBooks;

import java.util.List;

public interface BorrowBookService {
    List<BorrowBooks> findAll();

    void save(BorrowBooks borrowBook);

    BorrowBooks findById(Integer id);

    void delete(Integer id);
}
