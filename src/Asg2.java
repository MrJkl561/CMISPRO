import java.util.Scanner;

/**
 * 
 * @author Jamie Long
 *
 * This program will ask and take the input of two numbers and an operator then calculate the sum
 * of those two based off of the operator they inputed.
 *
 */
public class Asg2 {
	
	public static void main(String[] args) {
		
		// Variables for inputs
		int 
		num1,
		num2,
		sum;
		String operator;
		
		// Initializing scanner
		Scanner input = new Scanner(System.in);
		
		// Asking users for 3 different inputs. 2 numbers separated by a space and an operator
		System.out.print("You will need to enter two numbers separated by a single space (between 200 and 1000): ");
        num1 = input.nextInt();
        num2 = input.nextInt();
        
		System.out.print("Enter an operator (+, -, *, /): ");
		operator =  input.next();
		
		// Switch statement to calculate inputs based off of the operator that the user specified.
		switch(operator) {
		
		default: 
			System.out.println("Invalid operator");
			break;
			
		case "/":
			System.out.println("The value of " + num1 + " " + operator + " " + num2 + " equals: " + (double)num1 / num2);
			break;
			
		case "+":
			sum = num1 + num2;
			System.out.println("The value of " + num1 + " " + operator + " " + num2 + " equals: " + sum);
			break;
			
		case "*":
			sum = num1 * num2;
			System.out.println("The value of " + num1 + " " + operator + " " + num2 + " equals: " + sum);
			break;
			
		case "-":
			sum = num1 - num2;
			System.out.println("The value of " + num1 + " " + operator + " " + num2 + " equals: " + sum);
			break;
		}
		
		// Closing scanner
		input.close();

		
	}
	

}
