package com.syntax.class09;

public class NestedLoopTask1 {

	public static void main(String[] args) {
		/*
		 * Print the following pattern: 55555 4444 333 22 1
		 */
		for (int a = 5; a >= 0; a--) {
			for (int b = 1; b <= a; b++) {
				System.out.print(a);
			}
			System.out.println();
		}

		System.out.println("                ");
		/*
		 * 1 22 333 4444 55555 666666 7777777 88888888 999999999
		 */
		for (int a = 1; a <= 9; a++) {
			for (int b = 1; b <= a; b++) {
				System.out.print(a);
			}
			System.out.println();
		}

		System.out.println("                ");
		/*
		 * Print the following pattern: 1 12 123 223 1
		 */

		for (int a = 1; a <= 5; a++) {
			for (int b = 1; b <= a; b++) {
				System.out.print(b);
			}
			System.out.println();
		}

	}
}
