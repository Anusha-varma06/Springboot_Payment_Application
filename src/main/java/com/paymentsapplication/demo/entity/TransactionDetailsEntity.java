package com.paymentsapplication.demo.entity;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

@Entity
@Table(name="txn_details")
public class TransactionDetailsEntity {

	@Id
	@Column(name="txnId")
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	private int txnId;
	@Column(name="txnDate")
	private String txnDate;
	@Column(name="txnSourceUserId")
	private int sourceUserId;
	@Column(name="txnDestUserId")
	private int destUserId;
	@Column(name="txnSourceTypeId")
	private int sourceType;
	@Column(name="txnDestTypeId")
	private int destType;
	@Column(name="txnAmt")
	private long txnAmt;
	
}
