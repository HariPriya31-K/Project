package com.spring.domain;

import java.sql.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Table;



@Entity
@Table(name="UploadAccount")
public class Account {
	private int id;
	private String accountNo;
	private String securityNumber;
	private String accountType;
	private Date created;
	private Double balance;
	private int interestPerMonth;
	private User user;

	@Id
	@GeneratedValue
	public int getId() {
		return id;
	}

	
	public void setId() {
		this.id = id;
	}

	@Column
	public String getAccountNo() {
		return accountNo;
	}

	public void setAccountNo(String accountNo) {
		this.accountNo = accountNo;
	}

	@Column
	public String getSecurityNumber() {
		return securityNumber;
	}

	public void setSecurityNumber(String securityNumber) {
		this.securityNumber = securityNumber;
	}

	@Column
	public String getAccountType() {
		return accountType;
	}

	public void setAccountType(String accountType) {
		this.accountType = accountType;
	}

	@Column
	public Date getCreated() {
		return created;
	}

	public void setCreated(Date created) {
		this.created = created;
	}

	@Column
	public Double getBalance() {
		return balance;
	}

	public void setBalance(Double balance) {
		this.balance = balance;
	}

	@Column
	public int getInterestPerMonth() {
		return interestPerMonth;
	}

	public void setInterestPerMonth(int interestPerMonth) {
		this.interestPerMonth = interestPerMonth;
	}

	@Column
	public User getUser() {
		return user;
	}

	public void setUser(User user) {
		this.user = user;
	}

	public Account(int id, String accountNo, String securityNumber, String accountType, Date created, Double balance,
			int interestPerMonth, User user) {
		super();
		this.id = id;
		this.accountNo = accountNo;
		this.securityNumber = securityNumber;
		this.accountType = accountType;
		this.created = created;
		this.balance = balance;
		this.interestPerMonth = interestPerMonth;
		this.user = user;
	}

	public Account() {

	}
}
