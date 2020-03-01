package exceptionPack;

// TODO: Auto-generated Javadoc
/**
 * The Class SampleProgramme.
 */
public class SampleProgramme {

	/**
	 * The main method.
	 *
	 * @param args the arguments
	 */
	public static void main(String[] args) {

		int age = 61;
		if (age>60) {
			throw new CustomException("TO young");
		} else {

			System.out.println("Success");
		}
	}
}
