package com.syntax.class22;
/*Create a class CreditCard and define variable balance and interest. 
 * Create an instance method that will calculate interest based on the given balance. 
Create 2 subclasses: Visa and AX. In AX class override method calculate interest. 
Call the method by creating an object of each of the three classes. */

public class CreditCadr {
double balance;
double interest;

CreditCadr(double balance ){
	this.balance=balance;
    
	
}

double calculateInterest() {
	
	if (balance<1000) {
		interest+=balance*0.2;
	}
	if (balance>1000) {
		interest+=balance*0.1;
	}
	
	return interest;
}}

 class Visa extends  CreditCadr{
	Visa(double balance ){
		super(balance);
	}
	@Override
	 double calculateInterest() {
			
			if (balance<1000) {
				interest+=balance*0.2;
			}else {
				interest+=0;
			}
			
			return interest; // we can write print line instead of return
		}	
	
	
}

class AX extends  CreditCadr{
	

	AX (double balance ){
		super(balance);
	}
	@Override
	
	double calculateInterest() {
		
		if (balance<1000) {
			interest+=balance*0.05;
		}
		if (balance>1000) {
			interest+=balance*0.02;
		}
		
		return interest;
	}
}
