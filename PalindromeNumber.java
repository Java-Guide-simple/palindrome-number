package interviewjavaprogram;

import java.util.Scanner;

// Palindrome Number --- Number that is same after reverse .
// e.g -- 545 , 454 , 345453 , 171  e.g. 

// Write a program to check given number is Palindrome or Not .
public class PalindromeNumber {
	
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		System.out.println("Enter Number");
		 int number = scan.nextInt() ;
		 int oldNumber = number;
		 int newNumber = 0;
		 int r ;
		 
		 while(number > 0) {
			 
			 r = number % 10 ;
			 newNumber = (newNumber * 10) + r ;
			 number = number/10	;	
			 
			 
		 }
		 
		 if(oldNumber == newNumber) {
			 System.out.println(oldNumber + " is palindrome");
		 }else {
			 System.out.println(oldNumber + " is not palindrome");
		 }
		
		 
		
	}
	
}
