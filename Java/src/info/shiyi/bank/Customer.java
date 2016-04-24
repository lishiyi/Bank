package info.shiyi.bank;

import java.util.ArrayList;

public class Customer {
	
	final private String firstName;
	final private String lastName;
	private ArrayList<Account> accounts;

	public Customer(String firstName, String lastName) {
		
		this.firstName = firstName;
		this.lastName = lastName;
		this.accounts = new ArrayList<Account>();
	}

	public Account getAccount(int index) {
		return accounts.get(index);
	}

	public void addAccount(Account account) {
		accounts.add(account);
	}

	public String getFirstName() {
		return firstName;
	}

	public String getLastName() {
		return lastName;
	}
	
	public int getNumberOfAccounts(){
		return accounts.size();
	}
	
}
