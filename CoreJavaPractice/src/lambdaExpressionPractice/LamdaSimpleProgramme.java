package lambdaExpressionPractice;

// TODO: Auto-generated Javadoc
/**
 * The Class LamdaSimpleProgramme.
 */
public class LamdaSimpleProgramme {

	/**
	 * M 1.
	 */
	private void m1() {
		// TODO Auto-generated method stub
		System.out.println("Hello");
	}

	/**
	 * The main method.
	 *
	 * @param args the arguments
	 */
	//int a = (n) -> {return n*n;}
	public static void main(String[] args) {
		
		FunctionalIntraf intraf = (a,b)-> System.out.println("The sum is : "+(a+b));
		intraf.add(10,20);
		intraf.defaultMethod(10,20);
		FunctionalIntraf.staticMethod(10,20);
	}
}
