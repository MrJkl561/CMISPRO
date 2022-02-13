import java.util.Scanner;

/**
 * 
 * @author Jamie Long
 *
 *         This program will ask the user for a gamer's name, XP (levels 1-3),
 *         and engagement score (ES) and will calculate with XP bonuses for each
 *         level. End result will output said information with gamer's name.
 * 
 *
 */
public class Asg3 {
	
	public static void main(String[] args) {

		/* Initializing variables */
		String gamerName = "", enterData = "yes";
		int lvl1, lvl2, lvl3, ES;
		double total;
		boolean enteredData = false;

		Scanner input = new Scanner(System.in); // Setting up scanner for user input

		/* Grabbing user input and storing in variables then calculating. Using loop */

		while (enterData.equalsIgnoreCase("yes")) {
			/*
			 * Checking if user has already entered data. If not will display the welcome
			 * message
			 */
			if (!enteredData) {
				System.out.println("Welcome user! Please enter the gamer data asked below.");
				enteredData = true;
			}
			/* Checking if user would like to input gamer's data */
			System.out.print("Do you want to enter a gamer's data? Yes/No: ");
			enterData = input.next();

			if (!enterData.equalsIgnoreCase("yes")) {
				input.close();
				return;
			}

			/* Asking user for gamer's data */

			System.out.print("Enter gamer's name: ");
			gamerName = input.next(); // Storing the gamer's name

			System.out
					.print("Enter " + gamerName + " XP (10 - 100) at each level (L1 L2 L3 ES) sperated by a space: ");
			/* Storing the gamer's XP at each level */

			lvl1 = input.nextInt();
			lvl2 = input.nextInt();
			lvl3 = input.nextInt();
			ES = input.nextInt();
			/* Checking if any of the values are less than 10 or greater than 100 */
			if (lvl1 < 10 || lvl2 < 10 || lvl3 < 10 || ES < 10 || lvl1 > 100 || lvl2 > 100 || lvl3 > 100 || ES > 100) {
				System.out.println("One of your XP levels was less than 10 or greater than 100!");
				input.close();
				return;
			}

			System.out.println();

			total = lvl1 + (lvl1 * .20) + lvl2 + (lvl2 * .30) + lvl3 + (lvl3 * .50) + ES + (ES * .60); // Calculating XP
																										// with bonuses

			System.out.println(
					"Gamer's name " + gamerName + " L1: " + lvl1 + " L2: " + lvl2 + " L3: " + lvl3 + " ES: " + ES);
			System.out.println("Total XP with bonuses: " + (int) total);

			System.out.println();
		}

		input.close(); // Closing scanner

	}

}
