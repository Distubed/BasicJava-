package com.bridgelabz.conditionalLoops;

import java.util.Scanner;

import com.bridgelabz.Utility.Utility;

public class Sqrt {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		

		Utility utility = new Utility();
		Scanner scanner = new Scanner(System.in);
		int c;
		double result;
		System.out.println("Enter Nonnegative value");
		c = scanner.nextInt();
		if (c > 0) {
		//	result = utility.findSquareRootUsingNewtonsMethod(c);
			System.out.println("Square Root of " + c + " using Newtons Law is " );
		} else {
			System.out.println("Please enter positive value..");
		}
		
		scanner.close();
	}

}
