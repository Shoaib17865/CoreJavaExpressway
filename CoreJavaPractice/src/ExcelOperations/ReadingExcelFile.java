package ExcelOperations;

import java.io.File;
import java.io.IOException;

import org.apache.poi.EncryptedDocumentException;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.ss.usermodel.WorkbookFactory;

public class ReadingExcelFile {

	private static final String FILE_PATH = "D:/DemoExcel.xlsx";

	public static void main(String[] args) throws EncryptedDocumentException, IOException {

		Workbook workbook = WorkbookFactory.create(new File(FILE_PATH));
		System.out.println(
				"This workbook has " + workbook.getNumberOfSheets() + " sheet with name : " + workbook.getSheetName(0));

	}
}
