  package com.syntax.class26;

public class EmployeeEncapsulationTest {

	public static void main(String[] args) {
		Employee e=new Employee();
	e.setName("Harry");
		System.out.println(e.getName());
		
	e.setage(34);
		System.out.println(e.getage());
		
	e.setsalary(7000);
		System.out.println(e.getsalary());
		
		System.out.println("...........");// Aselin  testi
		
		Employee emp=new Employee();
		emp.setName("");
		System.out.println(emp.getName());
		
		}
		}