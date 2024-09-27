package com.bookkeeping.service;

import com.bookkeeping.model.Transaction;
import com.bookkeeping.repository.TransactionRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class TransactionService {

    @Autowired
    private TransactionRepository transactionRepository;

    public Transaction createTransaction(Transaction transaction) {
        return transactionRepository.save(transaction);
    }

    public List<Transaction> getFinancialReport() {
        return transactionRepository.findAll();
    }
}

