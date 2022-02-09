import java.util.Scanner;

/**
 * 
 * @author Jamie Long
 *
 * This program will receive multiple inputs from the user to calculate the total before
 * and after the discount of the customers total items they want to buy.
 * 
 */


public class Asg1 {

	
	public static void main(String[] args) {
		int 
		  id // Customer id 
		 ,qu; // Quantity of item
		String desc; // Product description
		double 
		  price // Price of item
		 ,discount // Discount received
		 ,bdis // Total before discount
		 ,adis; // Total after discount
		
		Scanner input = new Scanner(System.in); // Initialize new scanner
		
		// User enters data specified
		System.out.print("Please enter customer ID: ");
		id = input.nextInt();
		
		System.out.print("Enter item description: ");
		desc = input.next();
		
		System.out.print("Enter price of item with decimals (e.g. 2.7): ");
		price = input.nextDouble();
		
		System.out.print("Enter quantity of item: ");
		qu = input.nextInt();
		
		System.out.print("Enter discount with decimals (e.g. .60): ");
		discount = input.nextDouble();
		System.out.println("");
		
		// Calculations before and after discount is received
		bdis = qu*price;
		adis = bdis-(bdis*discount);
		
		// Print out of information given
		System.out.print("ORDER DATA: \n"
				+ "Customer id: " + id + "\n"
				+ "Item description: " + desc +"\n"
				+ "Price of item: $" + price + "\n"
				+ "Quantity of item: " + qu + "\n"
				+ "Discount: " + discount + "\n \n" 
				+ "Total price before discount: $"+ bdis + "\n"
				+ "Total price after discount: $" + adis);
		
		// Close scanner
		input.close();		
		
		
		
	}
}
