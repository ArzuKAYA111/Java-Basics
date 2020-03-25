package com.syntax.class08;

public class ExampleforContinue {

	public static void main(String[] args) {
		// Write a program that print numbers from 1 to 20 i do not print 5,6,7
//		
for (int i=1; i<21; i++) {	
		
		if(i==5|| i==6||i==7) {
	continue;	
		}
	System.out.print(i + " ");	
	}	
	 System.out.println("------------- CONTINUE--------------");
	 
// write a program that print numbers from 1 to 100
   // i do not want to print 35-55
    for (int i = 1; i <= 100; i++) {
         if (i >= 35 && i <= 55) {
            continue;
        }
         System.out.print(i + " ");
    }

    
	 System.out.println("------------- CONTINUE--------------");
	 
	 System.out.println("------------- CONTINUE--------------");


	int a=1; 
	 
	while (a<=20) {
		
		if(a==5||a==6|a==7) {
			continue;
		}	
a++;
System.out.print(a + " ");
	}
	 
	 
	}

}
