package com.spring.domain;

import java.sql.Date;

public class User {
	private int id;
	private String name;
	private String userName;
	private String password;
	private Date DOB;
	private String adharNo;
	private String mobileNo;
	private String email;

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getUserName() {
		return userName;
	}

	public void setUserName(String userName) {
		this.userName = userName;
	}

	public String getPassword() {
		return password;
	}

	public void setPassword(String password) {
		this.password = password;
	}

	public Date getDOB() {
		return DOB;
	}

	public void setDOB(Date dOB) {
		DOB = dOB;
	}

	public String getAdharNo() {
		return adharNo;
	}

	public void setAdharNo(String adharNo) {
		this.adharNo = adharNo;
	}

	public String getMobileNo() {
		return mobileNo;
	}

	public void setMobileNo(String mobileNo) {
		this.mobileNo = mobileNo;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public User(int id, String name, String userName, String password, Date dOB, String adharNo, String mobileNo,
			String email) {
		super();
		this.id = id;
		this.name = name;
		this.userName = userName;
		this.password = password;
		DOB = dOB;
		this.adharNo = adharNo;
		this.mobileNo = mobileNo;
		this.email = email;
	}

	public User() {

	}
}
