package EX;

import java.util.Scanner;

public class ReverseFor {

	public static void main(String[] args) {
		int counter = 0;
		int num = 1;
		Scanner input = new Scanner(System.in);
		
		
		while(num  != 0) {
			System.out.println("Enter a integer(enter 0 to exit): ");
			num = input.nextInt();
			counter++;
		}
		input.close();
		/*ex: of reverse for loop*/
		for(int i =  counter -1; i>=0; i--) {
			
		}
		

	}

}
