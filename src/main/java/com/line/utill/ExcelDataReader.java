package com.line.utill;

import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.text.SimpleDateFormat;

import org.apache.poi.ss.usermodel.CellType;
import org.apache.poi.ss.usermodel.DateUtil;
import org.apache.poi.xssf.usermodel.XSSFCell;
import org.apache.poi.xssf.usermodel.XSSFRow;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class ExcelDataReader {
	static FileInputStream fis;
	static XSSFWorkbook workbook;
	static XSSFSheet sheet;


	public static void getCellData(Boolean isSheetTableHaveHeader) {
		try {
			fis = new FileInputStream(new File(System.getProperty("user.dir") + "/config/ExcelDataForTesting.xlsx"));
			workbook = new XSSFWorkbook(fis);
			sheet = workbook.getSheetAt(0);
			int totalRows = sheet.getPhysicalNumberOfRows();
			int heardsData = 0;
			if (isSheetTableHaveHeader == true) {
				heardsData = 1;
			}
			for (int i = heardsData; i < totalRows; i++) {
				XSSFRow row = sheet.getRow(i);
				int totalColumns = row.getPhysicalNumberOfCells();
				for (int j = 0; j < totalColumns; j++) {
					XSSFCell cell = row.getCell(j);
					String cellData = getCellDataType(cell);
					System.out.print(" |" + cellData);
				}
				System.out.println();
			}

		} catch (IOException e) {
			e.printStackTrace();
		}
	}

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

	public static void main(String[] args) {
		// getCellDataOnlyIfStringType();
		getCellData(true);
	}
}
