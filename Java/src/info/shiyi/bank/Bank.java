package info.shiyi.bank;

import java.util.ArrayList;

public class Bank {
	
	private ArrayList<Customer> customers;
	
	private Bank() {

		this.customers = new ArrayList<Customer>();

	}
	
	private static Bank bank = new Bank();
	
	public static Bank getBank() {
		return bank;
	}
	
	
	
	public void addCustomer(String firstName, String lastName){
		
		Customer customer = new Customer(firstName, lastName);
		customers.add(customer);

	}

	public int getNumberOfCustomers() {
		return customers.size();
	}
	
	public Customer getCustomer(int index){
		return customers.get(index);
	}



}
