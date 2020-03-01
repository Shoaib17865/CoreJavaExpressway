package dataStructures;

// TODO: Auto-generated Javadoc
/**
 * The Class RecursionFactorial.
 */
public class RecursionFactorial {

	/**
	 * Gets the factorial recursive.
	 *
	 * @param n the n
	 * @return the factorial recursive
	 * @throws NullPointerException the null pointer exception
	 */
	private static int getFactorialRecursive(int n) throws NullPointerException {
		if (n == 0) {
			return 1;
		} else {
			return (n * getFactorialRecursive(n - 1));
		}
	}

	/**
	 * The main method.
	 *
	 * @param args the arguments
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int fact = 1;
		int number = 2;// It is the number to calculate factorial
		fact = getFactorialRecursive(number);
		System.out
				.println("Factorial of " + number + " is : " + fact + " which is calculated through recursive method.");
	}

}
