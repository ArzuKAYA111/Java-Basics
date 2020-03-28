package com.syntax.class17_1;

import com.syntax.class17.Employee;

public class accessingMembersOfDifferentClass {

	public static void main(String[] args) {
	
		Employee emp=new Employee();
		emp.name="Ahmet";
		//below variable not available due to restrictions
//		emp.lastName="Smith";  // access modifier....>protected is not visible from the other package
//		emp.salary=9000;        //access modifier....>default is not visible from the other package
//		emp. ssn=908776766;     //access modifier....>private is not visible from the other package
//	
		
		Employee.method1(); // public
		//below variable methods available due to restrictions
//		emp.method2(); //....> protected 
//		emp.method3(); //....>default 
//		emp.method4();  //....>private
//		
		// only public can visible everywhere( from other class from other package everywhere.)
		
	}

}
