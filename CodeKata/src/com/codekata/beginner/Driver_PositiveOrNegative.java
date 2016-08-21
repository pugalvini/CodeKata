package com.codekata.beginner;

import java.util.Scanner;

public class Driver_PositiveOrNegative {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner scan = new Scanner(System.in);
		System.out.println("Enter a Number");
		int number = scan.nextInt();
		PositiveOrNegative positiveOrNegative = new PositiveOrNegative(number);
		positiveOrNegative.check();
		scan.close();
		
	}

}
