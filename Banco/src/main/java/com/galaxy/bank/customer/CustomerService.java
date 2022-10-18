package com.galaxy.bank.customer;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class CustomerService implements ICustomerService{

	@Autowired
	private CustomerRepository repository;
	
	@Override
	public List<Customer> findAll() {
		return repository.findAll();
	}

	@Override
	public Optional<Customer> findById(Long id) {
		return repository.findById(id);
	}

	@Override
	public Customer save(Customer customer) {
		return repository.save(customer);
	}

	@Override
	public Customer update(Customer customer) {
		//Logica de validacion de existencia
		return repository.save(customer);
	}

	@Override
	public void delete(Customer customer) {
		repository.delete(customer);
		
	}

	@Override
	public List<Customer> findByFirstname(String firstname) {
		return repository.findByFirstname(firstname);
	}

	@Override
	public List<Customer> findByLastname(String lastname) {
		return repository.findByLastname(lastname);
	}

}
