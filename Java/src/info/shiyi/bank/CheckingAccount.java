package info.shiyi.bank;

public class CheckingAccount extends Account{
	
	private SavingAccount protectedBy;
	//private double overdraftProtection;
	
	public CheckingAccount(double init_balance) {
		super(init_balance);
	}
	
	public CheckingAccount(double init_balance, SavingAccount protectedBy) {
		super(init_balance);
		this.protectedBy = protectedBy;
	}



	@Override
	public void withdraw(double amt){
		
		//enough
		if(balance >= amt){
			balance -= amt;
		}
		//overdraft
		else if(protectedBy == null){
			throw new OverdraftException("No overdraft protection", amt - balance);
		}
		else if(protectedBy.getBalance() >= (amt - balance)){
			balance = 0;
			protectedBy.withdraw(amt - balance);
		}
		else{
			throw new OverdraftException("Infuffiecnt funds for overdraft protection",
					amt - balance);
		}

	}
}
