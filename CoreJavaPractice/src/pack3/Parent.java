package pack3;

public class Parent {

	public void abc() {
		// TODO Auto-generated method stub
		System.out.println("Parent abc method");
	}
	public void print() {
		// TODO Auto-generated method stub
		System.out.println("Parent");
	}
	public static void main(String[] args) {
		Parent parent = new Parent();
		Parent parent2 = new Child();
		parent.print();
		parent2.print();
	}
}
