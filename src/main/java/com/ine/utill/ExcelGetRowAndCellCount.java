package com.ine.utill;

import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;

import org.apache.poi.xssf.usermodel.XSSFRow;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class ExcelGetRowAndCellCount {
	static FileInputStream fis;
	static XSSFWorkbook workbook;
	static XSSFSheet sheet;
	

	public static void getRowCount() {
		try {
			fis = new FileInputStream(new File(System.getProperty("user.dir") + "/config/ExcelDataForTesting.xlsx"));
			workbook = new XSSFWorkbook(fis);
			sheet = workbook.getSheetAt(0);
			int actual = sheet.getPhysicalNumberOfRows();
			int total = sheet.getLastRowNum();
			System.out.println("By getPhysicalNumberOfRows : " + actual);
			System.out.println("By getLastRowNum : " + total);
		} catch (IOException e) {
			e.printStackTrace();
		} finally {
			try {
				workbook.close();
				fis.close();
			} catch (IOException e) {
				e.printStackTrace();
			}
		}
	}

	public static void getCellCount() {
		try {
			fis = new FileInputStream(new File(System.getProperty("user.dir") + "/config/ExcelDataForTesting.xlsx"));
			workbook = new XSSFWorkbook(fis);
			sheet = workbook.getSheetAt(0);
			XSSFRow row = sheet.getRow(0);
			int physicalCell = row.getPhysicalNumberOfCells();
			System.out.println("cellCount : " + physicalCell);
		} catch (IOException e) {
			e.printStackTrace();
		}
	}
	

	public static void main(String[] args) {
		getRowCount();
		getCellCount();
	}
}
