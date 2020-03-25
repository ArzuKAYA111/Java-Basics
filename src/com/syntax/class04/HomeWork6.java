package com.syntax.class04;

public class HomeWork6 {

	public static void main(String[] args) {
		/*
		 * 1. Declare variable and increase by 100 using shorthand operator 
		 * 2. Declare variable and decrease by 67 using shorthand operator 
		 * 3. Declare variable cakePiece=11 and divide cakePiece between 
		 * 4 people using shorthand operator each person should get an equal piece of cake 
		 * 4. Declare variable cakePiece=25 and divide cakePiece between 7 people . Using 
		 * shorthand operator found out how many pieces of cake left after it was distributed 
		 * equally among 7 people    */

	// 1
		int a = 0;
		a += 100;

		System.out.println(a);
		a += 100;
		System.out.println(a);
		a += 100;
		System.out.println(a);
		a += 100;
		System.out.println(a);
		a += 100;
		System.out.println(a);

		System.out.println("--------------------------");

 // 2
		int num = 500;
		num -= 67;
		System.out.println(num);
		num -= 67;
		System.out.println(num);
		num -= 67;
		System.out.println(num);
		num -= 67;
		System.out.println(num);

		System.out.println("--------------------------");
 //3
		double cake = 11;
		cake /= 4;
		System.out.println(" Each person gets " + cake + "  pieces of cake");

		System.out.println("--------------------------");
 //4    
		int cakePiece = 25;
		cakePiece %= 7;
		System.out.println(cakePiece + "  pieces of cake left after distributed ");
	}

}
