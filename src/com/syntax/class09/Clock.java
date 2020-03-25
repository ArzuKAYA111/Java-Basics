package com.syntax.class09;

public class Clock {

	public static void main(String[] args) {
		// using nested loop to print clock
		
		for ( int h=0; h<=23; h++) {
		
		for ( int min=0; min<=59; min++ )	{
			if (min<10 )	{
				System.out.println(h+ " :"+"0"+ min );	
		}else {
			
		System.out.println(h+ " :"+ min );	
		}
		
		
		}}
		
		
	/////////////////////////////////////////////////	
		
//		
//	int i=0;
//	int y=0;
//	int z=0;
//	for (i=0; i<=23; i++) {
//			for(y=0; y<=59; y++){
//			if(y<10) {
//					System.out.println(i+":"+"0"+y);
//			} else {
//			System.out.println(i+":"+y);
//		}
//			for(z=0; z<=59; z++){
//					if(z<10) {
//					System.out.println(i+":"+y+":"+"0"+z);
//					
//					}else {
//					
//					System.out.println(i+":"+y+":"+z);
//			}
//		}
//	}	
//		
//		
//		}
	}

}
