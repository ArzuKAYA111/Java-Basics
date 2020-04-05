package com.syntax.class21;
/*	Create 1 class in which create a methods that will calculate the area (volume) of 
	Rectangle
	Square
	Box
  */
public class Area {

	public void area(int a, int b) {
		                             // a ...> long side of rectangle
		int areaRec = a * b;         // b ...> short side of rectangle

		System.out.println("Area of Rectangle is = " + areaRec);
	}

	public void area(int a) {
		                          // square has same length sides
		int areaSq = a * a;       // a.....> length of sides

		System.out.println("Area of Square is = " + areaSq);
	}

	public void area(int a, int b, int c) {
		                                                     // a ....> length of longer side
		double areaRecBox = a * b * c; // rectangle box      // b.....> length of shorter side
										                     // c.....> 6 number of face on box to find total area
		
		System.out.println("Area of rectangle box is = " + areaRecBox);
	}

	public void area(double a, short b) {

		double areaSqBox = a * a  *b  ; // square box     // a.....> length of sides (a*a area of one surface)
										                   // b.....> 6 number of face on box to find total area

		System.out.println("Area of square box is = " + areaSqBox);
	}

}
