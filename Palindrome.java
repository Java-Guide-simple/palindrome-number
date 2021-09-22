package interviewjavaprogram;

import java.util.Scanner;

//Palindrome  --- Number or String that is same after reverse .
//e.g -- 545 , 454 , 345453 , 171 ,LOL , MADAM  , MAM  etc 
										 
public class Palindrome {	
	
	
		public static void main(String[] args) {
			Scanner scan = new Scanner(System.in);
			System.out.println("Enter String");
			String input = scan.nextLine();
			String reverse = "";
			
			for (int i = input.length(); i > 0; i--) {
				
				reverse = reverse + input.charAt(i-1);
				
			}
			if(reverse.equals(input)) {
				System.out.println(input + " is Palindrome String");
			}
			else {
				System.out.println(input + " is not Palindrome String");
			}
			
			
		}
	
	
	
	
	

}
