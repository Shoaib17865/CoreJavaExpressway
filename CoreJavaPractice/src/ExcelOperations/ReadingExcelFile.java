package ExcelOperations;

import java.io.File;
import java.io.IOException;
import java.io.Serializable;

import org.apache.poi.EncryptedDocumentException;
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
