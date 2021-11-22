package com.example.demo.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.demo.repository.CustomerRepository;
import com.example.demo.model.Customer;

import java.util.List;
import java.util.Optional;

@Service
public class CustomerService {
	
	@Autowired    
	private CustomerRepository customerRepository;    
	
	public Optional<Customer> find(Long id)	{ 
		return customerRepository.findById(id);    
	}
	
	public List<Customer> findAll() {  
		//List<Customer> customers = new ArrayList<>();    
		//customerRepository.findAll().forEach(customers::add);  
		return (List<Customer>) customerRepository.findAll();
	}    
	
	public void delete(Long id) {  
		customerRepository.deleteById(id);    
	}    
	
	public void deleteAll() {  
		customerRepository.deleteAll();    
	}    
	
	public void create(Customer customer)	{ 
		customerRepository.save(customer);    
	}
	
	public void createX(List<Customer> customer)	{    
		customerRepository.saveAll(customer);    
	}
	
	public long count() {    
		return customerRepository.count();    
	}
	
	public boolean exists(Long id) {    
		return customerRepository.existsById(id);    
	}


}
