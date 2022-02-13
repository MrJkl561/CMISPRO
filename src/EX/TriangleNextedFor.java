package EX;

import java.util.Scanner;

public class TriangleNextedFor {

	
	public static void main(String[] args) {
		
		Scanner input = new Scanner(System.in);
		System.out.println("Enter a positive integer for how big you would like the triangle to be: ");
		int triNum = input.nextInt();
		
		for(int i = 1; i <= triNum;i++) {
			for(int k = 1; k <=i; k++) {
			System.out.print(k+ " ");
			}
			System.out.println();
		}
		
		


		input.close();
		
	}
	
}
