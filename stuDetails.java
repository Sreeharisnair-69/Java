/*
 * Name: Sreehari Sreekumar Nair
 * Date: July 18, 2025
 * Purpose: Print details about students using classes, objects and parametric constructors.
 */

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
		Student S1 = new Student("John",50,"CSE");
		Student S2 = new Student("Doe",25,"AD");
		S1.printStudent();
		S2.printStudent();	
	}
}
