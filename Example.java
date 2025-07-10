package test2;
import java.util.Scanner;
public class Example {
	public static void main(String[] arg) {
		int age;
		System.out.println("Enter age: ");
		Scanner input=new Scanner(System.in);
		age=input.nextInt();
		if (age>=18) {
			System.out.println("can vote");
		}
		else {
			System.out.println("cannot vote");
		}
	}
}
