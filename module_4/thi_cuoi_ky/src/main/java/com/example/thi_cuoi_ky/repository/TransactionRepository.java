package com.example.thi_cuoi_ky.repository;

import com.example.thi_cuoi_ky.model.Transaction;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import javax.validation.constraints.NotNull;

@Repository
public interface TransactionRepository extends JpaRepository<Transaction,String> {
    Page<Transaction> findAllByCustomer_CustomerNameContainingOrTransactionTypeContaining(String customer_customerName, @NotNull(message = "Transaction type not null") String transactionType, Pageable pageable);
}
