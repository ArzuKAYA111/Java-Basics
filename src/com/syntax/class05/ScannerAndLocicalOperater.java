package com.syntax.class05;

import java.util.Scanner;

public class ScannerAndLocicalOperater {

	public static void main(String[] args) {
		/*
		 * Take age input from a user and then based on the age print output if age from
		 * 0-3....>you are a baby if age from 4-5....>you are a kid if age from
		 * 6-12....>you are a child if age from 13-19....>you are teenager if age from
		 * 20-64....>you are an adult if age is more then 65....>you are a senior
		 */

		// 1- Let's declare all variables
		int age;
		Scanner scan; // to inport we use crtl+ shift + o (yada cikan ilk line a cift tikla)

		// 2- capture values

		scan = new Scanner(System.in);// yukarida Scanner i declare yaptigi icin burada en basa tekrar yazmadi

		System.out.println("Pleas enter your age");
		age = scan.nextInt();// yukarida int i declare yaptigi icin burada en basa tekrar yazmadi

		// 3- perform verification
		                             //(if   else if ile yazilim)
		if (age >= 0 && age <= 3) {
			System.out.println("You are a baby");
		} else if (age >= 4 && age <= 5) {
			System.out.println("You are a kid");
		} else if (age >= 6 && age <= 12) {
			System.out.println(" You are a child");
		} else if (age >= 13 && age <= 19) {
			System.out.println("You are teenager");
		} else if (age >= 20 && age <= 65) {
			System.out.println("You are an adult");
		} else if (age > 65) {
			System.out.println("you are a senior");
		} else {
			System.out.println("You are enjoying your life");
		}

		System.out.println(".........");

		                               // biraz farkli yazilim(Nested if ile yazilim)
		if (age >= 0) {
			if (age <= 3) {
				System.out.println("You are a baby");
			} else if (age >= 4 && age <= 5) {
				System.out.println("You are a kid");
			} else if (age >= 6 && age <= 12) {
				System.out.println(" You are a child");
			} else if (age >= 13 && age <= 19) {
				System.out.println("You are teenager");
			} else if (age >= 20 && age <= 65) {
				System.out.println("You are an adult");
			} else if (age > 65) {
				System.out.println("you are a senior");
			} else {
				System.out.println("You are enjoying your life");
			}
		} else {
			System.out.println("Please enter a valid age");
		}

	}
}
