package com.syntax.class34;
class BalanceException extends RuntimeException{
	
	public BalanceException(String message) {
		super(message);
	}
}

public class ThrowKeyword {

	public static void main(String[] args) {
		
		NullPointerException npe=new NullPointerException();
		
		//throw npe;
		
		//throwException();
		
		withdraw(10000, 1000);
		
		browser("uhkughugukg");
	}
	
	//create a withdraw method for balance and amount 
	public static void withdraw(int balance, int amount) {
		
		if(amount>balance) {
			throw new BalanceException("You balance is too low");
		}
	}
	
	public static void throwException() {
		throw new ArithmeticException();
	}
	
	public static void browser(String browser) {
		
		switch(browser) {
		case "chrome":
			System.out.println("Using chrome browser");
			break;
		case "firefox":
			System.out.println("Using firefox browser");
			break;
		default:
			throw new RuntimeException("Invalid browser");
		}
	}
}



/* it is a keyword used to throw one exception exciplictly
 * We can define our own set of conditions or rules and throw an exception explicitly using throw
 *throw keyword is used to explicitly throw an exception from a method or constructor. 
 *Usually with setters in encapsulation concept, when validating the input. 
 you can throw any runtime exception at any time base on the logic you have */