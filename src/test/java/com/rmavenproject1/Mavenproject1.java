package com.rmavenproject1;

import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;

import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class Mavenproject1 {

	public static void main(String[] args) throws IOException {
		
		//1. Mention the path of the Excel
		File file = new File("C:\\Users\\rekha\\OneDrive\\Documents\\Framework required docs\\Data.xlsx");
		
		//2. Read the objects/Bytes from File -> FileInputStream Class
		FileInputStream stream = new FileInputStream(file);
		
		//3. Mention the WorkBook
		Workbook workbook = new XSSFWorkbook(stream);
		
	    //4. Get the Sheet name
		Sheet sheet = workbook.getSheet("Details");
		
		//5. Get the Row details
		Row row = sheet.getRow(1);
		
		//6. Get the Cell 
		Cell cell = row.getCell(0);
		System.out.println(cell);
		
	}
	
	

}
 