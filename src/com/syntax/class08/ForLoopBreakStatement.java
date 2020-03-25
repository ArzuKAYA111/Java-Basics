package com.syntax.class08;

public class ForLoopBreakStatement {

	public static void main(String[] args) {
	
		// once i=4 ..> we want to stop the loop
		
		for (int i = 0; i < 10; i++) {
			if (i == 4) {
			System.out.println("I am stopping loop");	
				
			break;
			}
			System.out.println(i);
			}
		
		
		System.out.println("I am outside of the loop");
		
		
		
		
		
		

	}

}
