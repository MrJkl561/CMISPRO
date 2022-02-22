import java.util.Scanner;

/**
 * 
 * @author Jamie Long
 *
 * This program will ask the user from a set of options from a menu to:
 * 1 Convert cubic ft to U.S bushels 
 * 2 Convert miles to kilometers
 * 3 Determine graduation title 
 * 4 Give user option to exit menu
 *
 *
 */

public class Asg5 {

	public static void main(String[] args) {
		
		
		int menuChoice = 0; // Variable for menu choice

		
		Scanner input = new Scanner(System.in); // Making scanner

		do {

			/*Displaying menu*/
			System.out.println(
			"     Menu" + "\n" + 
			"1: Convert cublic feet to U.S bushels" + "\n" + 
			"2: Convert miles to kilometers" + "\n" + 
			"3: Determine gratuation title with honors" + "\n" + 
			"9: Exit menu");

			menuChoice = input.nextInt(); // Assigning menuChoice for switch statement
			

			/*
			 * Depending what the user chooses in the menu they will be taken to the correct
			 * option to make the calculations
			 */
			switch (menuChoice) {
			default:
				System.out.println("Invalid menu choice!");
				break;
			case 1:
				System.out.println("cubic ft. = "+cubicToBushels(input) + " U.S bushels");
				System.out.println();
				break;
			case 2:
				System.out.println("miles = " + milesToKiloMeters(input) + " km");
				System.out.println();
				break;
			case 3:
				graduationTitle(input);
				break;
			case 9:
				System.out.println("Exiting menu...");
				break;

			}
		} while (menuChoice != 9);
		input.close();
	}

	/* 1. Convert Cubic feet to U.S bushels */
	public static double cubicToBushels(Scanner input) {
		
		int cubicInput;
		double bushels = 0.803564;
		double convert;
		System.out.println();
		System.out.print("Enter cubic feet: ");
		cubicInput = input.nextInt(); // Grabbing user input
		
		convert = cubicInput * bushels; // Converting cubic feet to bushels
		
		System.out.print(cubicInput+ " ");
		
		
		return convert;
		

	}

	/* 2. Convert Miles to Kilometers */
	public static double milesToKiloMeters(Scanner input) {
		
		int milesInput;
		double kiloMeters = 1.60934;
		double convert;
		
		System.out.println();
		System.out.print("Enter miles: ");
		milesInput = input.nextInt(); // Grabbing user input
		
		convert = milesInput * kiloMeters; // Converting miles to km
		
		System.out.print(milesInput + " "); 
		
		return convert;

	}

	/* 3. Graduation with honors title */
	public static void graduationTitle(Scanner input) {
		
		double gpa;
		System.out.println();
		
		System.out.print("Enter GPA: ");
		gpa = input.nextDouble();
		
		System.out.println();
		
	if(gpa >= 3.5 && gpa <=3.7) {
		System.out.println("You graduated Cum Laude! ");
		System.out.println();
		
	}else if(gpa >= 3.8 && gpa <=3.9) {
		System.out.println("You graduated Magna Cum Laude! ");
		System.out.println();
		
	}else if(gpa >= 4.0) {
		System.out.println("You graduated Summa Cum Laude! ");
		System.out.println();
		
		}else {
		System.out.println("GPA must be 3.5 or higher.");
		System.out.println();
		
		}
	
	}

}
