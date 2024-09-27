package com.bookkeeping.model;

import java.math.BigDecimal;
import java.time.LocalDateTime;
import java.util.Date;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToOne;

@Entity
public class Transaction {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long id;

	@ManyToOne
	@JoinColumn(name = "debit_account_id")
	private Account debitAccount;

	@ManyToOne
	@JoinColumn(name = "credit_account_id")
	private Account creditAccount;

	private BigDecimal amount;
	private String currency;
	private Date date;

	// Audit fields
	private String createdBy;
	private LocalDateTime createdAt;

	public Transaction() {

	}

	public Transaction(Long id, Account debitAccount, Account creditAccount, BigDecimal amount, String currency,
			Date date, String createdBy, LocalDateTime createdAt) {
		super();
		this.id = id;
		this.debitAccount = debitAccount;
		this.creditAccount = creditAccount;
		this.amount = amount;
		this.currency = currency;
		this.date = date;
		this.createdBy = createdBy;
		this.createdAt = createdAt;
	}

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public Account getDebitAccount() {
		return debitAccount;
	}

	public void setDebitAccount(Account debitAccount) {
		this.debitAccount = debitAccount;
	}

	public Account getCreditAccount() {
		return creditAccount;
	}

	public void setCreditAccount(Account creditAccount) {
		this.creditAccount = creditAccount;
	}

	public BigDecimal getAmount() {
		return amount;
	}

	public void setAmount(BigDecimal amount) {
		this.amount = amount;
	}

	public String getCurrency() {
		return currency;
	}

	public void setCurrency(String currency) {
		this.currency = currency;
	}

	public Date getDate() {
		return date;
	}

	public void setDate(Date date) {
		this.date = date;
	}

	public String getCreatedBy() {
		return createdBy;
	}

	public void setCreatedBy(String createdBy) {
		this.createdBy = createdBy;
	}

	public LocalDateTime getCreatedAt() {
		return createdAt;
	}

	public void setCreatedAt(LocalDateTime createdAt) {
		this.createdAt = createdAt;
	}

	@Override
	public String toString() {
		return "Transaction [id=" + id + ", amount=" + amount + ", currency=" + currency + ", date=" + date
				+ ", createdBy=" + createdBy + ", createdAt=" + createdAt + "]";
	}

}
