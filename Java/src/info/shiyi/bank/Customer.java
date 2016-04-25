package info.shiyi.bank;

public class Customer {
	
	final private String firstName;
	final private String lastName;
	//private ArrayList<Account> accounts;
	private CheckingAccount checkingAccount;
	private SavingAccount savingAccount;

	public Customer(String firstName, String lastName) {
		
		this.firstName = firstName;
		this.lastName = lastName;
	}


	public String getFirstName() {
		return firstName;
	}

	public String getLastName() {
		return lastName;
	}


	public CheckingAccount getCheckingAccount() {
		return checkingAccount;
	}


	public void setCheckingAccount(CheckingAccount checkingAccount) {
		this.checkingAccount = checkingAccount;
	}


	public SavingAccount getSavingAccount() {
		return savingAccount;
	}


	public void setSavingAccount(SavingAccount savingAccount) {
		this.savingAccount = savingAccount;
	}
	
}
