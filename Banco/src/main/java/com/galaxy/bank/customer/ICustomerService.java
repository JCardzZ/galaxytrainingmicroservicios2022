package com.galaxy.bank.customer;

import java.util.List;
import java.util.Optional;

public interface ICustomerService {
	public List<Customer> findAll();
	public Optional<Customer> findById(Long id);
	public Customer save(Customer customer);
	public Customer update(Customer customer);
	public void delete(Customer customer);
	public List<Customer> findByFirstname(String firstname);
	public List<Customer> findByLastname(String lastname);
	
}
