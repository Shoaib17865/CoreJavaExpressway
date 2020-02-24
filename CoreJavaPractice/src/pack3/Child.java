package pack3;

public class Child extends Parent {

	public void print() {
		// TODO Auto-generated method stub
		System.out.println("Child");
	}
	@Override
	public void abc() {
		// TODO Auto-generated method stub
		//super.abc();
		System.out.println("Overridden abc method");
	}
	public static void main(String[] args) {
		Parent parent = new Child();
		Child parent1 = new SuperChild();
		parent.print();
		parent.abc();
	}
}
