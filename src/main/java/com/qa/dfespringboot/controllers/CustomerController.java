package com.qa.dfespringboot.controllers;


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
import com.qa.dfespringboot.service.CustomerService;


@RestController
@RequestMapping("/customer")
public class CustomerController {

	 private CustomerService service;
	 
	 public CustomerController(CustomerService service) {
		 this.service = service;
	 }
	
	 @GetMapping("getAll")
	 public List<Customer> getAll() {
		 return this.service.getAll();
		 
	 }
	 
	 @GetMapping("/getById/{id}")
	 public Customer getById(@PathVariable Long id) {
		 return this.service.getById(id);
		 
	 }

	
	 @PostMapping("/create")
	 public Customer create(@RequestBody Customer customer) {
      return this.service.create(customer);
	 }
	 
	 @PutMapping("/update/{id}")
	 public Customer update(@PathVariable Long id, @RequestBody Customer customer) {		 
		 return this.service.update(id, customer);
		 
	 }
	 
	 @DeleteMapping("/delete/{id}") 
	 public boolean delete(@PathVariable Long id) {
		 return this.service.delete(id);
		 
	 }
}
	

	 
