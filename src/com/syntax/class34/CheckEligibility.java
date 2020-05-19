package com.syntax.class34;
/*Create a method to check age eligibility that will throw a runtime exception. Method should throw an exception age is less than 16.
*/
public class CheckEligibility {
	
	
public static void AgeEligibility(int age) {
		
		if(age<18) {
			throw new RuntimeException("Your age is not eligibil");
		}else {
			System.out.println(" age appropriate for permanent driving license");
		}
	}

	public static void main(String[] args) {
		CheckEligibility.AgeEligibility(17);
		
	}

}
