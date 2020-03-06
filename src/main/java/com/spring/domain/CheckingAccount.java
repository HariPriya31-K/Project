package com.spring.domain;

public class CheckingAccount {
	private int account_id;
	private String depitCardNo;
	private String pinNumber;

	public int getAccount_id() {
		return account_id;
	}

	public void setAccount_id(int account_id) {
		this.account_id = account_id;
	}

	public String getDepitCardNo() {
		return depitCardNo;
	}

	public void setDepitCardNo(String depitCardNo) {
		this.depitCardNo = depitCardNo;
	}

	public String getPinNumber() {
		return pinNumber;
	}

	public void setPinNumber(String pinNumber) {
		this.pinNumber = pinNumber;
	}

	public CheckingAccount(int account_id, String depitCardNo, String pinNumber) {
		super();
		this.account_id = account_id;
		this.depitCardNo = depitCardNo;
		this.pinNumber = pinNumber;
	}

	public CheckingAccount() {

	}
}
