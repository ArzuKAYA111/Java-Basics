package com.syntax.class19;

public class Strudents {
/* Write program as a Student class   that has instance variables name and address.
 *  Create a constructor that will initialize those variables.
 *  Print name & address of given  student using displayInfo method.*/
	
	
	String name;
	String adress;
	Strudents (String name,String adress ) {
	this.name=name;
	this.adress=adress;
	}
	
	void displayInfo(){
		System.out.println(" Sturdent name is "+ name+ " Student adress is "+ adress);
		
	}
	public static void main(String[] args) {
		
		Strudents obj=  new Strudents("Hakan" ," Dallas Texas")	;
		obj.displayInfo();
		
		
		
	}
}
