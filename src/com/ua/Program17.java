package com.ua;

import java.util.Scanner;

public class Program17 {
	public static void main(String[] args) {
		
/*
 		int[] numbers = {45, 2, 18, 95, 39, 36, 24};

		int sumEven = 0;
		int sumOdd = 0;
		int suma = 0;
		double averageEven = 0;
		double averageOdd = 0;
		double average = 0;
		int numEven = 0;
		int numOdd = 0;
		for(int i = 0; i < numbers.length; i++) {
			suma = suma + numbers[i];
			if(numbers[i] % 2 == 0) {
				sumEven = sumEven + numbers[i];
				++numEven;
			} else if(numbers[i] % 2 != 0) {
				sumOdd = sumOdd + numbers[i];
				++numOdd;
			}
			averageEven = (double)sumEven / numEven;
			averageOdd = (double)sumOdd / numOdd;
			average = (double) suma / numbers.length;
		}
		System.out.printf("the number of odd numbers: %d\n", numOdd);
		System.out.printf("the number of even numbers: %d\n", numEven);
		System.out.printf("Suma odd numbers: %d\n", sumOdd);
		System.out.printf("Suma even numbers: %d\n", sumEven);
		System.out.printf("Average even numbers: %.3f\n", averageEven);
		System.out.printf("Average odd numbers: %.3f\n", averageOdd);
		System.out.printf("Average all чисел: %.3f\n", average);
*/
		Person17 person1 = new Person17();
		Employee17 emp1 = new Employee17();
		Client17 c1 = new Client17();
		
		Scanner in = new Scanner(System.in);
		
		person1.display();
		emp1.display();
		c1.display();
		
		Person17.totalCounter();
		
		enterInfoPerson(person1, in);
		enterInfoEmployee(emp1, in);
		enterInfoClient(c1, in);
		
		person1.display();
		emp1.display();
		c1.display();
		
		Person17.totalCounter();
		in.close();
		
		}
	
	public static void enterInfoPerson(Person17 p, Scanner input) {
		System.out.print("Enter name: ");
		p.setName(input.nextLine());
	}
	public static void enterInfoEmployee(Employee17 e, Scanner input) {
		enterInfoPerson(e, input);
		System.out.print("Enter company: ");
		e.setCompany(input.nextLine());
	}
	public static void enterInfoClient(Client17 c, Scanner input) {
		enterInfoPerson(c, input);
		System.out.print("Enter many: ");
		c.setSum(Integer.parseInt(input.nextLine()));
		System.out.print("Enter bank: ");
		c.setBank(input.nextLine());
	}

}
