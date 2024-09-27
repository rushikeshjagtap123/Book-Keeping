package com.bookkeeping.controller;

import com.bookkeeping.model.Transaction;
import com.bookkeeping.service.TransactionService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/transactions")
public class TransactionController {

    @Autowired
    private TransactionService transactionService;

    @PostMapping("/create")
    public ResponseEntity<Transaction> createTransaction(@RequestBody Transaction transaction) {
        Transaction createdTransaction = transactionService.createTransaction(transaction);
        return ResponseEntity.ok(createdTransaction);
    }

    @GetMapping("/report")
    public ResponseEntity<List<Transaction>> getFinancialReport() {
        List<Transaction> transactions = transactionService.getFinancialReport();
        return ResponseEntity.ok(transactions);
    }
}

