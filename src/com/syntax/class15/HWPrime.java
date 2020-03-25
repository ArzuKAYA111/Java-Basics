package com.syntax.class15;

public class HWPrime {
	
////	Write a method to return whether given number is prime or not?
 public boolean isPrime() {
	 
	 int a=8;
	boolean isPrime=true;

	if(a>1) {
		for(int i=2; i<a; i++) {
			if(a%i==0) {
				isPrime=false;
				break;
			}
		}

	}else {
		isPrime=false;
		
	}
	return isPrime;
 }
 
	public static void main(String[] args) {
		
		HWPrime prim=new HWPrime ();
		boolean primeNum=prim.isPrime();
		System.out.println("number is prime : "+ primeNum);	
		
	}
		
	}





