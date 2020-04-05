package com.syntax.class22;
/*Create a Class Student that will have 3 subclasses as SyntaxStudent, CollegeStudent, SchoolStudent. 
Define common behavior within parent class and override some of the methods in child classes 
Define some methods specific to child classes
Write example of achieving run time polymorphism */
public class Student {

	
	void DoHomework() {
		
	System.out.println("All students need to study ");	
	}}
class SyntaxStudent extends Student{
	

         @Override                      //Run time Polymorphism through Method Overriding
void DoHomework() {

	System.out.println("Syntax students need to learn Java ");		
	}
	void own(int month) {
		
		System.out.println("Syntax students learn a lot in "+ month +" months");		
	}}


class  CollegeStudent extends Student{
	      @Override	                         //Run time Polymorphism through Method Overriding
void DoHomework() {
	System.out.println("Every student should do their homework ");		
	}
	void diploma() {
		System.out.println("College students have a high school diploma ");
	}}


class   SchoolStudent extends Student{
    	@Override	                             //Run time Polymorphism through Method Overriding
void DoHomework() {
	System.out.println("School students do not have holiday homework ");	
	}
	
}