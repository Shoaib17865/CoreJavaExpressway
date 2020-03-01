package pack3;

// TODO: Auto-generated Javadoc
/**
 * The Class Parent.
 */
public class Parent {

	/**
	 * Abc.
	 */
	public void abc() {
		// TODO Auto-generated method stub
		System.out.println("Parent abc method");
	}
	
	/**
	 * Prints the.
	 */
	public void print() {
		// TODO Auto-generated method stub
		System.out.println("Parent");
	}
	
	/**
	 * The main method.
	 *
	 * @param args the arguments
	 */
	public static void main(String[] args) {
		Parent parent = new Parent();
		Parent parent2 = new Child();
		parent.print();
		parent2.print();
	}
}
