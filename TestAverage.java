//Filename: TestAverage.java
//Written by: Teresa Whitmore
//Written on: 01/28/2019

import java.util.Scanner;

public class TestAverage
{

	public static void main(String[] args)
	{
		int score1;
		int score2;
		int score3;
		double total, average;
		
		Scanner input = new Scanner(System.in);
		
		System.out.print("Enter first test score>> ");		
		score1 = input.nextInt();
		
		System.out.print("Enter second test score>> ");		
		score2 = input.nextInt();
		
		System.out.print("Enter third test score>> ");		
		score3 = input.nextInt();
		
		total = score1 + score2 + score3;
		
		average = total / 3;
		
		System.out.println("Scores entered were: " + score1 + ", " + score2 + ", " + score3 + ".");
		System.out.println("Average score is: " + average + ".");		
		
		input.close();

	}

}
