package pack3;

// TODO: Auto-generated Javadoc
/**
 * The Class DataTypesPractice.
 */
public class DataTypesPractice {
	
	/**
	 * Instantiates a new data types practice.
	 *
	 * @param a the a
	 */
	private DataTypesPractice(int a)
	 {}

	/**
	 * The main method.
	 *
	 * @param args the arguments
	 */
	public static void main(String[] args) {
		byte a = 15;
		byte b = 10;
		System.out.println(a+b);
		System.out.println("a "+a);
		System.out.println("b "+b);
		System.out.println("----------sds---------");
		System.out.println(a+=b);
		System.out.println("a "+a);
		System.out.println("b "+b);
		System.out.println("-------------------");
		System.out.println(a-=b);
		System.out.println("a "+a);
		System.out.println("b "+b);
		System.out.println("-------------------");
		System.out.println(a+=b);
		System.out.println("a "+a);
		System.out.println("b "+b);
		int intNum = 0b000000000000000000000000000001111;
		 
		try {
			//System.out.println(Class.forName("String").getName());
			Class cls =Class.forName("DataTypesPractice");
			DataTypesPractice dataTypesPractice = (DataTypesPractice) cls.newInstance();
			System.out.println(dataTypesPractice.getClass().getName());
		}
		catch (Exception e) {
			System.out.println("In catch block");
			e.printStackTrace();
		}
		finally {
			// TODO: handle finally clause
			System.out.println("finally executed");
		}
		
	}
}
