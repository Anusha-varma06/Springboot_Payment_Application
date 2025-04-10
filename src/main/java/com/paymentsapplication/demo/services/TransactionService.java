package com.paymentsapplication.demo.services;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.paymentsapplication.demo.repositories.TransactionDetailsRepository;

@Service
public class TransactionService {

	@Autowired
	private TransactionDetailsRepository txnrepo;
}
