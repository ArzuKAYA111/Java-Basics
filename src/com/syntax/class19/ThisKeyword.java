package com.syntax.class19;

public class ThisKeyword {
	
	int a,b;

	public ThisKeyword() {
		System.out.println("I am non argument constructor");
	}

	public ThisKeyword(int a, int b) {
		this.a=a;//this.a=10;
		this.b=b;//this.b=20;
	}

	public void sum(int a, int b) {
		//sum of which variables am I calculating?
		System.out.println("Sum of local variables "+(a+b));// sum of local variables
		System.out.println("Sum of instance variables "+(this.a+this.b));// sum of instance variables
	}

	public static void main(String[] args) {
		ThisKeyword obj=new ThisKeyword(10, 20);// for sum of instance variables
		obj.sum(100, 200);// for sum of local variables

		System.out.println("------------------------------------------");
		ThisKeyword obj2=new ThisKeyword();// to call constructor so instance variables
		obj2.sum(20, 40);// to call method so local variables
	}
}
