package info.shiyi.bank;

public class SavingAccount extends Account{

	final private double interestRate;
	
	public SavingAccount(double init_balance, double interestRate) {
		super(init_balance);
		this.interestRate = interestRate;
	}

	public double getInterestRate() {
		return interestRate;
	}

}
