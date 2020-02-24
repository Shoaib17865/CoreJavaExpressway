package saticPractice;

public class SimpleStatic {

	final static String str = "asdf";
	static {
		System.out.println("Inside static block");
		String str = "Hi";
		str = "xyz";
	}
	
	public static void main(String[] args) {
		
		String str = "Abc";
		System.out.println(SimpleStatic.str);
	}
}
