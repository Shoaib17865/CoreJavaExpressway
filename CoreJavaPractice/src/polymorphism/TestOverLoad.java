package polymorphism;

// TODO: Auto-generated Javadoc
/**
 * The Class TestOverLoad.
 */
public class TestOverLoad {

	/**
	 * M 1.
	 */
	public void m1() {
		// TODO Auto-generated method stub
		System.out.println("Inside m1() of 0 parameters");
	}
	
	/*public void m1(int a)
	{
		System.out.println("Inside m1() of int parameters");
	}*/
	
	/*public void m1(Integer a)
	{
		System.out.println("Inside m1() of Integer parameters");
	}*/
	
	/**
	 * M 1.
	 *
	 * @param a the a
	 */
	public void m1(Object a)
	{
		System.out.println("Inside m1() of Object parameters");
	}
	
	/**
	 * The main method.
	 *
	 * @param args the arguments
	 */
	public static void main(String[] args) {
		
		TestOverLoad load = new TestOverLoad();
		load.m1();
		load.m1(1);
		
		String a= "shoaib";
		String b = new String("sho  123aib");
		System.out.println(b.substring(2).hashCode());
		System.out.println(b.trim());
		System.out.println(a.hashCode());
		System.out.println(b.hashCode());
		System.out.println(a.equals(b));
	}
}
