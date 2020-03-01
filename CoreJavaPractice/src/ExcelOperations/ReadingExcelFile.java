package ExcelOperations;

import java.io.File;
import java.io.IOException;
import java.io.Serializable;

import org.apache.poi.EncryptedDocumentException;
import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.DataFormatter;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.ss.usermodel.WorkbookFactory;

import designPattern.SimpleLazySingleton;

// TODO: Auto-generated Javadoc
/**
 * The Class ReadingExcelFile.
 */
@SuppressWarnings("serial")
public class ReadingExcelFile extends WorkbookFactory implements Cloneable,Serializable {

	/**
	 * Instantiates a new reading excel file.
	 */
	private ReadingExcelFile() {
	}
	
	/** The instance. */
	private static volatile ReadingExcelFile instance = null;
	
	/** The sheet. */
	private static Sheet sheet;
	
	/** The data formatter. */
	DataFormatter dataFormatter = new DataFormatter();

	/**
	 * Gets the workbook instance.
	 *
	 * @param fileName the file name
	 * @return the workbook instance
	 * @throws EncryptedDocumentException the encrypted document exception
	 * @throws IOException Signals that an I/O exception has occurred.
	 */
	public Workbook getWorkbookInstance(String fileName) throws EncryptedDocumentException, IOException {
		// TODO Auto-generated constructor stub
		Workbook workbook = ReadingExcelFile.create(new File(fileName));
		return workbook;
	}
	
	public void getAllExcelData(String fileName,String sheetName) throws EncryptedDocumentException, IOException{

		/** The file. */
		ReadingExcelFile file = ReadingExcelFile.getInstance();

			sheet = file.getWorkbookInstance(fileName).getSheet(sheetName);
			if (sheet!=null) {
				System.out.println("\n\nIterating over Rows and Columns using for-each loop\n");
				// getting whole excel sheet
				for (Row row : sheet) {
					for (Cell cell : row) {
						String cellValue = dataFormatter.formatCellValue(cell);
						System.out.print(cellValue + "\t");
					}
					System.out.println();
				}
				file.getWorkbookInstance(fileName).close();
			}else
			{
				System.out.println("No Sheet Found");
				file.getWorkbookInstance(fileName).close();
			}
		
		
		
	}
	
	/**
	 * Gets the single instance of ReadingExcelFile.
	 *
	 * @return single instance of ReadingExcelFile
	 */
	public static ReadingExcelFile getInstance()
	{
		if(instance == null) {
			synchronized (SimpleLazySingleton.class) {
			 if (instance == null) {
				instance = new ReadingExcelFile();
			}
			}
		}
		return instance;
	}
	
	/* (non-Javadoc)
	 * @see java.lang.Object#clone()
	 */
	@Override
	protected Object clone() throws CloneNotSupportedException {
		// TODO Auto-generated method stub
		//return super.clone();
		return instance;
	}
	
	/**
	 * Read resolve.
	 *
	 * @return the object
	 */
	protected Object readResolve() 
    { 
        return instance; 
    } 
}
