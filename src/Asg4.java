import java.util.Scanner;

/**
 * 
 * @author Jamie Long
 *
 * This program will ask the user for a positive integer for:
 * An accretion triangle from smallest to largest
 * And a decrementing rectangle with the smallest integer being in the middle
 *
 */

public class Asg4 {
	
	
	
	public static void main(String[] args) {
		
		int triNum, recNum; // Variables for different inputs using the scanner
		
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
		
		
		System.out.println("Enter an positive integer for your rectangle: ");
		recNum = input.nextInt();
		
		
		int rows = 9, columns = 9;// Setting rows and columns

		for(int i = 1; i<=rows; i++){
			  
			  for(int j = 1; j<= columns; j++){
				  
			    if(i == 1 || j==1 || i==rows || j == columns) // Outer rectangle
			      System.out.print(recNum);
			    
			    else if(i == 2 || j == 2 || i == rows -1 || j == columns -1){
			      System.out.print(recNum - 1); 
			      
			    }else if(i == 3 || j == 3 || i == rows-2 || j == columns -2){
			      System.out.print(recNum - 2);
			      
			   	}else if(i == 4 || j == 4 || i == rows-3 || j== columns-3){
			      System.out.print(recNum - 3);
			      
			     }else if(i == 5 || j == 5 || i == rows-4 || j == columns -4){ // Most inner part of rectangle
			      System.out.print(recNum - 4);

			    }
			  }
			  System.out.println();
			}

		input.close(); // Closing scanner
		
	}

}
