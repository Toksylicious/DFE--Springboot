package com.qa.dfespringboot.controllers;

import java.util.ArrayList;
import java.util.List;

import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.qa.dfespringboot.entities.Customer;


@RestController
@RequestMapping("/customer")
public class CustomerController {

	private List<Customer> customers = new ArrayList<>();
	
	 @GetMapping("getAll")
	 public List<Customer> getAll() {
		 return this.customers;
		 
	 }
	 
	 @GetMapping("/getById/{id}")
	 public Customer getById(@PathVariable int id) {
		 return this.customers.get(id);
	 }

	
	 @PostMapping("/create")
	 public Customer create(@RequestBody Customer customer) {
		  this.customers.add(customer);
		return this.customers.get(this.customers.size() -1); //returns the latest entry added to the list
		 
	 }
	 
	 @PutMapping("/update/{id}")
	 public Customer update(@PathVariable int id, @RequestBody Customer customer) {
		 this.customers.remove(id);
		 
		 this.customers.add(id, customer);
		 
		 return this.customers.get(id);
		 
	 }
	 
	 @DeleteMapping("/delete/{id}") 
	 public Customer delete(@PathVariable int id) {
		 return this.customers.remove(id);
	 }
}
	

	 
