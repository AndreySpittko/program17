package com.ua;

public class Client17 extends Person17 {
	
	private int sum;
	private String bank;
	
	//create constructors
	public Client17() {
		
	}
	public Client17(String name, int sum, String bank) {
		super(name);
		this.sum = sum;
		this.bank = bank;
	}

	// create set and get
	public int getSum() {
		return sum;
	}
	public void setSum(int sum) {
		this.sum = sum;
	}
	
	public String getBank() {
		return bank;
	}
	public void setBank(String bank) {
		this.bank = bank;
	}
	// Override metod
	@Override
	public void display() {
		System.out.printf("Cliant %s have %d$ in bank %s \n", super.getName(), this.sum, this.bank);

	}
	

}
