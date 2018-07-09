package com.ua;

public class Employee17 extends Person17 {
	
	private String company;
	
	// create constructors
	Employee17() {
		
	}
	Employee17(String name, String company) {
		super(name);
		this.company = company;
	}
	
	// create set and get
	public String getCompany() {
		return company;
	}
	public void setCompany(String company) {
		this.company = company;
	}
	
	// Override metod
	@Override
	public void display() {
		System.out.printf("Employee %s work in %s \n", super.getName(), this.company);
	}
	

}
