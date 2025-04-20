package com.paymentapplication.demo.entities;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToOne;
import jakarta.persistence.Table;

@Entity
@Table(name="transaction_details")
public class TransactionDetailsEntity {
	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	@Column(name="transaction_id")
	private int transactionId;
	@Column(name="transaction_date")
	private String transactionDate;
	@Column(name="transaction_src_userid")
	private int sourceUserId;
	@Column(name="transaction_dest_userid")
	private int destinationUserId;
	@Column(name="transaction_src_typeid")
	private int sourceTypeId;
	@Column(name="transaction_dest_typeid")
	private int destinationTypeId;
	@Column(name="transaction_amt")
	private long transactionAmount;
	@ManyToOne
	@JoinColumn(name="userId")
	private UserDetailsEntity user;
	public int getTransactionId() {
		return transactionId;
	}
	public void setTransactionId(int transactionId) {
		this.transactionId = transactionId;
	}
	public String getTransactionDate() {
		return transactionDate;
	}
	public void setTransactionDate(String transactionDate) {
		this.transactionDate = transactionDate;
	}
	public int getSourceUserId() {
		return sourceUserId;
	}
	public void setSourceUserId(int sourceUserId) {
		this.sourceUserId = sourceUserId;
	}
	public int getDestinationUserId() {
		return destinationUserId;
	}
	public void setDestinationUserId(int destinationUserId) {
		this.destinationUserId = destinationUserId;
	}
	public int getSourceTypeId() {
		return sourceTypeId;
	}
	public void setSourceTypeId(int sourceTypeId) {
		this.sourceTypeId = sourceTypeId;
	}
	public int getDestinationTypeId() {
		return destinationTypeId;
	}
	public void setDestinationTypeId(int destinationTypeId) {
		this.destinationTypeId = destinationTypeId;
	}
	public long getTransactionAmount() {
		return transactionAmount;
	}
	public void setTransactionAmount(long transactionAmount) {
		this.transactionAmount = transactionAmount;
	}
	public UserDetailsEntity getUser() {
		return user;
	}
	public void setUser(UserDetailsEntity user) {
		this.user = user;
	}
	
}
