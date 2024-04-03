package com.practice.core.java;

import java.util.Scanner;

/*
 * WAP which ask the user to enter his/her name and greets them with 
 * "Hello <name>, have a good day" text
 */
public class Program_5 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter your name");
		String str = sc.nextLine();
		System.out.println("Hello " + str + ", have a good day.");
		sc.close();
	}

}
