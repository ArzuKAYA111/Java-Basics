package com.syntax.class26;

class Employee {// Encapsulation Example
	
	//define private variables
private String name;
private int age;  
private double salary; 

// define public methods to give an access to private variable   

//getter methods
public String getName() {
return name;
}

public int getage() {  // read access 
return age;
}

public double getsalary() {
return salary;
}


//setters 
public void setName(String name){
	if (!name.isEmpty()&& name.length()>3) {
		this.name=name;	
	}

}

public void setage(int age){// writing access
this.age=age;
}
public void setsalary(double salary){
this.salary=salary;
} 

}
