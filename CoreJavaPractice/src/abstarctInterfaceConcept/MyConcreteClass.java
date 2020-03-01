package abstarctInterfaceConcept;

// TODO: Auto-generated Javadoc
/**
 * The Class MyConcreteClass.
 */
public class MyConcreteClass extends MyAbstractClass {

	/**
	 * The main method.
	 *
	 * @param args the arguments
	 */
	public static void main(String[] args) {
		
		MyConcreteClass class1 = new MyConcreteClass();
		class1.printInternalMsg();
	}
	
	/**
	 * Instantiates a new my concrete class.
	 */
	public MyConcreteClass() {
		super();
		System.out.println("THis is MyConcreteClass");
	}
	
	/* (non-Javadoc)
	 * @see abstarctInterfaceConcept.MyAbstractClass#abc()
	 */
	@Override
	public void abc() {
		// TODO Auto-generated method stub
		
	}
}
