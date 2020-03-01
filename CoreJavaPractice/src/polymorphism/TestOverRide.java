package polymorphism;

// TODO: Auto-generated Javadoc
/**
 * The Class TestOverRide.
 *
 * @author Shoaib Ali
 */
public class TestOverRide extends BaseOverride {
	
	/* (non-Javadoc)
	 * @see polymorphism.BaseOverride#m1()
	 */
	@Override
	public void m1() throws NullPointerException,RuntimeException {
		// TODO Auto-generated method stub
		//System.out.println("Inside overridden m1 method but before super");
		//super.m1();
		int a= 2;
		System.out.println("Inside overridden m1 method : "+a);
	}
	
	/* (non-Javadoc)
	 * @see polymorphism.BaseOverride#m2(java.lang.String)
	 */
	@Override
	public void m2(String abc) {
		// TODO Auto-generated method stub
		super.m2(abc);
	}
	
	/* (non-Javadoc)
	 * @see polymorphism.BaseOverride#m3(java.lang.String)
	 */
	@Override
	public String m3(String abc) {
		// TODO Auto-generated method stub
		return super.m3(abc);
	}
	
	/**
	 * M 4.
	 */
	public static void m4()
	{
		System.out.println("Inside static method m2 in TestOverride class");
	}
	
	/**
	 * The main method.
	 *
	 * @param args the arguments
	 */
	public static void main(String[] args) {
		
		TestOverRide overRide = new TestOverRide();
		overRide.m1();
		System.out.println();
		TestOverRide.m4();
	}
}
