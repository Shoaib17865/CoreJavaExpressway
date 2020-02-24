package designPattern;

public class SimpleLazySingleton {

	private SimpleLazySingleton() {
		System.out.println("Singleton Object comming from Lazy Singleton class");
	}
	private static volatile SimpleLazySingleton instance = null;
	public static SimpleLazySingleton getInstance()
	{
		if(instance == null) {
			synchronized (SimpleLazySingleton.class) {
			 if (instance == null) {
				instance = new SimpleLazySingleton();
			}
			}
		}
		return instance;
	}
}
