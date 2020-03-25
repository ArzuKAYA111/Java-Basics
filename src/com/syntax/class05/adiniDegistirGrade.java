package com.syntax.class05;

import java.util.Scanner;

public class adiniDegistirGrade {

	public static void main(String[] args) {
		/*1. Write a program that will read three inputs of scores (quiz, mid term, and final scores) and
determine the grade based on the following rules:
â—? if the average score >=90 â†’ grade=A
â—? if the average score >= 70 and <90 â†’ grade=B
â—? if the average score>=50 and <70 â†’ grade=C
â—? if the average score<50 â†’ grade=F */

		Scanner scan=new Scanner(System.in);
		System.out.println("Please enter quiz score");
		
	int quiz=scan.nextInt();
	System.out.println("Please enter midTerm score");
			
	int midTerm=scan.nextInt();	
	System.out.println("Please enter fnl score");
	int fnl=scan.nextInt();

	float avrage=((quiz)+(midTerm)+(fnl))/3;
	System.out.println("Your avrage is " +avrage);
	if (avrage>=90)
	System.out.println("Your Grade is A");
	else if(avrage>=70 && avrage<90)
	System.out.println("Your Grade is B ");
	
	else if(avrage>=50 && avrage<70)
	System.out.println("Your Grade is C ");
	
	else if(avrage<50 )
	System.out.println("Your Grade is F ");
	
	}

}
