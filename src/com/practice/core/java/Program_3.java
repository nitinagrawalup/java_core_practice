package com.practice.core.java;

import java.util.Scanner;

/*
 * WAP to take input from user using scanner object
 */
public class Program_3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		/*
		 * System.out.println("Enter the first int number"); int num1 = sc.nextInt();
		 * 
		 * System.out.println("Enter the second int number"); int num2 = sc.nextInt();
		 * 
		 * int sum = num1 + num2; System.out.println("Sum of " + num1 + " and " + num2 +
		 * " = " + sum);
		 */

		/*
		 * System.out.println("Enter the first float number :"); float num1 =
		 * sc.nextFloat();
		 * 
		 * System.out.println("Enter the second float number :"); float num2 =
		 * sc.nextFloat();
		 * 
		 * float sum = num1 + num2; System.out.println("Sum of " + num1 + " and " + num2
		 * + " = " + sum);
		 */

		System.out.println("Enter the first double number");
		double num1 = sc.nextDouble();
		System.out.println("Enter the second double number");
		double num2 = sc.nextDouble();
		double sum = num1 + num2;
		System.out.println("Sum of " + num1 + " and " + num2 + " = " + sum);
		sc.close();
	}

}
