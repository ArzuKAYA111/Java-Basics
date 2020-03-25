package com.syntax.class04;

import java.util.Scanner;

public class ScannerExample {

	public static void main(String[] args) {
		
		
	/*	Capture  name from a user and print in the format My name is____
		
		*/
    Scanner scan=new Scanner(System.in);

    System.out.println("Please write your name ");
    
      String name=scan.nextLine();

      System.out.println("My name is " + name);
      
      System.out.println( "How old are you?");
      
      int age=scan.nextInt();
      
     System.out.println(" Your name is " + name + " your age is " + age );
	}

}

