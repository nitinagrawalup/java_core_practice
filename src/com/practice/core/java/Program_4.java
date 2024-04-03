package com.practice.core.java;

import java.util.Scanner;

/*
 * WAP to calculate the percentage of a student in CBSE Board exam. His marks of 5 subject 
 * are taken as input from the keyboard. (Marks are out of 100)
 */
public class Program_4 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		System.out.println("Each exam is of how much mark ?");
		int num = sc.nextInt();

		System.out.println("Enter the marks of first subject");
		float num1 = sc.nextFloat();
		System.out.println("Enter the marks of second subject");
		float num2 = sc.nextFloat();
		System.out.println("Enter the marks of third subject");
		float num3 = sc.nextFloat();
		System.out.println("Enter the marks of fourth subject");
		float num4 = sc.nextFloat();
		System.out.println("Enter the marks of fifth subject");
		float num5 = sc.nextFloat();

		float examIsOutOf = (float) (num * 5);
		float totalMarksScored = num1 + num2 + num3 + num4 + num5;
		float percentageObtained = (totalMarksScored / examIsOutOf) * 100.0f;

		System.out.println("Percentage scored by the student in CBSE Board = " + percentageObtained);
		sc.close();
	}

}
