package com.syntax.class24;

public class FileTest {

	public static void main(String[] args) {
		
		File J =new JavaFile ();
		J.Open();
	
		File W =new WordFile  ();
		W.Open();
		
		File PDF =new PDFFile   ();
		PDF.Open();
		
		System.out.println("..................");
		
		JavaFile  Ja =new JavaFile ();
		Ja.close();
		Ja.edit();
		
		WordFile Wo =new WordFile  ();
		Wo.close();
		Wo.edit();
		
		PDFFile  PDFF =new PDFFile   ();
		 PDFF.close();
		 PDFF.edit();
	}

}
