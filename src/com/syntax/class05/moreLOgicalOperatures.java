package com.syntax.class05;

public class moreLOgicalOperatures {

	public static void main(String[] args) {
		/*
		 * we have 7 days in a week if day is 2,3 ....>SDLC class if day is 6,7...> Java
		 * Class if Day is 1,5...> off day if day 4....>Review Class
		 */

		// To compare numbers we use if (x==1234)
		int day = 4;
		
		if (day == 2 || day == 3) {
			System.out.println("Today is SDLC calss");
		} else if (day == 6 || day == 7) {
			System.out.println("Today is Java class");
		} else if (day == 1 || day == 5) {
			System.out.println("Today is no class,it is day off");
		} else if (day == 4) {
			System.out.println("Today is a review class with Elion");

		} else {
			System.out.println("Invalid day");
		}
		{
			System.out.println("..............");
			
			
			String day1 = "Friday";
			
			// To compare the String we use .....> if (x.equals("yyzt"))
			if (day1.equals("Tuesday") || day1.equals("Wednesday")) {
				System.out.println("Todya is  SDLC Class");

			} else if (day1.equals("Saturday") || day1.equals("Sunday")) {
				System.out.println("Todya is  Java Class");

			} else if (day1.equals("Monday") || day1.equals("Friday")) {
				System.out.println("Today is no class, it is day off");

			} else if (day1.equals("Thursday")) {
				System.out.println("Today is a review class with Elion");

			} else {
				System.out.println("Invalid day");
			}
		}
	}
}
