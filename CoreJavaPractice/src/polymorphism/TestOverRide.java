package polymorphism;

/**
 * @author Shoaib Ali
 *
 */
public class TestOverRide extends BaseOverride {
	
	@Override
	public void m1() throws NullPointerException,RuntimeException {
		// TODO Auto-generated method stub
		//System.out.println("Inside overridden m1 method but before super");
		//super.m1();
		int a= 2;
		System.out.println("Inside overridden m1 method : "+a);
	}
	
	@Override
	public void m2(String abc) {
		// TODO Auto-generated method stub
		super.m2(abc);
	}
	
	@Override
	public String m3(String abc) {
		// TODO Auto-generated method stub
		return super.m3(abc);
	}
	public static void m4()
	{
		System.out.println("Inside static method m2 in TestOverride class");
	}
	public static void main(String[] args) {
		
		TestOverRide overRide = new TestOverRide();
		overRide.m1();
		System.out.println();
		TestOverRide.m4();
	}
}
