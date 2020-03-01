package pack3;

// TODO: Auto-generated Javadoc
/**
 * The Class Child.
 */
public class Child extends Parent {

	/* (non-Javadoc)
	 * @see pack3.Parent#print()
	 */
	public void print() {
		// TODO Auto-generated method stub
		System.out.println("Child");
	}
	
	/* (non-Javadoc)
	 * @see pack3.Parent#abc()
	 */
	@Override
	public void abc() {
		// TODO Auto-generated method stub
		//super.abc();
		System.out.println("Overridden abc method");
	}
	
	/**
	 * The main method.
	 *
	 * @param args the arguments
	 */
	public static void main(String[] args) {
		Parent parent = new Child();
		Child parent1 = new SuperChild();
		parent.print();
		parent.abc();
	}
}
