import java.util.*;

public class Asg6 {

	public static void main(String[] args) {
		String teamNames[];
		int teamScores[];
		int numOfTeams;
		int maxScore;
		int minScore;
		Scanner input = new Scanner(System.in);
		Scanner input2 = new Scanner(System.in);

		System.out.print("How many teams would you like? ");
		numOfTeams = input2.nextInt();

		teamNames = new String[numOfTeams];
		teamScores = new int[numOfTeams];

		for (int i = 1; i <= numOfTeams; i++) {
			System.out.println("Team: "+ i);

			System.out.print("\tEnter name: ");
			teamNames[i - 1] = input.nextLine();

			System.out.print("\tEnter score(from 400 - 1000): ");
			teamScores[i - 1] = input2.nextInt();

			if (teamScores[i - 1] < 400 || teamScores[i - 1] > 1000) {
				System.out.print("Invalid input. Score must be from 400 - 1000.");
				input.close();
				input2.close();
				System.exit(0);
			}
		}
		
		printTeamNamesAndScores(teamNames, teamScores);
		maxScore = calcTeamScoreMax(teamScores);
		minScore = calcTeamScoreMin(teamScores);
		for(int i = 0; i<teamScores.length; i++ ) {
			if(maxScore == teamScores[i]) {
				System.out.printf("\nTeam with max score: %s %d\n",  teamNames[i],maxScore);
				//System.out.println(teamNames[i]);
			}
			if(minScore == teamScores[i]) {
				System.out.printf("Team with min score: %s %d\n", teamNames[i], minScore);
				//System.out.println(teamNames[i]);
			}
		}
		input.close();
		input2.close();

		/* Testing output */
//		for (int i = 0; i < teamNames.length; i ++) {
//			System.out.println(teamNames[i]);
//		}

	}

	private static void printTeamNamesAndScores(String[] teamNames, int[] teamScores) {
		for(int i = 0; i < teamNames.length; i ++) {
			System.out.printf("%s: \t%d \n", teamNames[i], teamScores[i]);
		}
		
	}

	public static int calcTeamScoreMax(int[] scores) {
		int max = scores[0];

		for (int i = 0; i < scores.length; i++) {
			if (scores[i] > max) {
				max = scores[i];
			}

		}
		return max;
	}

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
