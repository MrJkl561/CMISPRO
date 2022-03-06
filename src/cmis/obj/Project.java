package cmis.obj;

import java.util.*;

public class Project {

	public static void main(String[] args) {
		Customer myCus = new Customer();
		Scanner input = new Scanner(System.in);

		menu(input, myCus);

	}

	public static void menu(Scanner input, Customer myCus) {
		System.out.println(
				"Menu: \n" + "1: Load Customer Data \n" + "2: Add New Customer \n" + "3: Display All Customers \n");

		switch (input.nextInt()) {
		case 1:

			break;

		case 2:
			addCustomer(input, myCus);
			break;
		case 3:

			break;
		default:
			break;
		}
	}

	public static void addCustomer(Scanner input, Customer myCus) {
		int numOfCus = 0;
		int arrySize = 0;
		int[] arryCus ;
		int[] numOfSales;
		String[] customerName;
		
		System.out.print("How many customers would you like to add? ");
		numOfCus = input.nextInt();
		arryCus = new int[numOfCus];
		numOfSales = new int[numOfCus];
		customerName = new String[numOfCus];
		do {
			
			System.out.print("Enter customer id (EX: 12345):");
			arryCus[arrySize] = input.nextInt();
			myCus.setCustomerId(arryCus);

			System.out.print("Enter Customer name");
			customerName[arrySize] = input.nextLine();  
			
			
			// add at end of the loop
			if(arrySize < numOfCus) {
				arrySize++;
			}
			numOfCus--;

		} while (numOfCus != 0);
		System.out.println(myCus.toString());
	}

}
