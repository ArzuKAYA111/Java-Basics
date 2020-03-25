package com.syntax.class09;

public class MoreArrays {

	public static void main(String[] args) {
		

		String[] students =new String[3];// can not store more than 3 variables
		
		students[0]="Hasna";
		students[1]="Faisal";
	    students[2]="Kemal";
	  //students[3]="Aaron";// during run time java machine will give ArrayIndexOut
	 
		//System.out.println(students [3]);
		
		// yukarida 3 varible depolanacak dedgimiz icin asagida
		//4 tane depolayamiyoruz hata veriyor
	System.out.println("....................");	
		
	String [] inClassStudent=new String[5];
	inClassStudent[0]="Hichem";
	inClassStudent[1]="Tetteh";
		
		System.out.println(inClassStudent[2]);//index 2 da initialize yapilmadigi icin 
	                                        	//  compiler bize default value verir , String oldugu icin
		                                        //null diye print verir
		
	}

}
