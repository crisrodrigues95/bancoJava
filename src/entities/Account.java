package entities;

public class Account {
	private String name;
	private int anumber;
	private double amount;
	
	
	public Account (String name, int anumber, double initialDeposit) {
		
		this.name = name;
		this.anumber = anumber;
		addAmount(initialDeposit);
	}
	
	public Account (String name, int anumber) {
		
		this.name = name;
		this.anumber = anumber;
		
	}


	public String getName() {
		return name;
	}


	public void setName(String name) {
		this.name = name;
	}


	public int getAnumber() {
		return anumber;
	}



	public double getAmount() {
		return amount;
	}


	protected void setAnumber(int anumber) {
		this.anumber = anumber;
	}


	
	public void addAmount (double amount) {
		this.amount += amount;
	}
	
	public void reduceAmount (double amount) {
		this.amount -= 5+amount;
	}
	
	public String toString() {
		return 
		"Account " +
		anumber +
		", " +
		"Holder: " +
		name +
		",  Balance: $ " +
		String.format("%.2f", amount);
		
		
		
		
		
	}
	
	



	
	
	
	

}
