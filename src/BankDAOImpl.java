package org.davis.dao;

import javax.sql.DataSource;

import org.davis.model.Account;
import org.davis.model.Customer;
import org.davis.model.GeorgeDavis;
import org.springframework.stereotype.Component;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;

/*---------------------------------------------------------------------------------
 * This is the DAO class that interacts with the database
 * 
 * The class interacts with (3) tables in the database
 * --------------------------------------------------------------------------------
 * TABLE_NAME = Account
 * 
 * Account_Number |Branch_Name     |Balance     |Timestamp
 * --------------------------------------------------------------------------------
 * TABLE_NAME = Customer
 * 
 * Customer_Name |Customer_Street     |Customer_City     
 * --------------------------------------------------------------------------------
 * TABLE_NAME = Davis
 * 
 * Transaction_Number |Balance     |Timestamp     
 * --------------------------------------------------------------------------------
 * 
 * 
 * 
 *--------------------------------------------------------------------------------*/


//----------------------------------------------------------------------------Setters & Getters---------------------------------------------------------------------------

@Component
public class BankDAOImpl {
	
	private DataSource dataSource;
	private JdbcTemplate jdbcTemplate = new JdbcTemplate();
	

	public DataSource getDataSource() {
		return dataSource;
	}
	@Autowired
	public void setDataSource(DataSource dataSource) {
		this.jdbcTemplate = new JdbcTemplate(dataSource);	
	}
	
	
	//----------------------------------------------------Public SQL Methods for DAO class--------------------------------------------------------
	//--------------Account Table methods------------------------------
	public String getBranch_Name(int accountNum){
		String sql = "SELECT branch_name FROM account WHERE account_number=?";
		return jdbcTemplate.queryForObject(sql, new Object[]{accountNum}, String.class);
		//----The new Object[] array takes in the parameters of the query----	
	}
	
	public int accountsNotQualified(){
		String sql = "SELECT COUNT(*) FROM account WHERE balance <= 500";
		return jdbcTemplate.queryForObject(sql, Integer.class);	
	}
	//--------------Customer Table methods------------------------------
	public void insertCustomer(Customer customer){
		String sql ="INSERT INTO customer (Customer_Name,Customer_Street,Customer_City) VALUES (?,?,?)";
		jdbcTemplate.update(sql, new Object[] {customer.getCustomerName(), customer.getCustomerStreet(),customer.getCustomerCity()});
	}
	
	public String getCustomerStreet(String customerName){
		String sql = "SELECT customer_street FROM customer WHERE customer_name=?";
		return jdbcTemplate.queryForObject(sql, new Object[]{customerName}, String.class);
	}
	
	public int getCustomerCount(){
		String sql = "SELECT COUNT(*) FROM customer";
		return jdbcTemplate.queryForObject(sql, Integer.class);
	}
	//--------------Account Table methods------------------------------
	public int getAccountNums(){
		String sql = "SELECT COUNT(*) FROM account";
		return jdbcTemplate.queryForObject(sql, Integer.class);
	}
	
	public void updateBalance(GeorgeDavis davis){
		String sql ="INSERT INTO davis VALUES (default,?,CURRENT_TIMESTAMP)";
		jdbcTemplate.update(sql, new Object[] {davis.getBalance()});
	}
	
	public double checkBalance(){
		String sql = "SELECT SUM(balance) FROM davis";
		return jdbcTemplate.queryForObject(sql, Double.class);
	}
	

}
