package com.syntax.class17;

public class Employee {

// create variables to hold name, lastName,title, SSN, salary.	
	
	
	public static String title;
	public String name;//accessible everywhere /ayni programin icinde her class ve package da kullanilabilir (access ) olur
	
	protected String lastName;// accessible within the same package // within all class in the same package
	
	double  salary;//default- accessible within the same package// within all class in the same package   protecter and double similar but not same we will learn later
	
	private long ssn;// will be accessible ONLY within the same class
	
	public static void method1() {
		
		System.out.println(" I am public method ");
	}
protected void method2() {
		
		System.out.println(" I am protected method ");
	}

 void method3() {
	
	System.out.println(" I am default method ");
	
}
private void method4() {
		
		System.out.println(" I am a private method ");
		
	}
	public static void main(String[] args) {
		
		Employee emp=new Employee();
		// accessing all variables
		emp.name="John";
		emp.lastName="Smith";  // in the same class we can access all variables
		emp.salary=9000;
		emp. ssn=908776766;
		
	// accessing all methods
		Employee.method1();
		emp.method2(); // in the same class we can access all methods
		emp.method3();
		emp.method4();  
					
				
				
	}

}
