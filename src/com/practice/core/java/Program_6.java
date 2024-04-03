package com.practice.core.java;

import java.util.Scanner;

/*
 * WAP to convert the kilometer to miles
 * 1km =0.621371 mile
 */
public class Program_6 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter number of Kilometer ");
		int numberOfKilometer = sc.nextInt();
		float numberOfMile = (float) (numberOfKilometer * 0.621371);
		System.out.println(numberOfKilometer + " km = " + numberOfMile + " mile");
		sc.close();
	}
}
