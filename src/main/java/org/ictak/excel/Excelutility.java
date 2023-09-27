package org.ictak.excel;

import java.io.FileInputStream;
import java.io.IOException;

import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class Excelutility 
{
	public static XSSFWorkbook excelwbook;
	public static XSSFSheet excelsheet;
	public static String getData(int rowNum,int colNum) throws IOException
	{

	FileInputStream File=new FileInputStream("C:\\Users\\Arun\\eclipse-workspace\\SeleniumPractice\\LearnerTracker\\src\\main\\resources\\Testdata.xlsx");
	excelwbook=new XSSFWorkbook(File);
	excelsheet=excelwbook.getSheetAt(0);
	return excelsheet.getRow(rowNum).getCell(colNum).getStringCellValue();
	
	
	}
}