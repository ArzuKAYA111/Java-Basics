package com.syntax.class15;

public class GoogleMe {
	// define features such as emp id, name, last name, salary, title
    // define a behavior working, get paid, attending meetings
	
	
	// lets create variables according to the features
	int empId;
	double salary;
	
	String name ,lastName, title;
	
	// lets create methods according to the behaviors
	
	void working() // method header 
	{
	System.out.println(title + " is working");	// method body
	}
	
  void getPaid() {
	System.out.println(name + " is getting paid "+ salary );	
	}
	
  void attendingMeetings() {
	System.out.println(name+ " is attending Meetings"  );	
	}
	
	
	public static void main(String[] args) {
		
	// create an object to exucute the  variables and methods
		
		GoogleMe empl1 = new GoogleMe ();
		
		empl1.empId=2785;
		empl1 .salary=3000;
		empl1 .name ="John";
		empl1 .lastName="Smith"; 
		empl1 . title ="developer"; 
	
		empl1 .working() ;
		empl1 .getPaid() ;
		empl1 .attendingMeetings() ;
		
GoogleMe empl2 = new GoogleMe ();
		
		empl2.empId=1234;
		empl2 .salary=7000;
		empl2 .name ="Arzu";
		empl2 .lastName="Kaya"; 
		empl2 . title ="Tester"; 
	
		empl2 .working() ;
		empl2 .getPaid() ;
		empl2 .attendingMeetings() ;
		
		
		
	}

}
