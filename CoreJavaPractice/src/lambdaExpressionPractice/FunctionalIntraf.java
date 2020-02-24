package lambdaExpressionPractice;

@FunctionalInterface
public interface FunctionalIntraf {
	/*
	 * public abstract void m1(); //public void m2();
	 */
	public void add(int a, int b);

	public default void defaultMethod(int a, int b) {

		System.out.println("Inside defaultMethod(int a, int b)");
	}
	
	public static void staticMethod(int a, int b) {

		System.out.println("Inside staticMethod(int a, int b)");
	}
}
