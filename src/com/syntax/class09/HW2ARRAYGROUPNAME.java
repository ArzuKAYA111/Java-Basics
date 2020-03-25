package com.syntax.class09;

public class HW2ARRAYGROUPNAME {

	public static void main(String[] args) {
		/*   Create an array of names and store all names of your group.
		 *  Then print your name from that array. (use 2 different ways 
		 *  of creating an array).
          */
//1 WAY
	String[] namesGroup= new String[6];
	
	namesGroup[0]= "GulJemal";
	
	namesGroup[1]= "Adile";
	
	namesGroup[2]= "Arzu";
	namesGroup[3]= "Azra";
	namesGroup[4]= "Selbinyyaz";
	namesGroup[5]= "Patyshagul";
	
	System.out.println(namesGroup[2]);
	
	
	System.out.println("            ");
//2 WAY	
	
	String[] namesGroup1= {"GulJemal","Adile","Arzu","Azra", "Selbinyyaz","Patyshagul"};
	
	
	System.out.println(namesGroup[2]);
	
	
	}

}
