package com.example.demo.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.demo.model.Account;
import com.example.demo.repository.AccountRepository;
import com.example.demo.repository.CustomerRepository;

import java.util.List;
import java.util.Optional;

@Service
public class AccountService {
	
	@Autowired    
	private AccountRepository accountRepository;    
	
	@Autowired
	private CustomerRepository customerRepository;    

	
	public Optional<Account> find(Long id)	{ 
		return accountRepository.findById(id);    
	}
	
	public List<Account> findAll() {  
		//List<Customer> customers = new ArrayList<>();    
		//customerRepository.findAll().forEach(customers::add);  
		return (List<Account>) accountRepository.findAll();
	}    
	
	public List<Account> findByCustomerId(Long id) { 
		System.out.println("Account Service: RECEIVED PARAMETER"+id);
		if(customerRepository.existsById(id)) {
		return accountRepository.findByCustId(id);
		}
		return null;
	}    
	
	public void delete(Long id) {  
		accountRepository.deleteById(id);    
	}    
	
	public void deleteAll() {  
		accountRepository.deleteAll();    
	}    
	
	public void create(Account account)	{ 
		accountRepository.save(account);    
	}
	
	public void createX(List<Account> account)	{    
		accountRepository.saveAll(account);    
	}
	
	public long count() {    
		return accountRepository.count();    
	}

}
