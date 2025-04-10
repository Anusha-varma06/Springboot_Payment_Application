package com.paymentsapplication.demo.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.paymentsapplication.demo.entity.TransactionDetailsEntity;

public interface TransactionDetailsRepository extends JpaRepository<TransactionDetailsEntity,Integer>{

}
