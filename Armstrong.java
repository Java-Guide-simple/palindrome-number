package interviewjavaprogram;

import java.util.Scanner;

/* Armstrong Number -- > If number equals to sum of cubes of its digits .
 * e.g  0 , 1 , 153 , 370 , 407 , etc .
 * 153 ---->  1 ---> 1*1*1 =   1
 *	  ------> 5 ---->5*5*5 = 125
 *	  ------->3 --->3*3*3  =  27
 *							+________
 *							 153
 * */

// Write a program to check given number is Armstrong number or not .
public class Armstrong {
	
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		System.out.println("Enter Number ");
		int number = scan.nextInt() ;
		int temp = number;
		int digit ;
		int sum = 0 ;
		
		while(number > 0) {
			digit = number % 10 ;
			sum = sum + (digit *digit *digit );
			number = number / 10 ;
			
		}
		
		if (sum == temp) {
			System.out.println(temp + " is armstrong");
		}else {
			System.out.println(temp + " is not armstrong");
		}
		
		
	}

}
