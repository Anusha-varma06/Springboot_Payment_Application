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
@Table(name="bankAccountDetails")
public class BankAccountsDetailsEntity {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name="id")
	private int bankAccountId ;
	@Column(name="accountNumber")
	private long accountNumber ;
	@Column(name="ifscCode")
	private String ifscCode;
	@Column(name="actStatus")
	private String actStatus;
	@Column(name="bankName")
	private String bankName;
	@Column(name="branchLocation")
	private String bankAccountBranchLocation;
	@Column(name="currentBalance")
	private double currentBalance;
	@ManyToOne
	@JoinColumn(name="userId")
	private UserDetailsEntity userDetails;
	public UserDetailsEntity getUserDetails() {
		return userDetails;
	}
	public void setUserDetails(UserDetailsEntity userDetails) {
		this.userDetails = userDetails;
	}
	public int getBankAccountId() {
		return bankAccountId;
	}
	public void setBankAccountId(int bankAccountId) {
		this.bankAccountId = bankAccountId;
	}
	public long getAccountNumber() {
		return accountNumber;
	}
	public void setAccountNumber(long accountNumber) {
		this.accountNumber = accountNumber;
	}
	public String getIfscCode() {
		return ifscCode;
	}
	public void setIfscCode(String ifscCode) {
		this.ifscCode = ifscCode;
	}
	public String getActStatus() {
		return actStatus;
	}
	public void setActStatus(String actStatus) {
		this.actStatus = actStatus;
	}
	public String getBankName() {
		return bankName;
	}
	public void setBankName(String bankName) {
		this.bankName = bankName;
	}
	public String getBankAccountBranchLocation() {
		return bankAccountBranchLocation;
	}
	public void setBankAccountBranchLocation(String bankAccountBranchLocation) {
		this.bankAccountBranchLocation = bankAccountBranchLocation;
	}
	
	public double getCurrentBalance() {
		return currentBalance;
	}
	public void setCurrentBalance(double currentBalance) {
		this.currentBalance = currentBalance;
	}
	
}