package com.syntax.class06;

import java.util.Scanner;

public class Task2 {

	public static void main(String[] args) {
		/* Allow user to enter grade and then provide
explanation: A-Excellent, B-Good, C-Average,
D-Bad, any other grade --> Not Acceptable. At the
end your program should print which grade was
entered by a user with explanation. */

		Scanner scan;
		char grade;
		String Explanation;
		scan=new Scanner(System.in);
		System.out.println("Please enter your grade by using Uppercase ");
		grade=scan.next().charAt(0);
		
		 switch(grade) {
		 case 'A':
			 Explanation="Excellent";
			 break;
		 case'B':
			 Explanation="Good";
			 break;
		 case'C':
			 Explanation="Average";
			 break;
		 case 'D':
			 Explanation="Bad";
			 break;
			 default:
				 Explanation="Not Acceptable";
		 
		 }
		
		System.out.println("Your grade "+ grade +" is " + Explanation);
	}
}
