package com.syntax.class18;

public class TaskAccessTEST {
	
	
// in same package different class
	public static void main(String[] args) {
		TaskAccess obj = new TaskAccess();	
		TaskAccess obj1 = new TaskAccess('x');	
//		TaskAccess obj2 = new TaskAccess(" hello");	// it is private it is not visible
		TaskAccess obj3 = new TaskAccess(12.56);	
	}

}
