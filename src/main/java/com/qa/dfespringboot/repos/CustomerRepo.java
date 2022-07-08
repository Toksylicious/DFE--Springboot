package com.qa.dfespringboot.repos;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.qa.dfespringboot.entities.Customer;

@Repository
public interface CustomerRepo extends JpaRepository<Customer, Long>{

	

}
