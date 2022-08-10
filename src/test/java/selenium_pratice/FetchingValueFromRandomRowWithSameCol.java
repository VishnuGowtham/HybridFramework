package selenium_pratice;

import java.io.FileInputStream;
import java.io.FileNotFoundException;

import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.ss.usermodel.WorkbookFactory;
import org.testng.annotations.Test;

public class FetchingValueFromRandomRowWithSameCol {

	@Test
	public void fetchexceldata() throws Throwable {

		FileInputStream fis = new FileInputStream("./src/test/resources/testData.xlsx");

		Workbook book = WorkbookFactory.create(fis);

		Sheet sheet = book.getSheet("Sheet3");

		int Rowcount = sheet.getLastRowNum();
		System.out.println("==================");

		System.out.println(Rowcount); // 9

		String expData = "TC_04";

		for (int i = 0; i < Rowcount; i++) {
			Row r = sheet.getRow(i);
			String firstcolData = r.getCell(0).getStringCellValue();
			if (firstcolData.equals(expData)) {

				String secondData = r.getCell(1).getStringCellValue();

				System.out.println(expData + " Available " + secondData);
				break;
			}
		}
	}

}