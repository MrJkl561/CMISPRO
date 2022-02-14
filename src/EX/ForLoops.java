package EX;

import java.util.Scanner;

/**
 * This program makes a multiplication table
 * 
 * */
public class ForLoops {
	
	public static void main(String[] args) {
//		int rowNumber = 0, N = 0;
//		
//		
//		for (rowNumber = 1; rowNumber <= 20; rowNumber++) {
//			
//			for(N = 1; N <=15; N++) {
//				
//				System.out.printf( "%10d", N * rowNumber);
//			}
//			System.out.println();
//		}
		
		
		Scanner input = new Scanner(System.in);
		int recNum;
		
		System.out.println("Enter");
		recNum = input.nextInt();
		
//		for(int i = 1; i <= recNum*2-1; i++) {
//			
//			for(int j = 1; j<= recNum*2-1; j++) {
//				if(j == 2 && i==2) {
//					System.out.print(recNum - 1);
//				}
//				System.out.print(recNum);
//			}
//			System.out.println();
//		}
//		
//		for (int i = 1; i <= recNum*2-1; i++)
//        {
//            for (int j = 1; j<= recNum*2-1; j++)
//            {
//                        
//                    System.out.print(recNum);           
//                          
//            }
//            System.out.println();
//        }
		
		
		
		
		for (int row = 1; row < recNum*2-1; row++) {
			
			for(int n = 1; n < recNum*2-1; n++) {
				if((row <= recNum && n == recNum-row+1 || n == recNum+row-1)|| (row >= recNum && n == row-recNum-1 || n == 2*recNum-(row-recNum+1)))
				System.out.print(recNum+ " ");
				else {
					System.out.print(" ");
				}
				
				
				
			}
			
			System.out.println( );
		}
		
		
		
		
		
		
		
//		for (int row = 1; row <= recNum*2-1; row++) {
//			
//			for(int n = 1; n <= recNum*2-1; n++) {
//				if(row <= recNum )
//					
//				System.out.print(recNum+ " " );
//				
//				else {
//					System.out.print(recNum-1);
//				}
//				
//				
//				
//			}
//			
//			System.out.println( );
//		}
		
		
		
		
		
		
		
		
		
		
		
		
//		
//		System.out.println("Enter the number of rows: ");
//
//		int rows = input.nextInt();
//		for (int i = rows; i >= 1; i--) {
//			for (int j = rows; j >= i; j--) {
//				if (i == 1 || j == 1)
//					System.out.print(rows);
//				else {
//				System.out.print(j + " ");
//				}
//				
//			}
//
//			System.out.println();
//		}
		input.close();
		
		
	}

}
