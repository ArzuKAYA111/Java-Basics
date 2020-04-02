package com.syntax.class20_1;

import com.syntax.class20.Employee;

public class WaterfallTeam  extends Employee{

	public static void main(String[] args) {
		
		WaterfallTeam wteam=new WaterfallTeam();
		
		Employee.company="Syntax";// public visible ( everywhere) in different packeg class
		
		wteam.empNumber=124;// protected variables is visible to the child class in different Package
		//wteam.salary // CE: default variable is not visible
		//BREAK TILL 8:55
	}
}