package com.bookkeeping.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.bookkeeping.model.User;

public interface UserRepository extends JpaRepository<User, Long>{

	User findByUsername(String username);

}
