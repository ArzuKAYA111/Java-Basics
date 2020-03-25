package com.syntax.class05;

public class LocicalAnd {

	public static void main(String[] args) {
		/* declared number is between 
		 * if 1-10 --> this number is small
		 * if between11-100---->this number is big
		 * if between101-1000--->number is super
		 */
		int num = 5000;

		if (num >= 1 && num <= 10) {

			System.out.println("this number is small");
		} else if (num > 10 && num <= 100) {

			System.out.println("this  is a big number");
		} else if (num > 100 && num <= 1000) {
			System.out.println("this  is a large number");

		} else {
			System.out.println("number is super large ");
		}
	}

}
