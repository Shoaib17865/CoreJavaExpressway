package saticPractice;

// TODO: Auto-generated Javadoc
/**
 * The Class SimpleStatic.
 */
public class SimpleStatic {

	/** The Constant str. */
	final static String str = "asdf";
	static {
		System.out.println("Inside static block");
		String str = "Hi";
		str = "xyz";
	}
	
	/**
	 * The main method.
	 *
	 * @param args the arguments
	 */
	public static void main(String[] args) {
		
		String str = "Abc";
		System.out.println(SimpleStatic.str);
	}
}
