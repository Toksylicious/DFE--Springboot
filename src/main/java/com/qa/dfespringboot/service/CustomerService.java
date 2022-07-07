package com.qa.dfespringboot.service;

import java.util.ArrayList;
import java.util.List;

import org.springframework.stereotype.Service;

import com.qa.dfespringboot.entities.Customer;

@Service
public class CustomerService {
	private List<Customer> customers = new ArrayList<>();

	public List<Customer> getAll() {
		 return this.customers;
	}
		 
	public Customer getById(int id) {
			 return this.customers.get(id);
	}
	 public Customer create(Customer customer) {
		  this.customers.add(customer);
		return this.customers.get(this.customers.size() -1);
	 }
	 
	 public Customer update(int id, Customer customer) {
		 this.customers.remove(id);
		 
		 this.customers.add(id, customer);
		 
		 return this.customers.get(id);
	 }
	 
	 public Customer delete(int id) {
		 return this.customers.remove(id);
	 }
}
