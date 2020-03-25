package com.syntax.class07;

public class HW4 {

	public static void main(String[] args) {
		// Print odd numbers between 20 and 50 (2 ways)

		
		// 1 Way 
					
				int X=20;
					while(X<=50){
						
					  System.out.print(X + " ");
					X +=2;	
					}
					System.out.println("                   ");
					System.out.println("___________________");	
		// 2 Way 
					int num=20;
					while (num>=1){
						
						if( num%2== 0) {
							System.out.print(num + " ");
						}
						num--;	
					}
					
					System.out.println("                  ");
					System.out.println("___________________");	
		//3 way 
					int y=20;
					while(y>=1) {
						
						System.out.print(y-- + " ");
					y--;	
					
					}	
				
		//4 Way
					
		for(int i=50; i>=1; i--) {
			System.out.print(i+ " ");
		}
		
		//5 Way
		System.out.println("                  ");
		System.out.println("___________________");		
		
		for(int k=21; k<=50; k+=2) {
			System.out.print(k +" ");
		}
		// what is output EXAMPLE
		System.out.println("                  ");
		System.out.println("___________________");
		
		int total=2;
		for(int l=1;l<4; l++) {
			total=total*l;
			System.out.println(total);
		} 
		System.out.print("final total "+ total);
		
		
	}

}
