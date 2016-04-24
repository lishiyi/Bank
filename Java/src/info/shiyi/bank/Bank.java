package info.shiyi.bank;

import java.util.ArrayList;

public class Bank {
	
	private ArrayList<Customer> customers;
	//private int numberOfCustomers;
	
	public Bank() {
		// TODO Auto-generated constructor stub
		this.customers = new ArrayList<Customer>();
		//this.numberOfCustomers = 0;
	}
	
	public void addCustomer(String firstName, String lastName){
		
		Customer customer = new Customer(firstName, lastName);
		customers.add(customer);
		//numberOfCustomers++;
	}

	public int getNumberOfCustomers() {
		return customers.size();
	}
	
	public Customer getCustomer(int index){
		return customers.get(index);
	}
}
