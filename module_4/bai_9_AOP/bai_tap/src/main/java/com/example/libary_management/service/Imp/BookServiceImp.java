package com.example.libary_management.service.Imp;

import com.example.libary_management.model.Book;
import com.example.libary_management.repository.BookRepository;
import com.example.libary_management.service.BookService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class BookServiceImp implements BookService {

    @Autowired
    BookRepository bookRepository;

    @Override
    public List<Book> findAll() {
        return bookRepository.findAll();
    }

    @Override
    public void save(Book book) {
        bookRepository.save(book);
    }

    @Override
    public Book findById(Integer id) {
        return bookRepository.findById(id).orElse(null);
    }

    @Override
    public void delete(Integer id) {
        bookRepository.deleteById(id);
    }
}
