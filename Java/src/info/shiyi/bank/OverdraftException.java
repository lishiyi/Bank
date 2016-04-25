package info.shiyi.bank;

public class OverdraftException extends RuntimeException{
	
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	
	private double deficit;
	
	public OverdraftException(String msg, double deficit) {
		
		super(msg);
		this.deficit = deficit;
	}

	public double getDeficit() {
		return deficit;
	}

	public void setDeficit(double deficit) {
		this.deficit = deficit;
	}
	
	
}
