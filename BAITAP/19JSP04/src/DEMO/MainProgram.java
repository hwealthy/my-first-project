package DEMO;

import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

public class MainProgram {
	public static void main(String[] args) throws SQLException, ClassNotFoundException {
		Customer customer = new Customer("nguyen thu thu dao",20,"quang tri",2000);
		CustomerDaoImpl CDI = new CustomerDaoImpl();
		((CustomerDaoImpl) CDI).addCustomer(customer);
		for(Customer ctms : CDI.showCustomer())
        {
      	  System.out.println("--------------------");
	          System.out.println("Id:" + ctms.getId());
	          System.out.println("name:" + ctms.getName());
	          System.out.println("age:" + ctms.getAge());
	          System.out.println("address: "+ctms.getAddress());
	          System.out.println("salary: "+ctms.getSalary());
        }
		
	}}

