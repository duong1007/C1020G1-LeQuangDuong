package com.example.libary_management.service;


import com.example.libary_management.model.BorrowBook;

import java.util.List;

public interface BorrowBookService {
    List<BorrowBook> findAll();

    void save(BorrowBook borrowBook);

    BorrowBook findById(Integer id);

    void delete(BorrowBook borrowBook);

    BorrowBook findByBookCode(int bookCode);
}
