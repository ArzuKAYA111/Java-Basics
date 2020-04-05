package com.syntax.class22;

public class TestCreditCard {

	public static void main(String[] args) {

		
		CreditCadr C = new CreditCadr(3000);
		double interest = C.calculateInterest();
		System.out.println(interest);
  
		
		
		Visa V = new Visa(500);
		double inter = V.calculateInterest();
		System.out.println(inter);

		
		
		
		AX obj = new AX(37000);
		double intr = obj.calculateInterest();
		System.out.println(intr);

	}

}
