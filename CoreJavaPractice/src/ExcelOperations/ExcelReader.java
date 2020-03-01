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
		
		sheet = file.getWorkbookInstance(FILE_PATH).getSheetAt(0);
		System.out.println("\n\nIterating over Rows and Columns using for-each loop\n");
        for (Row row: sheet) {
            for(Cell cell: row) {
                String cellValue = dataFormatter.formatCellValue(cell);
                System.out.print(cellValue + "\t");
            }
            System.out.println();
        }
        file.getWorkbookInstance(FILE_PATH).close();
	}
}