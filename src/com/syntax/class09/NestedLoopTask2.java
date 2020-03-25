package com.syntax.class09;

public class NestedLoopTask2 {

	public static void main(String[] args) {
		       /*Print the following pattern:
*
**
***
****
*****
****
***
**
*    */
		

      for (int i=0; i<=5; i++) {
			for (int j=1; j<=i; j++) {
				System.out.print("*");
			}
			System.out.println();
		}for(int i=4; i>=0; i--) {
			
			for (int j=1; j<=i; j++) {
				System.out.print("*");
			}
			System.out.println();
		}
	}
	}


