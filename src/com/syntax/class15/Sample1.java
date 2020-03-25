package com.syntax.class15;

public class Sample1 {

	// Method with return type and with arguments(Parameters.
		
public int add(int a, int b){
			int c=a+b;
			return c;
			}
public static void main(String args[]) {
			Sample1 obj= new Sample1();
			
			int x=obj.add(1,2);
			System.out.println(x);
			}
			}