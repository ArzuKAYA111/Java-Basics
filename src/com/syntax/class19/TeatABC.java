package com.syntax.class19;

public class TeatABC {
	public static void main(String[] args) {

		A.age = 33;
		System.out.println(" Age of people is " + A.age);
		

		A people = new A();  

		people.eyes = "All";

		people.display();

		people.love();

		people.work();
		

		B female = new B();

		female.hair = " long";
		female.women();
		

		C male = new C();

		male.heigth = "longer";

		male.displayHeigth();

	}
}
