package com.crm.genericutility;

import java.io.FileInputStream;

import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.ss.usermodel.WorkbookFactory;

/**
 * 
 * @author Vishnu
 *
 */

public class ExcelUtility {
	
	/**
	 * its used read the data from excel based on below arguments 
	 * @param sheetname
	 * @param rownum
	 * @param cellnum
	 * @return
	 * @throws Throwable
	 */
	
	public String getDataFromExcel(String sheetname, int rownum, int cellnum) throws Throwable {
		FileInputStream fileInputStream = new FileInputStream(IPathConstants.EXCEL_PATH);
		Workbook book = WorkbookFactory.create(fileInputStream);
		Cell cell = book.getSheet(sheetname).getRow(rownum).getCell(cellnum);
		String value = cell.getStringCellValue();
		book.close();
		return value;
	}
	
	public void Rowcount() {}
	
	
	
}
