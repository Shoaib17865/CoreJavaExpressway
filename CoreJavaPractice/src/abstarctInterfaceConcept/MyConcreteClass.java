package abstarctInterfaceConcept;

public class MyConcreteClass extends MyAbstractClass {

	public static void main(String[] args) {
		
		MyConcreteClass class1 = new MyConcreteClass();
		class1.printInternalMsg();
	}
	public MyConcreteClass() {
		super();
		System.out.println("THis is MyConcreteClass");
	}
	@Override
	public void abc() {
		// TODO Auto-generated method stub
		
	}
}
