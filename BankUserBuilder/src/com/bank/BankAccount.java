package com.bank;

public class BankAccount {
	private Integer accountNumber;
	private String owner, branch;
	private double balance;
	
	@SuppressWarnings("unused")
	public BankAccount() {
		
	}
	public BankAccount(Integer accountNumber,String owner,String branch,double balance) {
		this.accountNumber = accountNumber;
		this.owner = owner;
		this.branch = branch;
		this.balance = balance;
	}

	public Integer getAccountNumber() {
		return accountNumber;
	}

	public void setAccountNumber(Integer accountNumber) {
		this.accountNumber = accountNumber;
	}

	public String getOwner() {
		return owner;
	}

	public void setOwner(String owner) {
		this.owner = owner;
	}

	public String getBranch() {
		return branch;
	}

	public void setBranch(String branch) {
		this.branch = branch;
	}

	public double getBalance() {
		return balance;
	}

	public void setBalance(double balance) {
		this.balance = balance;
	}
	
	@Override
	public String toString() {
		// TODO Auto-generated method stub
		return "Client: "+this.owner+", AccID: "+this.accountNumber+", Balance: "+this.balance;
	}
	
}
