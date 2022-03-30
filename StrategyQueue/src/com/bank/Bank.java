package com.bank;

public class Bank {
	private BankOperation operation;
	public void executeOperation() {
		operation.execute();
	}
	public void setOperation(BankOperation operation) {
		this.operation = operation;
	}
	public BankOperation getOperation() {
		return operation;
	}
}
