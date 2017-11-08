package org.davis.model;

/*-------------------------------------------------------
 * Simple Customer class with the constructor, getters,
 * and setters... 
 * 
 * -------------------------------------------------------*/

public class Customer {
	
	private String CustomerName;
	private String CustomerStreet;
	private String CustomerCity;
	
	
	public Customer(String customerName, String customerStreet,
			String customerCity) {
		super();
		CustomerName = customerName;
		CustomerStreet = customerStreet;
		CustomerCity = customerCity;
	}
	public String getCustomerName() {
		return CustomerName;
	}
	public void setCustomerName(String customerName) {
		CustomerName = customerName;
	}
	public String getCustomerStreet() {
		return CustomerStreet;
	}
	public void setCustomerStreet(String customerStreet) {
		CustomerStreet = customerStreet;
	}
	public String getCustomerCity() {
		return CustomerCity;
	}
	public void setCustomerCity(String customerCity) {
		CustomerCity = customerCity;
	}

}
