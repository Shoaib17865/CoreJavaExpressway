package pack1;

// TODO: Auto-generated Javadoc
/**
 * The Class FinalMethodClass.
 */
public class FinalMethodClass {
	
	/**
	 * Instantiates a new final method class.
	 */
	public FinalMethodClass() {
		// TODO Auto-generated constructor stub
		System.out.println("Constructor 1");
	}
	
	/**
	 * Instantiates a new final method class.
	 *
	 * @param a the a
	 */
	public FinalMethodClass(int a) {
		// TODO Auto-generated constructor stub
		System.out.println("Constructor 2");
	}
	
	/**
	 * Property.
	 */
	public void property()
	{
		System.out.println("Take my property");
	}
	
	/**
	 * Marriage.
	 */
	public void marriage()
	{
		System.out.println("Arrange Marriage");
	}
	
	/**
	 * The main method.
	 *
	 * @param args the arguments
	 */
	public static void main(String[] args) {
		System.out.println("hello world");
	}
}

class FinalOverridenClass extends FinalMethodClass
{
	@Override
	public void marriage() {
		// TODO Auto-generated method stub
		//super.marriage();
		super.marriage();
		System.out.println("love marriage");
	}
	public static void main(String[] args) {
		
		System.out.println("Start");
		FinalMethodClass finalOverridenClass = new FinalOverridenClass();
		finalOverridenClass.property();
		finalOverridenClass.marriage();
		System.out.println("End");
	}
	}
