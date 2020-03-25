package com.syntax.class06;

import java.util.Scanner;

public class SwitchWithString {

	public static void main(String[] args) {
		/*  ask a user where he or she is from
		 * based on the country we will define favorite food 
		 * your favorite food is -------- */
		
	Scanner scan;	
	String country;
	String favoriteFood;
	scan=new Scanner (System.in);
	
	System.out.println("Please enter your country");
	
	country=scan.nextLine();
	
	switch (country) { // country den sonra . koyup upper case yada lower case 
	                    //secebiliriz onlara gore asagiya country isimlerini ayni durumda yazmaliyiz
	
	
	case "Turkey":
		favoriteFood="baklava";
		break;
	case "Morocco":
		favoriteFood="couscous";
		break;
		
	case "Belarus ":
		favoriteFood="Potato";
		break;
	case "Tajikistan":
		favoriteFood="Osh";
		break;
	case "Afghanistan":
		favoriteFood="Mantu";
		break;	
		default:
			favoriteFood="Unknown";
	}
System.out.println(" Your favorite food is " + favoriteFood);

}}
