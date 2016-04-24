package info.shiyi.bank;

public class CustomerReport {
	public CustomerReport() {
		// TODO Auto-generated constructor stub
	}
	public void generateReport(){
		
		Bank bank = Bank.getBank();
		Customer customer = null;
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
	}

}
