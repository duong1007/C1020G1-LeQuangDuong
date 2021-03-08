package com.example.libary_management.service.Imp;

import com.example.libary_management.model.BorrowBook;
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
    public List<BorrowBook> findAll() {
        return borrowBookRepository.findAll();
    }

    @Override
    public void save(BorrowBook borrowBook) {
        borrowBookRepository.save(borrowBook);
    }

    @Override
    public BorrowBook findById(Integer id) {
        return borrowBookRepository.findById(id).orElse(null);
    }

    @Override
    public void delete(BorrowBook borrowBook) {
        borrowBookRepository.delete(borrowBook);
    }

    @Override
    public BorrowBook findByBookCode(int bookCode) {
        return borrowBookRepository.findByBookCode(bookCode);
    }

}
