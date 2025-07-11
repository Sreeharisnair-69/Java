/*
 * Name: Sreehari Sreekumar Nair
 * Date: July 11, 2025
 * Purpose: Check whether given integer is palindrome or not.
 */

import java.util.Scanner;
public class IntPal {
	public static void main (String[] args) {
		int num, orginal;
		System.out.println("Enter number: ");
		Scanner inp = new Scanner(System.in);
		num = inp.nextInt();
		int reminder, reverse=0;
		orginal = num;
		
		while(num>0) {
			reminder = num%10;
			reverse = reverse*10 + reminder;
			num = num/10;
		}
		
		if (orginal == reverse) {
			System.out.println("Palindrome");
		}
		
		else {
			System.out.println("Not palindrome");
		}
	}
}
