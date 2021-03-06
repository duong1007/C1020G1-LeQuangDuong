package com.example.libary_management.service.Imp;

import com.example.libary_management.model.Book;
import com.example.libary_management.model.BorrowBooks;
import com.example.libary_management.repository.BorrowBookRepository;
import com.example.libary_management.service.BorrowBookService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class BorrowBookServiceImp implements BorrowBookService {

    @Autowired
    BorrowBookRepository borrowBookRepository;

    @Override
    public List<BorrowBooks> findAll() {
        return borrowBookRepository.findAll();
    }

    @Override
    public void save(BorrowBooks borrowBook) {
        borrowBookRepository.save(borrowBook);
    }

    @Override
    public BorrowBooks findById(Integer id) {
        return borrowBookRepository.findById(id).orElse(null);
    }

    @Override
    public void delete(Integer id) {
        borrowBookRepository.deleteById(id);
    }
}
