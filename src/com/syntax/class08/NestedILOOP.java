package com.syntax.class08;

public class NestedILOOP {

	public static void main(String[] args) {
		
for (int i=1; i<=3;i++) {
	
	System.out.println("Hello");
	for(int y=3; y<=4; y++) {
		System.out.println("Bye");
	}
}
	System.out.println("           ");	
		
for (int i=1; i<=3;i++) {
	
	for(int y=1; y<=3; y++) {
		System.out.println(i+"  "+ y);
	}
}		
	/* distaki loop un condition i saglanmazsa program calsimaz ,
	 *  distaki saglaniyorsa program calisir icteki loop'a geldiginde icteki loop'un condition'i
	 *  saglaniyorsa onun  kondition'i tamamlanana kadar onu calistirir
	 *  sonra distakki donguye devam eder.
	 *  ice geldiginde icteki loop'un condition i saglanmiyorsa program onu  distaki donguye devam edr */ 	
		
		
	}

}
