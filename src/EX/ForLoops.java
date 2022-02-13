package EX;
/**
 * This program makes a multiplication table
 * 
 * */
public class ForLoops {
	
	public static void main(String[] args) {
		int rowNumber = 0, N = 0;
		
		
		for (rowNumber = 1; rowNumber <= 20; rowNumber++) {
			
			for(N = 1; N <=15; N++) {
				
				System.out.printf( "%10d", N * rowNumber);
			}
			System.out.println();
		}
		
	}

}
