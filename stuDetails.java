/*
 * Name: Sreehari Sreekumar Nair
 * Date: July 18, 2025
 * Purpose: Print details about students using classes, objects and parametric constructors.
 */
import java.util.Scanner;
class Student{
	String name;
	int rollNo;
	String dept;
	
	Student(String name, int rollNo, String dept){
		this.name = name;
		this.rollNo = rollNo;
		this.dept = dept;
	}
	
	public void printStudent() {
		System.out.println("Name: " + name);
		System.out.println("Roll No: " + rollNo);
		System.out.println("Department: " + dept);
	}
}
class stuDetails {
	public static void main(String[] args) {
		String name;
		int rollNo;
		String dept;
		Scanner sc = new Scanner(System.in);
		name = sc.nextLine();
		rollNo = sc.nextInt();
		sc.nextLine();
		dept = sc.nextLine();
		Student S1 = new Student(name,rollNo,dept);
		S1.printStudent();
	}
}
