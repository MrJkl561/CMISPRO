package cmis.obj;
/**
 * @author Jamie Long
 * 
 * This program will ask the user from a choice of a menu to:
 * 1 Get Id of a customer
 * 2 Add (a) customer(s)
 * 3 List all customers
 * 4 Exit program
 * 
 */
import java.util.Scanner;

public class Project {
	
	static Customer[] myCus = new Customer[100]; // Creating 100 instances of Customer object
	static int cusCounter = 0; // Using a global counter to store how many customers have been made

	public static void main(String[] args) {
		menu(); // Calling menu method

	}

	/* Main menu for calling methods */
	public static void menu() {

		Scanner input = new Scanner(System.in);
		int menuNum;
		do {
			System.out.print("Menu: \n"
					+ "1: Load Customer Data \n2: Add New Customer \n3: Display All Customers \n4: Exit Menu \nEnter menu choice: "); // Asking user to pick a menu option
			menuNum = input.nextInt();

			/* Switching to the menu option */
			switch (menuNum) {
			default:
				System.out.println("Invalid Menu Choice");
				break;
			case 1:
				if (myCus[0] == null) { // Checking whether the first instance of the Customer object is null
					System.out.println(
							"There are no customers in database. Please add customers before using this section.");
					break;
				}
				getID(); // Calling getID method
				break;

			case 2:

				addCustomer(); // Calling addCustomer method
				break;

			case 3:
				if (myCus[0] == null) {
					System.out.println(
							"There are no customers in database. Please add customers before using this section.");
					break;
				}
				printAllCus(); // Calling printAllCus method
				break;
			case 4:
				System.exit(0); // Terminating program
				break;

			}
		} while (menuNum != 4);
	}

	/* addCustomer method to add an customer using a for loop */
	public static void addCustomer() {
		/* Initializing variables */
		Scanner inputNum = new Scanner(System.in);
		Scanner inputText = new Scanner(System.in);
		int numOfCus;
		int cusId = 0;
		int numOfSales;
		String customerName;

		System.out.print("How many customers would you like to add? "); // Asking user how many customers they would
																		// like to add
		numOfCus = inputNum.nextInt();

		int i;
		for (i = cusCounter; i < numOfCus + cusCounter; i++) { // For loop ensuring we add as many customers as
																// specified and also to not override current customers

			String cusIDStr = "";
			System.out.print("\nEnter customer id (EX: 12345): ");
			cusIDStr = inputText.nextLine();

			if (cusIDStr.length() == 5) { // Checking if the id is equal to 5 in length
				cusId = Integer.parseInt(cusIDStr); // If so assign it to cusId
			} else
				while (cusIDStr.length() != 5) { // If the length does not equal 5 use a while loop until the length
													// is equal to 5
					System.out.println("Customer ID must be 5 integers long");
					cusIDStr = inputText.nextLine();
					cusId = Integer.parseInt(cusIDStr);
				}

			System.out.print("\nEnter Customer name: ");
			customerName = inputText.nextLine(); // Asking for name of customer

			System.out.print("\nEnter Customer total sales: ");
			numOfSales = inputNum.nextInt(); // Asking for total sales of customer

			myCus[i] = new Customer(cusId, numOfSales, customerName); // Creating a new Customer in the array of
																		// Customers using the input the user provided
			System.out.println("Customer Added");
			System.out.println();
		}
		cusCounter = i; // Setting cusCounter to i

	}

	/* Getting customer id using a for loop */
	public static void getID() {
		int id;
		Scanner input = new Scanner(System.in);

		System.out.print("Enter Customer ID: ");
		id = input.nextInt(); // Asking user to enter a customer ID

		for (int i = 0; i < myCus.length; i++) {
			if (myCus[i].getCustomerId() == id) { // Looping thru all instances of myCus to find matching ID
				System.out.println(myCus[i].toString()); // Printing out customer info
				break;
			}
		}
		System.out.println();

	}

	/* Printing out all valid instances of Customers[] */
	public static void printAllCus() {

		for (int i = 0; i < cusCounter; i++) {

			System.out.println(myCus[i].toString());

		}
	}

}
