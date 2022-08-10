package selenium_pratice;

import java.io.FileInputStream;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.ss.usermodel.WorkbookFactory;

public class GetDataFromExcel {

	public static void main(String[] args) throws Exception {

		String loc = "Udumalpet";
		FileInputStream fis = new FileInputStream("./src/test/resources/testData.xlsx");

		Workbook wb = WorkbookFactory.create(fis);

		Sheet sheet = wb.getSheet("UserData");

		int rowcount = sheet.getLastRowNum() + 1;

		int columncount = sheet.getRow(0).getLastCellNum();

		System.out.println("Rows :" + rowcount);
		System.out.println("columns :" + columncount);

		try {
			for (int i = 0; i < rowcount; i++) {

				if (sheet.getRow(i).getCell(2).getStringCellValue().contains(loc)) {

					String data = sheet.getRow(i).getCell(2).getStringCellValue();
					System.out.println(data);
				}
			}

		} catch (Exception e) {
			e.getMessage();
		}

	}
}
