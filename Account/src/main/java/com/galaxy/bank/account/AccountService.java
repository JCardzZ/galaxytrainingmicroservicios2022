package com.galaxy.bank.account;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class AccountService {

	@Autowired
	private AccountRepository repository;

	public List<Account> findAll() {
		return repository.findAll();

	}

	public Account save(Account account) {
		return repository.save(account);
	}
}
