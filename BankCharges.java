//Filename: BankCharges.java
//Written by: Teresa Whitmore
//Written on: 01/28/2019

import java.util.Scanner;
import java.text.NumberFormat;

public class BankCharges
{

	public static void main(String[] args)
	{
		int num;
		double flatFee = 10;
		double fee;
		double total;
		
		NumberFormat fmt = NumberFormat.getCurrencyInstance();
		
		Scanner input = new Scanner(System.in);
		
		System.out.print("How many checks were written? ");		
		num = input.nextInt();
		
		if (num < 20)
			fee = .10;
		else if (num >= 20 && num <= 39)
			fee = .08;
		else if (num >= 40 && num <= 59)
			fee = .06;
		else 
			fee = .04;
		
		total = num * fee + flatFee;
		
		System.out.println("Bank fees: " + fmt.format(total));
		
		input.close();		

	}

}
