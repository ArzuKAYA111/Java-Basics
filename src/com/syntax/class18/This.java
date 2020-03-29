package com.syntax.class18;

public class This {
	
	//create variables to hold STATE  and CAPITAL of the state
		
	String state, stateCapital;
		
		//create method to display state and stateCapital
		public void display() {
			System.out.println(state+" and it's capital is "+stateCapital);
		}
		
		
		
		//create a Constructor that will initialize instance variables
		
		public This(String state, String stateCapital) {
			this.state=state;                        // constructor with parameters (constructor with argument)
			this.stateCapital=stateCapital;
		}
		
		
		public static void main(String[] args) {
			
			 This usa=new  This("Virginia", "Richmond");
			usa.display();
		}
	}
