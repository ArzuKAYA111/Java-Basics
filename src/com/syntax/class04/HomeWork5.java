package com.syntax.class04;

import java.util.Scanner;

public class HomeWork5 {

	public static void main(String[] args) {
		/*
		 * Write a program to ask user to enter numbers of worked years and annual
		 * salary. If user worked for more or equals to 5 years than user is eligible
		 * for the bonus, otherwise he is not. Once user is eligible and salary is
		 * larger than 50000 than bonus = 5000, otherwise bonus=3000.
		 */
		Scanner inf = new Scanner(System.in);

		System.out.println("How many years, have you been working ");

		int year = inf.nextInt();

		if (year >= 5) {
			System.out.println("You are eligible for the bonus");
			System.out.println("Please enter your anual salary");

			int salary = inf.nextInt();
			if (salary >= 50000) {

				System.out.println("You earn $5000 bonus");
			} else if (salary < 50000) {
				System.out.println("You earn $3000 bonus ");
			}

		} else {
			System.out.println("You are not eligible for the bonus");
		}

	}

}
