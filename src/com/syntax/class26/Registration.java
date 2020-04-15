package com.syntax.class26;
/*Create Registration Class in which you would have variables as email, userName and password that have an access scope only within its own class.
 *  After creating an object of the class user should be able to call methods and in each method separately 
 *  pass values to set users email, username and password. 
Requirements: 
Valid email consider to be only yahoo
Valid userName and password cannot be empty and should be of length larger than 6 characters. Also valid password cannot contain userName. */
public class Registration {   // Encapsulation Task

	private String email;
	private String userName;
	private String password; 	
	
	public void setemail(String email) {
		
		if (!email.isEmpty()) {
			if (email.contains("yahoo")) {
				this.email=email;
			}else {
				System.out.println("E mail must be gmail type ");
			}
	}}
	public String getEmail() {
		return email;
	}
	public void setuserName(String userName) {
		if (!userName.isEmpty()&& userName.length()>6) {
			this.userName=userName;
		}else {
			System.out.println("User name can not be empty and length should be more than 6 characters");
		}
	}
	public String getuserName() {
		return userName;
	}
	public void setpassword(String password) {
		
		if (!password.isEmpty()&& password.length()>6&& !password.contains(userName)) {
			this.password=password;
		}else {
			System.out.println("Invalid password");
		}
	}
	public String getpassword() {
		return password;
	}
}
