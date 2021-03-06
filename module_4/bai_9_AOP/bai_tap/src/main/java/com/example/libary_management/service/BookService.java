package com.example.libary_management.service;

import com.example.libary_management.model.Book;

import java.util.List;

public interface BookService {
    List<Book> findAll();

    void save(Book book);

    Book findById(Integer id);

    void delete(Integer id);
}
