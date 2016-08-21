package com.codekata.beginner;

import java.util.Scanner;

public class PositiveOrNegativeOrZero {
	private int number;
	

	public PositiveOrNegativeOrZero(int number) {
		super();
		this.number = number;
	}

	public int getNumber() {
		return number;
	}

	public void setNumber(int number) {
		this.number = number;
	}
	
	void check() {
		
		if(number > 0)
			System.out.println("Positive Number");
		else if(number == 0)
			System.out.println("Zero");
		else
			System.out.println("Negative Number");
		
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scan = new Scanner(System.in);
		System.out.println("Enter a Number");
		int number = scan.nextInt();
		PositiveOrNegativeOrZero positiveOrNegative = new PositiveOrNegativeOrZero(number);
		positiveOrNegative.check();
		scan.close();
		

	}

}
