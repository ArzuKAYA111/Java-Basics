package com.syntax.class09;

public class HW3ARRAYSECTENCE {

	public static void main(String[] args) {
		/*Create an array of words: Java, Saturday, day, coding, is.
		 *  Print the following sentence using elements of array: 
		 *  “Saturday is Java coding Day”.  */	

// 1 WAY	
		
	String[] words=new String[5];
		
		words[0]="Java";
		words[1]="Saturday";
		words[2]="day";
		words[3]="coding";
		words[4]="is";
		
   System.out.println("Sentence: "+ words[1]+" "+ words[4]+" "+words[0]+" "+words[3]+" "+words[2]+".");


   System.out.println("                       ");

//2 WAY

           String[] words1={"Java","Saturday","day","coding","is"};

          System.out.println("Sentence: "+ words1[1]+" "+ words1[4]+" "+
                             words1[0]+" "+words1[3]+" "+words1[2]+".");

	}

}
