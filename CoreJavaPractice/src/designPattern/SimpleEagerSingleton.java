package designPattern;

public class SimpleEagerSingleton {

	private SimpleEagerSingleton() {
		System.out.println("Singleton Object comming from Eager Singleton class");
	}
	
	private static final SimpleEagerSingleton INSTANCE = new SimpleEagerSingleton();
	
	public static SimpleEagerSingleton getInstance()
	{
		return INSTANCE;
	}
}
