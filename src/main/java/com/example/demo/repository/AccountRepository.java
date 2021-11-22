package com.example.demo.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.repository.CrudRepository;  
import com.example.demo.model.Account;    

public interface AccountRepository extends CrudRepository<Account, Long>,JpaRepository<Account, Long> {    
	
	List<Account> findByCustId(Long id);

}     
