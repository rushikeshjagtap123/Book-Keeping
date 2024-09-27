package com.bookkeeping.model;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;

import java.math.BigDecimal;

@Entity
public class Account {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long id;

	private String accountName;
	private String accountType; 
	private BigDecimal balance;
	private String currency;

	public Account() {

	}

	public Account(Long id, String accountName, String accountType, BigDecimal balance, String currency) {
		super();
		this.id = id;
		this.accountName = accountName;
		this.accountType = accountType;
		this.balance = balance;
		this.currency = currency;
	}

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public String getAccountName() {
		return accountName;
	}

	public void setAccountName(String accountName) {
		this.accountName = accountName;
	}

	public String getAccountType() {
		return accountType;
	}

	public void setAccountType(String accountType) {
		this.accountType = accountType;
	}

	public BigDecimal getBalance() {
		return balance;
	}

	public void setBalance(BigDecimal balance) {
		this.balance = balance;
	}

	public String getCurrency() {
		return currency;
	}

	public void setCurrency(String currency) {
		this.currency = currency;
	}

	@Override
	public String toString() {
		return "Account [id=" + id + ", accountName=" + accountName + ", accountType=" + accountType + ", balance="
				+ balance + ", currency=" + currency + "]";
	}

}
