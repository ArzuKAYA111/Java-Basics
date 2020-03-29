package com.syntax.class18;

public class TaskAccess {
	/*
	 * Write a program that will have 4 different access levels of constructors and
	 * create 3 objects of this class: 1 - inside same class; 2 - from outside the
	 * class; 3 - from different class inside different package and observe result.
	 */

	public  TaskAccess() {
System.out.println(" I am public ");
	}

   TaskAccess (char c){
		System.out.println(" I am default ");	
	}

	private TaskAccess(String str) {
		System.out.println(" I am private ");
	}

	protected TaskAccess(double b) {
		System.out.println(" I am protected ");
	}
	public static void main(String[] args) {
		
		TaskAccess obj = new TaskAccess();	
		TaskAccess obj1 = new TaskAccess('x');	
		TaskAccess obj2 = new TaskAccess(" hello");	
		TaskAccess obj3 = new TaskAccess(12.56);	
	}
	
}
