package org.davis.model;

/*-------------------------------------------------------------
 * This class is just a basic customer profile. I probably should
 * have been more creative here, but.....
 * 
 * 
 * 
 * -------------------------------------------------------------*/


public class GeorgeDavis {
	
	private double balance;
	
	public GeorgeDavis(double balance){
		super();
		this.balance = balance;
	}
	
	public double getBalance() {
		return balance;
	}
	public void setBalance(double balance) {
		this.balance = balance;
	}

}
