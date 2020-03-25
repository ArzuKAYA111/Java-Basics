package com.syntax.class10;

public class TaskArrayCountries {

	public static void main(String[] args) {
		// Create an array of countries. While retrieving all values 
		//from an array print capital for each country.
		//(use 2 different loops).

		
		
		String [] countries= {"Turkey", "Russia","Bulgaria", "USA"}; 
				
		for (String country:countries) {
			System.out.println(country);
			
			
			if( country.equals("Turkey") ) {
				System.out.println(" The capital  of " + country + " is Ankara");	
				
			}else if( country.equals("Russia") ) {
				System.out.println(" The capital of " + country + " is Moskowa");	
				
			}else if( country.equals("Bulgaria") ) {
				System.out.println(" The capital of " + country + " is Soma");	
				
			}else if( country.equals("USA") ) {
				System.out.println(" The capital of " + country + " is Washington");		
			}		
			
		}
		
		
		System.out.println("----------Second Method --------------------");
		
		for (int y=0; y<countries.length; y++) {
			
			switch(countries[y]) {
			case "Turkey": 
				System.out.println(" The capital is Ankara");
			break;
			
			case "Russia":
				System.out.println(" The capital is Moskowa");
			break;
			case "Bulgaria":
			
				System.out.println(" The capital is Soma");
			break;
			case "USA":
				
				System.out.println(" The capital is Washington");
			break;
			
			
			}
			
			
			
			
			
			
		}
		
		
		
		
		
	}

}
