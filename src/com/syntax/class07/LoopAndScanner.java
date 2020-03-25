package com.syntax.class07;

import java.util.Scanner;

public class LoopAndScanner {

	public static void main(String[] args) {
		//we want to ask user's  name and print good afternoon.....

Scanner input;
String name;
int num=1;

System.out.println("What is your Name");

	input=new Scanner(System.in);
	name=input.nextLine();
	while(num<=5) {
	
	System.out.println("Good afternoon "+ name);
	num++;
	
	}
	
	System.out.println("___________________");

	String name1;

	int num1=1;
	while(num1<=5) {
	System.out.println("What is your Name");

		input=new Scanner(System.in);
		name1=input.nextLine();
		
		System.out.println("Good afternoon "+ name1);
		num++;
		
		}
	
	
	
	
	
	}
}
