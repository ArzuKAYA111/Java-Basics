package com.syntax.class10;

public class RetrieveElements {

	public static void main(String[] args) {
	
		
		char[] grades={ 'A','B','C','D','E','F'};
		
		// System.out.println(grades);
		
		// Getting all elements (HOCADAN)
		
		for ( int i=0; i<grades.length; i++) {
			System.out.println(grades [i]+ " ");
		}
		
		
		System.out.println("__ Printing using advance for loop __");
		
		for (char grade:grades) {
			System.out.println(grade+" ");
		}
		
		
		// create any array of fruits and retrieve all elements
		
		String [] fruits= {"Banana", "Kiwi","Orange", "Apple","Mango"};
		
        // if fruits is apple --> that is your favorite fruit advanced for loop,
        //enhanced for loop ,for each loop 
	
		for ( String fruit: fruits) {
		   if (fruit.equals("Apple")) {
			System.out.println(fruit + " is may favotite fruit");	
		}else {
			System.out.println(fruit);
		}	   
	}
	System.out.println("-----------");	
	
	// regular for loop 
	// fruits.lenght=number of element
	for ( int i=0; i<fruits.length; i++) {
	System.out.println(fruits[i]);	
	}
		
	}

}
