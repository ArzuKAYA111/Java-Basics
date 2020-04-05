package com.syntax.class21;

/*Write program: userClass  that has a constructor that initializes instance variable name and mobile number.
 *  Create a subclass  userInfo that will have user address variable and it also being initialized through 
 *  constructor call. Print users name, mobile number and address in userDetails method. Test your code. */


public class userClass {

	String name ;
double mobilNumber;
	
	userClass(String name ,double mobilNumber){
		this.name=name;
		
		this.mobilNumber=mobilNumber;
		
	}


public static void main (String [] args) {

userInfo Uinf =new userInfo("6060 Clacrk Ridge Dr Dallas/Texas" , "zuleyha", 122255544 );	

Uinf.userDetails( );           //      I tested the inheritance int the parent class

}
	
	
}
 class userInfo extends userClass{
	
	String userAdress;
	
	userInfo(String userAdress,String name,double mobilNumber){
	super(name,mobilNumber );
	this.userAdress=userAdress;
	}
void userDetails( ){
		
		System.out.println("Users name is " + name + " user's mobile number is "+mobilNumber+ "and address is "+ userAdress );
	}

	
	}


