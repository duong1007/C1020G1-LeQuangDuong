package com.example.thi_cuoi_ky.service.transaction;

import com.example.thi_cuoi_ky.model.Transaction;
import com.example.thi_cuoi_ky.service.MainService;
import org.springframework.boot.autoconfigure.mail.MailProperties;
import org.springframework.data.domain.Page;

public interface TransactionService extends MainService<Transaction> {
    Page<Transaction> Search(String s);
}
