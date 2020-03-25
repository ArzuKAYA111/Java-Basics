package com.syntax.class09;

public class Rcap {

	public static void main(String[] args) {
		
		for (int i=1; i<=3; i++) {
			
			for ( int j=0; j<=3; j++) {
				System.out.println(i + " "+ j);
			}
			
		}
		
		System.out.println(" ...............................");
	
	//using nested loop to print 10 until 99			
					
	for ( int i=1; i<=9; i++ ) {
	
		for (int j=0; j<=9; j++) {
		System.out.println( i +""+ j);	// araya string isareti koyulmazsa sayilari toplar ayri ayri basmaz
		}
	}
		
	}

}
