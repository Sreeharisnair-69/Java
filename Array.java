package lab;
import java.util.Scanner;

public class Array {
	public static void main(String [] args) {
		System.out.println("Enter the number of elements: ");
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int [] array = new int[n];
		System.out.println("Enter the elements:\n");
		
		for(int i=0;i<n;i++) {
			array[i]=sc.nextInt();
		}
		
		System.out.println("\nArray:\n");
		
		for(int num:array) {
			System.out.print(num+"\t");
		}
		
		int largest = array[0];
		for(int i=0;i<n;i++) {
			if(array[i]>largest) {
				largest=array[i];
			}
		}
		
		System.out.println("\nLargest element is "+largest);
	}
}
