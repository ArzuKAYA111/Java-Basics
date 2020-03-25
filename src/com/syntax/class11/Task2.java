package com.syntax.class11;

public class Task2 {

	public static void main(String[] args) {
		/* Create an array of countries: north america countries, 
		 * south america countries, europe countries, asian countries, african countries.
		 *  Then print all values from that array using 2 different loops and calculate how many 
		 *  total countries been stored.*/
	
	int Total=0;
		String[][] country= {
                {"Argentina ", "Peru", "venezula", "bolivia"},
                {"german", "england", "spain","italy"},
                {"chia", "korea"},
                	{"nigeria","chad"},
	 };
        	        for(String[] arrays:country) {
        	            for(String title:arrays) {
        	                System.out.print(title+" ");
        	                Total++;
        	            }
        	            System.out.println();
        	           
        	        }
        	        System.out.println(" Total Countries = " +Total);
	
	
	
	
	
	
	
	}

}
