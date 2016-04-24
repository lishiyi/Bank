package info.shiyi.bank;

public class Account {
	
	protected double balance;
	
	public Account(double init_balance){
		
		this.balance = init_balance;
	}
	
	
	public double getBalance() {
		return balance;
	}
	
	public boolean deposit(double amt){
		
		this.balance += amt;
		return true;
	}
	
	public boolean withdraw(double amt){
		
		if(this.balance - amt < 0){
			return false;
		}
		this.balance -= amt;
		return true;
	}
}
