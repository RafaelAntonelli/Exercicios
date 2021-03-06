package entities;

public class Banco {
	private String name;
	private int accountNumber;
	private double deposit;
	
	
	
	
	public Banco(int number, String name) {
		this.name = name;
		this.accountNumber = number;
	}
	
	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getAccountN() {
		return accountNumber;
	}

	public double getDeposit() {
		return deposit;
	}
	
	public void depositValue(double value) {
		deposit += value;
	}
	
	public void withdrawtValue(double value) {
		deposit -= value + 5.0;
	}
	
	public String toString() {
		return name
			+ ", Account: " 
			+  accountNumber
			+ ", Balance: $ " 
			+ String.format("%.2f", deposit);
	}
}