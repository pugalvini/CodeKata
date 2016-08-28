package player;

import java.util.Scanner;

public class ReverseAString {
	
	public String reverseString(String str) {
		String newStr = "0";
		if(str.equalsIgnoreCase("null") || str.equalsIgnoreCase("")) {
			return null;
		}
		else {
			int len = str.length();
			while(len-1 >= 0) {
				newStr = newStr + str.charAt(len-1);
				len--;
			}
			return newStr.substring(1);
		}
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner scan = new Scanner(System.in);
		ReverseAString reverseAString = new ReverseAString();
		System.out.println("Input : ");
		String str = scan.nextLine();
		System.out.println("Output : "+reverseAString.reverseString(str));
		scan.close();
		
	}

}
