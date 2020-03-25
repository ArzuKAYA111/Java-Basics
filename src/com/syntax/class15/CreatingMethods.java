package com.syntax.class15;

public class CreatingMethods {

	//we want to create a method that will accept marks(90, 80)
		// based on the marks it will return grade(A, B, C)
		// if grade > 90--> A, if 90<grade>80 --> B, if 80<grade>70 --> C
	
	String returnGrade(int a){
		if (a>=90) {
		return"A";	
		
	}else if(80<=a&&a<90) {
		return"B";	
	}else if(70<a && a <80) {
		return"C";
	
	} else {
		return "F";
	}

}	
public static void main (String	[] args) {
	
	CreatingMethods obj= new CreatingMethods();
	String  returnGrade=obj.returnGrade(85);
	
	System.out.println(obj.returnGrade(85)+ " Good job");
	System.out.println(obj.returnGrade(90)+ " Great job");
	System.out.println(obj.returnGrade(70)+ " You failed pleae work hard");
	
}
}
