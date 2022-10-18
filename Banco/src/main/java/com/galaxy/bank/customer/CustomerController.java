package com.galaxy.bank.customer;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/cliente")
public class CustomerController {

	@Autowired
	private CustomerService service;
	
	@GetMapping("/listar")
	public List<Customer> listar(){
		return service.findAll();
	}
	
	@GetMapping("/buscarporid/{id}")
	public Optional<Customer> buscarporid(@PathVariable Long id) {
		return service.findById(id);
	}
	
	public Customer guardar(Customer customer) {
		return service.save(customer);
	}
}
