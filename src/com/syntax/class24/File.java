package com.syntax.class24;
/*Create a class File that will have the following behaviors: open, edit, close. Edit and close are implemented method while open is an abstract.                                                          
 * Create 3 subclasses: JavaFile, WordFile, PDFFile that will provide specific implementation of open behavior:
 Example: to open .java file we need note pad++ or sublime text, to open .doc file we need Microsoft word to be installed etc */
public abstract class File {
	
abstract void Open();  
	 
public void  edit() {
	System.out.println("Sentence can add to files");	
	}	

public void  close() {
	System.out.println("Close file ");	
	}
}
class JavaFile extends File{
	@Override
public void Open() {
		System.out.println("To open .java file we need note pad++ or sublime text ");
	}
	@Override
	public void  close() {
		System.out.println("Java file can close ");	
	}}

class WordFile extends File{
	@Override
	public void Open() {
		System.out.println("To open .doc file we need Microsoft word to be installed ");
	}
	@Override
	public void  close() {
		System.out.println("Word file can close ");	
		}
}
class PDFFile extends File{
	@Override
	void Open() {
		System.out.println("To open .pdf file we need Adobe PDF reader ");
	}
	@Override
	public void  close() {
		System.out.println("PDF file can close ");	
		}
}