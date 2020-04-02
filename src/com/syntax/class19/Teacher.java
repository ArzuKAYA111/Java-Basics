package com.syntax.class19;
/*Write a Java program called Teacher.  
 * Identify features and behavior of that Class. 
 * Create 3 subclasses MathTeacher, ChemistryTeacher
 *  and PianoTeacher that would have it their own features
 *  and behavior. Test all 4 classes */
public class Teacher {

	
	String branch;
	String money;
	int age;
	
	public void love() {
System.out.println("Teachers love succesful students.");
	}
	public void teaches() {
System.out.println("There are diffrent branch teachers at school");
		
	}
	public void money() {
		
		System.out.println("Teachers earn "+ money + " money");
System.out.println("Teachers do not make more money ");
		
	}
}
