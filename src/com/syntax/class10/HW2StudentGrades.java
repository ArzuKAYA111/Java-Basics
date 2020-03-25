package com.syntax.class10;

public class HW2StudentGrades {

	public static void main(String[] args) {
		/*Create a 2D array that first row will contain 4 names and second row will contain grades. 
		 * Then you program should print name of the students that has A and B grade
		 */

System.out.println("...........SHORT WAY.......................");
		
    String[] [] StGrade= {
		                      { "Jose", "Andrea","Eden","Jorge"},

                                      { "A", "B"},  };
		
		System.out.println("Grade of " + StGrade[0][0] + " is : "+ StGrade[1][0] );
		System.out.println("Grade of " + StGrade[0][2] + " is : "+ StGrade[1][1] );
		System.out.println("Grade of " + StGrade[0][1] + " is : "+ StGrade[1][0] );
		System.out.println("Grade of " + StGrade[0][1] + " is : "+ StGrade[1][1] );



System.out.println("...........LONG WAY.......................");		
		
		String[][] StGrade1= new String[2][4];
		
// 1 ROW
		StGrade1[0][0]="Jose";
		StGrade1[0][1]="Andrea";
		StGrade1[0][2]="Eden";
		StGrade1[0][2]="Jorge";
		
// 2 ROW
		StGrade1[1][0]="A";
		StGrade1[1][1]="B";
		
		System.out.println("Grade of " + StGrade1[0][0] + " is : "+ StGrade1[1][0] );
		System.out.println("Grade of " + StGrade1[0][2] + " is : "+ StGrade1[1][1] );
		System.out.println("Grade of " + StGrade1[0][1] + " is : "+ StGrade1[1][0] );
		System.out.println("Grade of " + StGrade1[0][1] + " is : "+ StGrade1[1][1] );
		
		
		
		
		
		
		
		
		
	}

}
