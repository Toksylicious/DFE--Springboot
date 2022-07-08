package com.qa.dfespringboot.service;

import java.util.List;

import org.springframework.stereotype.Service;

import com.qa.dfespringboot.entities.Customer;
import com.qa.dfespringboot.repos.CustomerRepo;

@Service
public class CustomerService {
	private CustomerRepo repo;
	
	public CustomerService(CustomerRepo repo) {
		this.repo = repo;
	}

	public List<Customer> getAll() {
		 return this.repo.findAll();
	}
		 
	public Customer getById(long id) {
			 return this.repo.findById(id).get();
			 
	}
	 public Customer create(Customer customer) {
		 return this.repo.saveAndFlush(customer);
		 
	 }
	 
	 public Customer update(Long id, Customer customer) {
		 Customer existing = repo.findById(id).get();
		 
		 existing.setFirstName(customer.getFirstName());
		 existing.setLastName(customer.getLastName());
		 existing.setEmail(customer.getEmail());
		 
		 return this.repo.saveAndFlush(existing);
	 }
	 
	 public boolean delete(Long id) {
		 this.repo.deleteById(id);
		 return !this.repo.existsById(id);
		 
		 
		 
				 
		 
	 }
}
