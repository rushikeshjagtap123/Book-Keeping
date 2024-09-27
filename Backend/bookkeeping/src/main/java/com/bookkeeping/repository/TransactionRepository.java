package com.bookkeeping.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.bookkeeping.model.Transaction;

public interface TransactionRepository extends JpaRepository<Transaction, Long> {

}
