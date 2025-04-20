package com.paymentapplication.demo.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.paymentapplication.demo.entities.TransactionDetailsEntity;

@Repository
public interface TransactionDetailsRepository extends JpaRepository<TransactionDetailsEntity,Integer>{
	
}
