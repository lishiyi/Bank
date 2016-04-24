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
	public boolean withdraw(double amt){
		
		//enough
		if(balance >= amt){
			balance -= amt;
		}
		//overdraft
		else if(protectedBy.getBalance() >= (amt - balance)){
			balance = 0;
			protectedBy.withdraw(amt - balance);
		}
		else{
			return false;
		}
		
		return true;
	}
}
