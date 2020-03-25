package com.syntax.class08;

public class LoopMoreReview {

	public static void main(String[] args) {
		
		// To print number from 50 to 1 

		for( int num=50; num>=1; num--) {
			System.out.print(num+ " ");
		}
		
		
		System.out.println("            ");
		System.out.println("            ");
		
		
		// print odd number between 20 to 50
		
		for(int i=20; i<=50; i++) {
			if(i%2!=0) {
			System.out.print(i + " ");
			}
		}
		
		System.out.println("            ");
		System.out.println("            ");
		
		
		
		// print even number between 20 to 50
		
				for(int i=21; i<=50; i++) {
					if(i%2==0) {
					System.out.print(i + " ");
					}
				}

				System.out.println("            ");
				System.out.println("            ");
				
			// what is the out put 
				int total=2;
				for(int k=1; k<4; k++) {
					total=total*k;
					System.out.println(total);                          // out print i for blok unun icine koyarsak her dondu icin sonuc basacak yani 2, 4 ,12,     
				}
				System.out.println("Final " + total);   // out print buradayken  12 veriyor
				
		
				
				
				
				
	}

}
