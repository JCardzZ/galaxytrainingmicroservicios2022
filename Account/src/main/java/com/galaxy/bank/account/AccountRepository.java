package com.galaxy.bank.account;

import java.util.List;
import java.util.Optional;

import org.springframework.data.jpa.repository.JpaRepository;

public interface AccountRepository extends JpaRepository<Account, Long> {
	List<Account> findByCustomerId(String customerId);
	Optional<Account> findFirstByNumAccount(String numaccount);
}
