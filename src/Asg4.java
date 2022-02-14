import java.util.Scanner;

/**
 * 
 * @author Jamie Long
 *
 */

public class Asg4 {
	
	
	
	public static void main(String[] args) {
		
		int triNum, recNum;
		
		Scanner input = new Scanner(System.in); // Initializing scanner
		/*Triangle handling*/
		System.out.println("Enter a positive integer for how big you would like the triangle to be: "); // Asking user for an integer for the size of the triangle
		triNum = input.nextInt();
		
		for(int i = 1; i <= triNum;i++) { //Generating Rows
			for(int k = 1; k <=i; k++) { //Generating Columns
			System.out.print(k+ " ");
			}
			System.out.println();
		}
		
		
		/*Rectangle handling*/
		
		
		System.out.println("Enter");
		recNum = input.nextInt();
		
		
		for (recNum = 1; recNum <= 9; recNum++) {
			
			for(int N = 1; N <=15; N++) {
				
				System.out.printf( "%10d", N * recNum);
			}
			System.out.println();
		}
		
		
		
		
		


		input.close(); // Closing scanner
		
	}

}
