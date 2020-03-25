package com.syntax.class06;

import java.util.Scanner;

public class Task1 {

	public static void main(String[] args) {
		/*
		 * Ask user to enter their country and capture it. Once values are captured
		 * print which language user speaks.*/
		
		String Country;
		String language;
		Scanner scan;
		scan = new Scanner(System.in);
		System.out.println(" Where are you from? Please enter your Country's name");

		Country = scan.nextLine();

		switch (Country) {
		case "Turkey":
			language = "Turkish";
			break;
		case "America":
			language = "English";
			break;
		case "Iraq":
			language = "Arabic & Kurdish ";
			break;
		case "France":
			language = "French";
			break;
		case "Argentina":
			language = "Spanish";
			break;

		default:
			language = "Unknown";

		}
		System.out.println("The language of your country is " + language);

	}

}
