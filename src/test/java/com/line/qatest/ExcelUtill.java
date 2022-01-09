package com.line.qatest;

import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.text.SimpleDateFormat;

import org.apache.poi.ss.usermodel.CellType;
import org.apache.poi.ss.usermodel.DataFormatter;
import org.apache.poi.ss.usermodel.DateUtil;
import org.apache.poi.xssf.usermodel.XSSFCell;
import org.apache.poi.xssf.usermodel.XSSFFormulaEvaluator;
import org.apache.poi.xssf.usermodel.XSSFRow;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

public class ExcelUtill {
	static FileInputStream fis;
	static XSSFWorkbook workbook;
	static XSSFSheet sheet;
	DataFormatter dataFormatter = new DataFormatter();


	public static String getCellDataType(XSSFCell cell) {
		switch (cell.getCellType()) {
		case STRING:
			return cell.getStringCellValue();
		case NUMERIC:
			if (DateUtil.isCellDateFormatted(cell)) {
				SimpleDateFormat dateFormat = new SimpleDateFormat("dd MMMM yyyy");
				String cellIsDate = dateFormat.format(cell.getDateCellValue());
				return cellIsDate;
			} else {
				return String.valueOf(cell.getNumericCellValue());
			}
		case BOOLEAN:
			return String.valueOf(cell.getBooleanCellValue());
		case ERROR:
        	return String.valueOf(cell.getErrorCellString());
		case FORMULA:
			if (cell.getCellType() == CellType.FORMULA) {
			    switch (cell.getCachedFormulaResultType()) {
			        case BOOLEAN:
			        	return String.valueOf(cell.getBooleanCellValue());
			        case NUMERIC:
			        	return String.valueOf(cell.getNumericCellValue());
			        case STRING:
			        	return cell.getStringCellValue();
			        case ERROR:
			        	return String.valueOf(cell.getErrorCellString());
				default:
					break;
			    }
			}
		default:
			return cell.getStringCellValue();
		}
	}

	@DataProvider(name = "loginData")
	public Object[][] getLoginDataCell() throws IOException {
		fis = new FileInputStream(new File(System.getProperty("user.dir") + "/config/ExcelDataForTesting.xlsx"));
		workbook = new XSSFWorkbook(fis);
		sheet = workbook.getSheetAt(0);
		int totalRows = sheet.getLastRowNum(); // get total number rows have data
		XSSFRow row = sheet.getRow(0);
		int totalColumns = row.getLastCellNum(); // get Total number of columns have data
		System.out.println("totalRows : " + totalRows + " & totalColumns : " + totalColumns);
		System.out.println("getPhysicalNumberOfRows() as given : "+sheet.getPhysicalNumberOfRows());
		Object[][] data = new Object[totalRows][totalColumns];
		// above line Object[Number of Rows as inputs ][number of Columns as input]
		for (int i = 0; i < totalRows ; i++) {
			row = sheet.getRow(i+1);
			for (int j = 0; j < totalColumns; j++) {
				XSSFCell cell = row.getCell(j);
				data[i][j] = getCellDataType(cell);
			}
		}
		return data;
	}
	
	
	@DataProvider(name = "poiformatedDate")
	public Object[][] getUserData() throws IOException {
		fis = new FileInputStream(new File(System.getProperty("user.dir") + "/config/ExcelDataForTesting.xlsx"));
		workbook = new XSSFWorkbook(fis);
		sheet = workbook.getSheetAt(0);
		int totalRows = sheet.getLastRowNum(); // get total number rows have data
		XSSFRow row = sheet.getRow(0);
		int totalColumns = row.getLastCellNum(); // get Total number of columns have data
		System.out.println("totalRows : " + totalRows + " & totalColumns : " + totalColumns);
		System.out.println("getPhysicalNumberOfRows() as given : "+sheet.getPhysicalNumberOfRows());
		XSSFFormulaEvaluator evaluator = new XSSFFormulaEvaluator(workbook);
		Object[][] data = new Object[totalRows][totalColumns];
		// above line Object[Number of Rows as inputs ][number of Columns as input]
		for (int i = 0; i < totalRows ; i++) {
			row = sheet.getRow(i+1);
			for (int j = 0; j < totalColumns; j++) {
				XSSFCell cell = row.getCell(j);
				//data[i][j] = dataFormatter.formatCellValue(cell); 
				//if don't have formula use above line
				data[i][j]=dataFormatter.formatCellValue(cell, evaluator);
			}
		}
		return data;
	}

	@Test(dataProvider = "poiformatedDate")
	public void dataTest(String user, String pass) {
		System.out.println(" : " + user + " : " + pass);
	}
	
	
	@Test(dataProvider = "loginData", enabled = false)
	public void loginTest(String user, String pass) {
		System.out.println(" : " + user + " : " + pass);
	}

}
