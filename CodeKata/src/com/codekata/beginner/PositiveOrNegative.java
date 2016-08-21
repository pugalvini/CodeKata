package com.codekata.beginner;

public class PositiveOrNegative {
	
	private int number;
	

	public PositiveOrNegative(int number) {
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
	
	
}
