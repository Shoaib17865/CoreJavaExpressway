package ExcelOperations;

import java.io.IOException;

import org.apache.poi.EncryptedDocumentException;
import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.DataFormatter;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;

// TODO: Auto-generated Javadoc
/**
 * The Class ExcelReader.
 */
public class ExcelReader {

	/** The Constant FILE_PATH. */
	private static final String FILE_PATH = "D:/DemoExcel.xlsx";
	private static final String SHEET_NAME = "Sheet1";
	
	/** The sheet. */
	private static Sheet sheet;
	
	/** The data formatter. */
	static DataFormatter dataFormatter = new DataFormatter();
	
	/** The file. */
	static ReadingExcelFile file = ReadingExcelFile.getInstance();
	
	/**
	 * The main method.
	 *
	 * @param args the arguments
	 * @throws EncryptedDocumentException the encrypted document exception
	 * @throws IOException Signals that an I/O exception has occurred.
	 */
	public static void main(String[] args) throws EncryptedDocumentException, IOException {

		System.out.println("This workbook has " + file.getWorkbookInstance(FILE_PATH).getNumberOfSheets()
				+ " sheet with name : " + file.getWorkbookInstance(FILE_PATH).getSheetName(0));
		file.getInstance().getAllExcelData(FILE_PATH,SHEET_NAME);
        
        /*for (Row row : sheet) { // For each Row.
            Cell cell = row.getCell(0); // Get the Cell at the Index / Column you want.
            System.out.println(cell.getStringCellValue());
        }*/
        
        //file.getWorkbookInstance(FILE_PATH).close();
	}
}