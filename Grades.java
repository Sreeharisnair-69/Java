package test2;

import java.util.Scanner;

public class Grades {
	public static void main(String[] args) {
		int mark;
		System.out.println("Enter mark: ");
		Scanner input=new Scanner(System.in);
		mark=input.nextInt();
		if(mark>=90) {
			System.out.println("Grade A");
		}
		else if(75<=mark & mark<90) {
			System.out.println("Grade B");
		}
		else {
			System.out.println("Grade C");
		}
	}
}
