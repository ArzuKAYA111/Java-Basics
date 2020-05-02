package com.syntax.class32;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class ReadingTest1 {

	public static void main(String[] args) throws IOException {
		
	// 1. step	// To read first I need path to reach the file
		
		String filePath= System.getProperty("user.dir")+ "\\TestExel\\Test1.xlsx";
		
		
//2. step		// To reach the data we need to fileInputStream and Pass it file path
		
		FileInputStream fis= new FileInputStream(filePath);

//3. step	//Create the XSSFWorkbook object and pass Stream to its constructor and store it into Parent type of interface object (Workbook)
		
		Workbook wbook=new XSSFWorkbook(fis);
		
//4. step  	//based on wbook	access the Sheet and store it in Sheet type object
		
		
		Sheet sht= wbook.getSheet("Sheet1");
		
//5. step  //	based on sheeet access the row and store it Row type object// we can access rows according to the which one we need
		
		Row row1 = sht.getRow(0);
		
// 6. step	// based on row access the cell and store it into Cell type object 
		
		Cell r1cell2= row1.getCell(1);
		
// 7 step  // get value from cell and convert it into String and Store it in String type object and print 		
		
		String r1Cell2=r1cell2.toString();
		System.out.println(r1Cell2);
		
		//How to get/access  New York
		
// 1 way 
		Row row2=sht.getRow(2);
		Cell cell2=row2.getCell(2);
		String CellNewYork=cell2.toString();
		System.out.println(CellNewYork);
		
		
	// 2 way	
		String cell=sht.getRow(2).getCell(2).toString();
		
		System.out.println(cell);
		
            //How to get/access  20151
//1 way
		String cell20151= sht.getRow(1).getCell(4).toString();// it gives double value with .0 if we dont want we can use String manipulation
   
		System.out.println(cell20151);
		
		String [] arrCell=cell20151.split("\\.");// . i isleme almasi icin \\ kullandik
		System.out.println(arrCell[0]);
		
		
		
		
// 2 way 		
		
	int Cell20151= (int) sht.getRow(1).getCell(4).getNumericCellValue();// it's return Double value if we dont want to double we can convert to int.(Down Casting)
		
		System.out.println(Cell20151);
		
		
		
		
	}

}
