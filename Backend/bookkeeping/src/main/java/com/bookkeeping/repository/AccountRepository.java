package com.bookkeeping.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.bookkeeping.model.Account;

public interface AccountRepository extends JpaRepository<Account, Long>{

}
