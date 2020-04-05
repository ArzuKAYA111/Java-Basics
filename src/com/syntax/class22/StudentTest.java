package com.syntax.class22;

public class StudentTest {

	public static void main(String[] args) {
		
		//UPCASTING
		
		Student obj =new SyntaxStudent ();
		
		obj.DoHomework();
		
		// obj.learn(6);CE method learn() did not define in student class
		
		
		Student obj1=new CollegeStudent();
		obj1.DoHomework();
		
	//	obj1.diploma();CE method diploma() did not define in student class
		
		
		Student obj2=new SchoolStudent() ;
		obj2.DoHomework();
	
	
	System.out.println("...........................");	
	
		// REGULAR TEST
		
		Student S= new Student();
		S.DoHomework();
		
		
		SyntaxStudent Sy= new SyntaxStudent ();
		Sy.DoHomework();
		Sy.learn(6);
		
		CollegeStudent Co = new CollegeStudent ();
		Co.DoHomework();
		Co.diploma();
		
		SchoolStudent Sc= new SchoolStudent();
		Sc.DoHomework();
	}

}
