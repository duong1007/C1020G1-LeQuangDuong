package com.example.libary_management.repository;

import com.example.libary_management.model.BorrowBook;
import org.springframework.data.jpa.repository.JpaRepository;

public interface BorrowBookRepository extends JpaRepository<BorrowBook,Integer> {
    BorrowBook findByBookCode(int bookCode);
}
