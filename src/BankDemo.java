package org.davis.view;

import java.util.Scanner;

import org.davis.dao.BankDAOImpl;
import org.davis.model.Account;
import org.davis.model.Customer;
import org.davis.model.GeorgeDavis;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class BankDemo {

	public static void main(String[] args) {
		
		/*------------------------------------------------------------------------------------------
		 *  This is the main method class that interacts with the customer
		 * 
		 * Comment & Uncomment as necessary to perform different sql commands on the db
		 * 
		 * 
		 *-----------------------------------------------------------------------------------------*/
		
		ApplicationContext context = new ClassPathXmlApplicationContext("spring.xml");
		BankDAOImpl dao = context.getBean("bankDAOImpl", BankDAOImpl.class);
		
		//dao.insertCustomer(new Customer("John Smith","1330 George Bason Rd.","Charlotte"));
		
//		System.out.println(dao.getBranch_Name(123456789));
//		System.out.println(dao.getCustomerCount());
//		System.out.println(dao.getAccountNums());
//		System.out.println(dao.accountsNotQualified());
		System.out.println(dao.getCustomerStreet("John Smith"));
		
//		dao.updateBalance(new GeorgeDavis(-20.00));
//		
//		
//		double newBalance = dao.checkBalance();
//		System.out.println(newBalance);	
	}

}
