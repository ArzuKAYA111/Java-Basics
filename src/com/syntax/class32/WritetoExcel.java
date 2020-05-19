package com.syntax.class32;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;

import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class WritetoExcel {

public static void main(String[] args) throws IOException {
		
	
	String filePath="//Users/beyha//eclipse-workspace//JavaBasics//TestExel//ToWrite.xlsx";
	System.out.println(filePath);

	
  String filePath1=System.getProperty("user.dir")+"\\TestExel\\ToWrite.xlsx";
  System.out.println(filePath1);

	FileInputStream fis=new FileInputStream(filePath1);
		
		Workbook book=new XSSFWorkbook(fis);
		
		//writing into existing sheet
		Sheet sheet1=book.getSheet("Sheet1");// Sheet1 is existed sheet it has Datas
		
		sheet1.getRow(0).createCell(5).setCellValue("Country");
		
		sheet1.createRow(3).createCell(0).setCellValue("Hichem");
		
		Sheet customSheet=book.createSheet("TestSheet"); // created new Sheet
		book.getSheet("TestSheet").createRow(0).createCell(0).setCellValue("Names");
		
		FileOutputStream fos=new FileOutputStream(filePath1);
		
		book.write(fos);

	}
}
