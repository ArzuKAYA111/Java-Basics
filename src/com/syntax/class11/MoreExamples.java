package com.syntax.class11;

public class MoreExamples {

	public static void main(String[] args) {
		// lets creat 2D array in which we store professions
		String [][] professions= {
				{"QA Tester","Developer","Product owner","Scrum master"},
				{"Math Teacher", "Science Teacher","ELS Teachers"},
				{ "Dentist","Surgeon"}};
				
				
	// get elements using advance for loop			
		
		for( String[] occupation:professions) {
			for( String items:occupation) {
				System.out.println(items);
			}
		}
		
/*      */		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
	}

}
