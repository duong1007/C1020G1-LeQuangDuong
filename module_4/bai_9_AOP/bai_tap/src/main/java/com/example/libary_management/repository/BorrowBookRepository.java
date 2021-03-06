package com.example.libary_management.repository;

import com.example.libary_management.model.BorrowBooks;
import org.springframework.data.jpa.repository.JpaRepository;

public interface BorrowBookRepository extends JpaRepository<BorrowBooks,Integer> {

}
