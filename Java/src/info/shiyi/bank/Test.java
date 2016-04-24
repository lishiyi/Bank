package info.shiyi.bank;

public class Test {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Bank bank = new Bank();
		Customer customer;
		Account account;
		
		System.out.println("Creating the customer Jane Smith");
		bank.addCustomer("Jane", "Smith");
		customer = bank.getCustomer(0);
		
		System.out.println("Creating her Savings Account with a 500.0 balance and 0.03 interetRate");
		customer.setSavingAccount(new SavingAccount(500.0, 0.05));
		customer.setCheckingAccount(new CheckingAccount(200.0, customer.getSavingAccount()));;
		
		System.out.println("Creating the customer Owen Bryant.");
		bank.addCustomer("Owen", "Braynt");
		customer = bank.getCustomer(1);
		
		System.out.println("Creating his Checking Account with a 500.0 and no overdraft protection.");
		customer.setCheckingAccount(new CheckingAccount(200.0));
		
		System.out.println("Creating ths customer Tim soley");
		bank.addCustomer("Tim", "Soley");
		customer = bank.getCustomer(2);
		
		System.out.println("Creating his Checking Account with a 500.00 balance and 500 in overdraft protection");
		customer.setSavingAccount(new SavingAccount(1500.00, 0.05));
		customer.setCheckingAccount(new CheckingAccount(200.0));
		
		/*******************************************/
		System.out.println("Creating the customer Maria Soley");
		bank.addCustomer("Maria", "Soley");
		customer = bank.getCustomer(3);
		
		System.out.println("Maria shares her Checking Account with her husband Tim Soley");
		customer.setCheckingAccount(bank.getCustomer(2).getCheckingAccount());
		customer.setSavingAccount(new SavingAccount(150.00, 0.05));
		
		System.out.println();
		//Generate a report
		System.out.println("\t\t\tCUSTOMERS REPORT");
		System.out.println("\t\t\t================");
		
		for(int cust_idx = 0; cust_idx < bank.getNumberOfCustomers(); cust_idx++){
			customer = bank.getCustomer(cust_idx);
			System.out.println();
			System.out.println("Customer: "
					+ customer.getLastName() + ", "
					+ customer.getFirstName());
			

			if(customer.getCheckingAccount() != null)  System.out.println("Checking Account : current balance is " + customer.getCheckingAccount().balance);
			if(customer.getSavingAccount() != null) System.out.println("Saving Account : current balance is " + customer.getSavingAccount().balance);
			
		}
		
		System.out.println();
		System.out.println("\t\t\t================");
		System.out.println();
		/*
		 * 
		 */
		System.out.println("Retrieving the customer Jane Smith with her saving account");
		customer = bank.getCustomer(0);
		account = customer.getSavingAccount();
		//Perform some transactions
		System.out.println("Withdraw 150.00: " + account.withdraw(150.00));
		System.out.println("Deposit 22.50: " + account.deposit(22.50));
		System.out.println("Withdraw 47.62: " + account.withdraw(47.62));
		System.out.println("Withdraw 400.00: " + account.withdraw(400.00));
		//Print out the final account balance.
		System.out.println("Cusomer [" + customer.getLastName() + ","
				+ customer.getFirstName() + "] has a balance of "
				+ account.getBalance());
		
		System.out.println();
		
		
		
		
		
		//Test a Checking Account w/o overdraft protection
		System.out.println("Retrieving the customer Owen Bryant with his checking account");
		customer = bank.getCustomer(1);
		account = customer.getCheckingAccount();
		//Perform some account transactions
		System.out.println("Withdraw 150.00: " + account.withdraw(150.00));
		System.out.println("Deposit 22.50: " + account.deposit(22.50));
		System.out.println("Withdraw 47.62: " + account.withdraw(47.62));
		System.out.println("Withdraw 400.00: " + account.withdraw(400.00));
		//Print out the final account balance.
		System.out.println("Cusomer [" + customer.getLastName() + ","
				+ customer.getFirstName() + "] has a balance of "
				+ account.getBalance());
		System.out.println();
		
		//Test a Checking Account with overdraft protection
		System.out.println("Retrieving the customer Tim Soley with his checking account");
		customer = bank.getCustomer(2);
		account = customer.getCheckingAccount();
		//Perform some account transactions
		System.out.println("Withdraw 150.00: " + account.withdraw(150.00));
		System.out.println("Deposit 22.50: " + account.deposit(22.50));
		System.out.println("Withdraw 47.62: " + account.withdraw(47.62));
		System.out.println("Withdraw 400.00: " + account.withdraw(400.00));
		//Print out the final account balance.
		System.out.println("Cusomer [" + customer.getLastName() + ","
				+ customer.getFirstName() + "] has a balance of "
				+ account.getBalance());
		System.out.println();
		
		//Test a Checking Account with overdraft protection
		System.out.println("Retrieving the customer Maria Soley with her joint");
		customer = bank.getCustomer(3);
		account = customer.getCheckingAccount();
		//Perform some account transactions
		System.out.println("Deposit 150.00: " + account.deposit(150.00));
		System.out.println("Withdraw 750.00: " + account.withdraw(750.00));
		//Print out the final account balance.
		System.out.println("Cusomer [" + customer.getLastName() + ","
				+ customer.getFirstName() + "] has a balance of "
				+ account.getBalance());
		System.out.println();		
	}
	

}
