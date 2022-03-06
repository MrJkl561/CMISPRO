import java.util.*;

public class Asg6 {

	public static void main(String[] args) {
		/*Creating variables*/
		String teamNames[];
		int teamScores[];
		int numOfTeams;
		int maxScore;
		int minScore;
		
		/* Using 2 different scanners because of double output problem.*/
		Scanner input = new Scanner(System.in);
		Scanner input2 = new Scanner(System.in);

		/*Asking user how many teams he would like then assigning them to the size of teamScore, and teamNames array*/
		System.out.print("How many teams would you like? ");
		numOfTeams = input2.nextInt();

		teamNames = new String[numOfTeams];
		teamScores = new int[numOfTeams];

		/*Asking user to put the team names and scores*/
		for (int i = 1; i <= numOfTeams; i++) {
			System.out.println("Team: "+ i);

			System.out.print("\tEnter name: ");
			teamNames[i - 1] = input.nextLine();

			System.out.print("\tEnter score(from 400 - 1000): ");
			teamScores[i - 1] = input2.nextInt();

			if (teamScores[i - 1] < 400 || teamScores[i - 1] > 1000) { // Making sure the user inputs an integer from 400 - 1000
				System.out.print("Invalid input. Score must be from 400 - 1000.");
				input.close();
				input2.close();
				System.exit(0);
			}
		}
		
		printTeamNamesAndScores(teamNames, teamScores);
		
		/*Assigning max and min scores then printing them out in a for loop.*/
		maxScore = calcTeamScoreMax(teamScores);
		minScore = calcTeamScoreMin(teamScores);
		for(int i = 0; i<teamScores.length; i++ ) {
			if(maxScore == teamScores[i]) {
				System.out.printf("\nTeam with max score: %s %d\n",  teamNames[i],maxScore);
				
			}
			if(minScore == teamScores[i]) {
				System.out.printf("Team with min score: %s %d\n", teamNames[i], minScore);
				
			}
		}
		input.close();
		input2.close();

	}

	/*Prints out the team names and scores from the array in a neat manner*/
	private static void printTeamNamesAndScores(String[] teamNames, int[] teamScores) {
		for(int i = 0; i < teamNames.length; i ++) {
			System.out.printf("%s: \t%d \n", teamNames[i], teamScores[i]);
		}
		
	}

	/*Calculates maximum score for team scores*/
	public static int calcTeamScoreMax(int[] scores) {
		int max = scores[0];

		for (int i = 0; i < scores.length; i++) {
			if (scores[i] > max) {
				max = scores[i];
			}

		}
		return max;
	}
	
	/*Calculates minimum score for team scores*/
	public static int calcTeamScoreMin(int[] scores) {
		int min = scores[0];

		for (int i = 0; i < scores.length; i++) {
			if (scores[i] < min) {
				min = scores[i];
			}
		}
		return min;
	}

}
