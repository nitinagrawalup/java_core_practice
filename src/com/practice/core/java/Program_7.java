package com.practice.core.java;

import java.util.Scanner;

/*
 * WAP to detect whether a number entered by the user is integer or not
 */
public class Program_7 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the number to check whether it is interger or not");
		boolean numberIsInteger = sc.hasNextInt();
		if (numberIsInteger) {
			System.out.println("Yes number is integer");
		} else {
			System.out.println("No number is not integer");
		}
		sc.close();
	}

}
