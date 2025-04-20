package com.paymentapplication.demo.models;
public class SendMoneyModel {
	private long amountToSend;
	private int fromMethod;
	private String fromBankAccount;
	private long recieverAccount;
	private String recieverBankName;
	public long getAmountToSend() {
		return amountToSend;
	}
	public void setAmountToSend(long amountToSend) {
		this.amountToSend = amountToSend;
	}
	public int getFromMethod() {
		return fromMethod;
	}
	public void setFromMethod(int fromMethod) {
		this.fromMethod = fromMethod;
	}
	public String getFromBankAccount() {
		return fromBankAccount;
	}
	public void setFromBankAccount(String fromBankAccount) {
		this.fromBankAccount = fromBankAccount;
	}
	public long getRecieverAccount() {
		return recieverAccount;
	}
	public void setRecieverAccount(long recieverAccount) {
		this.recieverAccount = recieverAccount;
	}
	public String getRecieverBankName() {
		return recieverBankName;
	}
	public void setRecieverBankName(String recieverBankName) {
		this.recieverBankName = recieverBankName;
	}
	
}
