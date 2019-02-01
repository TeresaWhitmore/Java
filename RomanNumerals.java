//Written by: Teresa Whitmore
//Written on: 01/31/2019

import java.util.Scanner;

public class RomanNumerals
{

	public static void main(String[] args)
	{
		Scanner input = new Scanner(System.in);
		
		int num;
		String output;
		
		System.out.println("Enter a number between 1 and 10 to display the Roman Numeral equivalent >> ");		
		num = input.nextInt();
		
		if (num == 1)
			output = "I";
		else if (num == 2)
			output = "II";
		else if (num == 3)
			output = "III";
		else if (num == 4)
			output = "IV";
		else if (num == 5)
			output = "V";
		else if (num == 6)
			output = "VI";
		else if (num == 7)
			output = "VII";
		else if (num == 8)
			output = "VIII";
		else if (num == 9)
			output = "IX";
		else if (num == 10)
			output = "X";
		else 
			output = "Invalid Input.";
		
		System.out.println(output);
		
		input.close();

	}

}
