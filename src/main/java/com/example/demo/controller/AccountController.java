package com.example.demo.controller;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.example.demo.service.AccountService;
import com.example.demo.service.CustomerService;
import com.example.demo.model.Account;
import com.example.demo.model.Customer;

@RestController 
public class AccountController {

	@Autowired    
	private AccountService accountService;
	
	@RequestMapping(value="/accounts/{id}", method=RequestMethod.GET)    
	public Optional<Account> find(@PathVariable Long id) {  
		return accountService.find(id);    
	} 
	
	@RequestMapping(value="/accounts/customer/{id}", method=RequestMethod.GET)    
	public List<Account> findByCustomerId(@PathVariable Long id) {
		System.out.println("Controller: RECEIVED PARAMETER"+id);
		List<Account> accounts = new ArrayList<>();
		accounts = accountService.findByCustomerId(id);
		if(accounts != null) {
			return accounts;
	}
		return null;
	}
	
	
	@RequestMapping(value="/accounts/all", method=RequestMethod.GET)
	public List<Account> findAll() {    
	return accountService.findAll();    
	}     
	
	@RequestMapping(value="/accounts/delete/{id}", method=RequestMethod.POST)    
	public void delete(@PathVariable Long id) {    
		accountService.delete(id);    
	}  
	
	@RequestMapping(value="/accounts/delete/all", method=RequestMethod.GET)    
	public void deleteAll() {    
		accountService.deleteAll();    
	}  
	
	@RequestMapping(value="/accounts/create", method=RequestMethod.POST)    
	public void create(@RequestBody Account account) {    
		accountService.create(account);    
	} 
	
	@RequestMapping(value="/accounts/createX", method=RequestMethod.POST)    
	public void createX(@RequestBody List<Account> accounts) {    
		accountService.createX(accounts);    
	} 
	
	@RequestMapping(value="/accounts/count", method=RequestMethod.GET)    
	public long count() {    
		return accountService.count();    
	}  
	
}
