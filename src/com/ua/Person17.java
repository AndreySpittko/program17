package com.ua;

public class Person17 {
	private String name;
	
	public static int counter = 0;
	
	// create constructors
	public Person17() {
		this("Unknown");
	}
	public Person17(String name) {
		this.name = name;
		counter++;
	}
	
	// create get and set
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}

	// create metod
	public void display() {
		System.out.printf("Person %s\n", this.name);
	}
	// create metod counter
	public static void totalCounter() {
		System.out.printf("Total person: %d\n", counter);
	}

}
