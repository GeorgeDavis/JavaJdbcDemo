package org.davis.model;

public class Account {
	private String branch_name;
	private int account_number;
	private double balance;
  
  /*----------------------------------------------------------------
  * A simple Account class that has the constructor, getters, and
  * setters...
  -------------------------------------------------------------------*/
	
	public Account(int account_number, String branch_name,double balance)
	{
		this.account_number = account_number;
		this.branch_name = branch_name;
		this.balance = balance;
	}
	
	public int getAccount_number() {
		return account_number;
	}

	public void setAccount_number(int account_number) {
		this.account_number = account_number;
	}
	
	public String getBranch_name() {
		return branch_name;
	}
	public void setBranch_name(String branch_name) {
		this.branch_name = branch_name;
	}

	public double getBalance() {
		return balance;
	}
	public void setBalance(double balance) {
		this.balance = balance;
	}
	
}
