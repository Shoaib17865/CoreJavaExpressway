package lambdaExpressionPractice;

// TODO: Auto-generated Javadoc
/**
 * The Interface FunctionalIntraf.
 */
@FunctionalInterface
public interface FunctionalIntraf {
	
	/**
	 * Adds the.
	 *
	 * @param a the a
	 * @param b the b
	 */
	/*
	 * public abstract void m1(); //public void m2();
	 */
	public void add(int a, int b);

	/**
	 * Default method.
	 *
	 * @param a the a
	 * @param b the b
	 */
	public default void defaultMethod(int a, int b) {

		System.out.println("Inside defaultMethod(int a, int b)");
	}
	
	/**
	 * Static method.
	 *
	 * @param a the a
	 * @param b the b
	 */
	public static void staticMethod(int a, int b) {

		System.out.println("Inside staticMethod(int a, int b)");
	}
}
