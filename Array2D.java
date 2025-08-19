package lab;

import java.util.Scanner;

public class Array2D {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter number of rows: ");
		int row = sc.nextInt();
		System.out.println("Enter number of columns: ");
		int col = sc.nextInt();
		int [][] matrix = new int[row][col];
		
		
		for(int i=0;i<row;i++) {
			System.out.println("Enter the elements of row :"+i+"\n");	
			for(int j=0;j<col;j++) {
				matrix[i][j]=sc.nextInt();
			}
		}
		System.out.println("\nMatrix: \n");	

		for(int i=0;i<row;i++) {
			for(int j=0;j<col;j++) {
				System.out.print(matrix[i][j]+"\t");
			}
			System.out.print("\n");
		}
		
		System.out.println("\nTransposed matrix\n ");
		for(int i=0;i<col;i++) {
			for(int j=0;j<row;j++) {
				System.out.print(matrix[j][i]+"\t");
			}
			System.out.print("\n");
		}
	}
}
