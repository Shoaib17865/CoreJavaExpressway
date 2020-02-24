package pack1;

public class FinalMethodClass {
	
	public FinalMethodClass() {
		// TODO Auto-generated constructor stub
		System.out.println("Constructor 1");
	}
	public FinalMethodClass(int a) {
		// TODO Auto-generated constructor stub
		System.out.println("Constructor 2");
	}
	
	public void property()
	{
		System.out.println("Take my property");
	}
	public void marriage()
	{
		System.out.println("Arrange Marriage");
	}
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
