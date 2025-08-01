/*
 * Name: Sreehari Sreekumar Nair
 * Date: August 1, 2025
 * Purpose: Program to print student details and display the number of students using static variables and methods.
 */


class Student{
	String name;
	int rollNumber;
	static int studentCount=0;
	
	Student(String name,int rollNumber){
		this.name=name;
		this.rollNumber=rollNumber;
		studentCount++;
	}
	
	public void displayDetails() {
		System.out.println("Name: "+name);
		System.out.println("Roll Number: "+rollNumber);
	}
	
	public static void displayStudentCount() {
		System.out.println("Student count: "+studentCount+"\n");
	}
	
	
}
public class staticVar {
	public static void main(String[] args) {
		Student s1 = new Student("John Doe",26);
		s1.displayDetails();
		Student.displayStudentCount();
		
		Student s2 = new Student("Tom Frank",50);
		s2.displayDetails();
		Student.displayStudentCount();
		
		Student s3 = new Student("Rifan S",62);
		s3.displayDetails();
		Student.displayStudentCount();
	}
}
