package polymorphism;

public class TestOverLoad {

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
	
	public void m1(Object a)
	{
		System.out.println("Inside m1() of Object parameters");
	}
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
