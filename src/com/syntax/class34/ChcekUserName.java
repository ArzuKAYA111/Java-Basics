package com.syntax.class34;
/*Create a method checkUserName that will throw a runtime exception. Method should throw an exception when entered username is less than 5 characters.
 */
public class ChcekUserName {
	
	public static void CheckUserName(String name) {
		if (name.length()<=5) {
			throw new RuntimeException("User Name is so short");
		}else {
			System.out.println("Useable User name ");
		}	
	}
	
	public static void main(String[] args) {
	//	ChcekUserName.CheckUserName("James");
		ChcekUserName.CheckUserName("Aysegul");
	}

}
