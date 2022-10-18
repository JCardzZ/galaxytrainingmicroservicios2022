package com.galaxy.bank.customer;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;

public interface CustomerRepository extends JpaRepository<Customer, Long>{
	public List<Customer> findByFirstname(String firstname);
	public List<Customer> findByLastname(String lastname);
}
