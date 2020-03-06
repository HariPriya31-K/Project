package com.spring.domain;

public class SavingAccount {
	private int account_id;
	private String securityCode;
	private Double transactionLimit;
	private Double withdrawPerMonth;
	private int numberOfYears;

	public int getAccount_id() {
		return account_id;
	}

	public void setAccount_id(int account_id) {
		this.account_id = account_id;
	}

	public String getSecurityCode() {
		return securityCode;
	}

	public void setSecurityCode(String securityCode) {
		this.securityCode = securityCode;
	}

	public Double getTransactionLimit() {
		return transactionLimit;
	}

	public void setTransactionLimit(Double transactionLimit) {
		this.transactionLimit = transactionLimit;
	}

	public Double getWithdrawPerMonth() {
		return withdrawPerMonth;
	}

	public void setWithdrawPerMonth(Double withdrawPerMonth) {
		this.withdrawPerMonth = withdrawPerMonth;
	}

	public int getNumberOfYears() {
		return numberOfYears;
	}

	public void setNumberOfYears(int numberOfYears) {
		this.numberOfYears = numberOfYears;
	}

	public SavingAccount(int account_id, String securityCode, Double transactionLimit, Double withdrawPerMonth,
			int numberOfYears) {
		super();
		this.account_id = account_id;
		this.securityCode = securityCode;
		this.transactionLimit = transactionLimit;
		this.withdrawPerMonth = withdrawPerMonth;
		this.numberOfYears = numberOfYears;
	}

	public SavingAccount() {

	}
}
