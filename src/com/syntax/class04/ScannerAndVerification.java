package com.syntax.class04;

import java.util.Scanner;

public class ScannerAndVerification {

	public static void main(String[] args) {
		/*  Capture two numebers from a user and 
		 * then compare those numbers and
		 *  identify which is larrger
		 *  
		 *  Scanner scan=new Scanner(System.in);
		 *  String text=scan.netxLine();
		 *  String name=scan.netxt();
		 *  int number=scan.nextInt();
*/
  Scanner input=new Scanner(System.in);
  
        System.out.println("Please enter the first number");

        int num1=input.nextInt();
        System.out.println("Please enter the second number");
        
        int num2=input.nextInt();
        
    // System.out.println(num1);  // System.out.println(num1);   girilen sayilari asagida vermemesini istiyorsak
     
        System.out.println(num2);  // System.out.println(num2);   bu sekilde yapabiliriz
      
      if (num1>num2) {
    	  
    	 System.out.println( num1+ " is larger then "+ num2);
      }
      else if (num1==num2) {
    	  System.out.println(num1+" is equal to "+num2); 
      }
      
      else {
    	  System.out.println(num2+" is larger then " +num1);
      }
	}

}
