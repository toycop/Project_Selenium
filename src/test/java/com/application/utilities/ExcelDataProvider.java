package com.application.utilities;

import java.io.File;
import java.io.FileInputStream;

import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class ExcelDataProvider {

File src;

FileInputStream fis;

XSSFWorkbook wb;

public ExcelDataProvider() // constructor
{
	try
	{
		File src=new File("./testdata/data.xlsx");

		fis=new FileInputStream(src);

		wb=new XSSFWorkbook(fis);

	}catch(Exception e)
	{
		System.out.println("Unable to read excel file"+e.getMessage());
	}
}

/**
 * getStringData() method will take sheetIndex, row and col numbers and returns
 * the String value located in that particular cell
 * @param sheetIndex
 * @param row
 * @param col
 * @return
 */

public String getStringData(int sheetIndex, int row, int col) // Overloaded method
{
	// return the String in Login Sheet located in row 0 and column 0
	return wb.getSheetAt(sheetIndex).getRow(row).getCell(col).getStringCellValue();
}

/**
 * getStringData() method will take sheetName, row and col numbers and returns
 * the String value located in that particular cell
 * @param sheetIndex
 * @param row
 * @param col
 * @return
 */
public String getStringData(String sheetName, int row, int col) // Overloaded method
{
	return wb.getSheet(sheetName).getRow(row).getCell(col).getStringCellValue();
}

/**
 * getNumericData() method will take sheetIndex, row and col numbers and returns
 * the String value located in that particular cell
 * @param sheetIndex
 * @param row
 * @param col
 * @return
 */
public int getNumericData(String sheetName, int row, int col) // returns Numeric value
{
	// return the String in Login Sheet located in row 0 and column 0
	
	return  (int)wb.getSheet(sheetName).getRow(row).getCell(col).getNumericCellValue();
	
}

/**
 * getDecimalData() method will take sheetIndex, row and col numbers and returns
 * the String value located in that particular cell
 * @param sheetIndex
 * @param row
 * @param col
 * @return
 */
public double getDecimalData(String sheetName, int row, int col) // returns decimal value
{
	// return the String in Login Sheet located in row 0 and column 0
	
	return  wb.getSheet(sheetName).getRow(row).getCell(col).getNumericCellValue();
	
}

}
