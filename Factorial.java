package interviewjavaprogram;

import java.util.Scanner;

// Factorial of 5 --->  5 | ---  5*4*3*2*1 = 120


public class Factorial {
	
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		System.out.println("Enter Number");
		int number =scan.nextInt();;
		int factorial = 1;
		
		for (int i = number ; i > 1 ; i--) {
			
			factorial = factorial * i ;
		   
		}
		System.out.println("factorial of "+ number + " is " + factorial);
		
	}
}
