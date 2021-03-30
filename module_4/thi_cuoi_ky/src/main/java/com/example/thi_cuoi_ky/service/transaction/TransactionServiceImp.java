package com.example.thi_cuoi_ky.service.transaction;

import com.example.thi_cuoi_ky.model.Transaction;
import com.example.thi_cuoi_ky.repository.TransactionRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class TransactionServiceImp implements TransactionService{

    @Autowired
    TransactionRepository transactionRepository;

    @Override
    public Page<Transaction> findAll(Pageable pageable) {
        return transactionRepository.findAll(pageable);
    }


    @Override
    public Transaction findById(String id) {
        return transactionRepository.findById(id).orElse(null);
    }

    @Override
    public void save(Transaction transaction) {
        transactionRepository.save(transaction);
    }


    @Override
    public void delete(String id) {
        transactionRepository.deleteById(id);
    }

    @Override
    public List<Transaction> findAll() {
        return null;
    }

    @Override
    public void delete(Integer id) {

    }

    @Override
    public Transaction findById(Integer id) {
        return null;
    }

    @Override
    public Page<Transaction> Search(String s) {
        return null;
    }
}
