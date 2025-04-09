package com.paymentapplication.demo.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.paymentapplication.demo.entities.BankAccountsDetailsEntity;

public interface BankAccountsDetailsRepository extends JpaRepository<BankAccountsDetailsEntity,Long>{
	
}
