package com.spring.dao;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.spring.domain.Account;
import com.spring.domain.CheckingAccount;

public class UserDAO {
	@Autowired
	SessionFactory sessionFactory;
	//CheckingAccount ca;

	public int createCheckingAccount(Account account) {
		Session session = sessionFactory.openSession();
		//session.save(account);
		if (session.save(account) != null)
			return 1;
		else
			return 0;

	}
}
