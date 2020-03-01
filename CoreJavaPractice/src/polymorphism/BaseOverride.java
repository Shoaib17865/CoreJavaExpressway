package polymorphism;

// TODO: Auto-generated Javadoc
/**
 * The Class BaseOverride.
 */
public class BaseOverride {

	/**
	 * M 1.
	 *
	 * @throws NullPointerException the null pointer exception
	 */
	public void m1()throws NullPointerException {
		// TODO Auto-generated method stub
		int a =20;
		System.out.println("Inside m1 method : "+a);
	}
	
	/**
	 * M 2.
	 *
	 * @param abc the abc
	 */
	public void m2(String abc) {
		// TODO Auto-generated method stub

	}
	
	/**
	 * M 3.
	 *
	 * @param abc the abc
	 * @return the string
	 */
	public String m3(String abc) {
		// TODO Auto-generated method stub
		return "shoaib";
	}
	
	/**
	 * M 4.
	 */
	public static void m4()
	{
		System.out.println("Inside static method m2 in BaseOverride class");
	}
}
