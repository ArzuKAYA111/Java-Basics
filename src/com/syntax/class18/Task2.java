package com.syntax.class18;

public class Task2 {
/* 
Write a java program of Class Students that takes students name and 3 subject grades.
Inside your class also have a method to Calculate Average Grade. 
Test Student class for 5 different students with different marks.
 Your program should print an average mark of each students name.
 
NOTE: please use different names for instance and local variables.*/
	String name;	
	 int grade1, grade2,grade3;

	Task2 (String StudentName, int StudentGrade1, int StudentGrade2, int StudentGrade3){
		 name=StudentName;
		grade1=StudentGrade1;         // constructor   
		 grade2= StudentGrade2;
		 grade3=StudentGrade3;
	}
	
public	int average ( ) {
	int average=( grade1+grade2+grade3)/3;
		return average;
		
	}
	
public static void main(String[] args) {
	Task2 obj1 = new Task2("Ali", 80, 88, 90);
	System.out.println("Student " + obj1.name + " avarage grade is " + obj1.average());
	
	Task2 obj2 = new Task2("Ahmet", 85, 78, 90);
	System.out.println("Student " + obj2.name + " avarage grade is " + obj2.average());
	
	Task2 obj3 = new Task2("Abdullah", 90, 82, 95);
	System.out.println("Student " + obj3.name + " avarage grade is " + obj3.average());
}

	
}
