package com.syntax.class20;

public class TestClass {

	public static void main(String[] args) {

		//parent class ve bir tane subclass access yapmis 
		Employee emp=new Employee();
		
		emp.empNumber=101;
		emp.salary=90000;
		emp.getPaid();
		//emp.ssn=7521700; ssn defined private it can not visible in different test class (Class)
		Employee.company="ABC";
		Employee.work();
		
		
		System.out.println("-------------------------------------");
		
		ProductOwner po=new ProductOwner();
		
		//features accessible from grand parent
		po.empNumber=123;
		po.salary=150000;
		//po.ssn --> CE: private members of the class not available 
		//--> DO NOT PARTICIPATE I INHERITANCE
		ProductOwner.company="Syntax";// accessing static member from grandparent
		// we changed the value of company ; company defined static so after change value of company becomes Syntax for all classes
		//features accessible from immediate parent
		// immediate parent of ProductOwner is ScrumTeam /Employee its grand parent
		//ceremonies defined in ScrumTeam not Employee
		po.ceremonies="Sprint Grooming, Sprint Planning, Sprint Demo, Daily Stand up";
		po.attendMeetings();
		//accessing own features
		po.prioritizeBacklog();
		
		ProductOwner.work();// accessing static member(method ,variable) from grandparent
		Employee.work();// grand parent in work methodunu tekrar call yaptik printte company ABC degil Syntax olacak
		
		
	}
}