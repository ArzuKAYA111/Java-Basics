package com.syntax.class21;

/* Write program: Shape class has a constructor that takes the radius and has a subclass as  circle class.
 *  In circle class create a method to calculate the area of circle. Test your code*/
public class Shape {

	public int radius;

	public Shape(int radius) {

		this.radius = radius;

	}

}

      class Circle extends Shape {

	double pi;

	Circle(int radius, double pi) {
		super(radius);
		this.pi = pi;

	}

	    public void CircleArea() {

		double area = pi * radius * radius; 

		System.out.println("Area of a circle shape is " + area+ " m^2");

	}
}
