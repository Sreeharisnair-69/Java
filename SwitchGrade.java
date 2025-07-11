import java.util.Scanner;
public class SwitchGrade {
	public static void main(String[] args) {
		String grade;
		System.out.println("Enter grade: ");
		Scanner input = new Scanner(System.in);
		grade = input.nextLine();
		
		String result = switch (grade){
			case "S" -> "Outstanding";
			case "A+" -> "Excellent";
			case "A" -> "Very Good";
			case "B" -> "Good";
			case "C" -> "Above Average";
			case "D" -> "Average";
			case "E" -> "Pass";
			case "F" -> "Fail";
			default -> "Invalid";
		};
		
		System.out.println("Grade: "+ grade);
		System.out.println("Result: " + result);
	}

}
