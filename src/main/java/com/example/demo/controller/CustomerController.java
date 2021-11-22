package com.example.demo.controller;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.example.demo.service.CustomerService;
import com.example.demo.model.Customer;

@RestController 
public class CustomerController {

	@Autowired    
	private CustomerService customerService;
	
	@RequestMapping(value="/customers/{id}", method=RequestMethod.GET)    
	public Optional<Customer> find(@PathVariable Long id) {  
		return customerService.find(id);    
	}  
	
	@RequestMapping(value="/customers/all", method=RequestMethod.GET)
	public List<Customer> findAll() {    
	return customerService.findAll();    
	}     
	
	@RequestMapping(value="/customers/delete/{id}", method=RequestMethod.POST)    
	public void delete(@PathVariable Long id) {    
		customerService.delete(id);    
	}  
	
	@RequestMapping(value="/customers/delete/all", method=RequestMethod.GET)    
	public void deleteAll() {    
		customerService.deleteAll();    
	}  
	
	@RequestMapping(value="/customers/create", method=RequestMethod.POST)    
	public void create(@RequestBody Customer customer) {    
		customerService.create(customer);    
	} 
	
	@RequestMapping(value="/customers/createX", method=RequestMethod.POST)    
	public void createX(@RequestBody List<Customer> customers) {    
		customerService.createX(customers);    
	} 
	
	@RequestMapping(value="/customers/count", method=RequestMethod.GET)    
	public long count() {    
		return customerService.count();    
	}  
	
}
