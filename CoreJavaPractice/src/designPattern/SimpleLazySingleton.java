package designPattern;

// TODO: Auto-generated Javadoc
/**
 * The Class SimpleLazySingleton.
 */
public class SimpleLazySingleton {

	/**
	 * Instantiates a new simple lazy singleton.
	 */
	private SimpleLazySingleton() {
		System.out.println("Singleton Object comming from Lazy Singleton class");
	}
	
	/** The instance. */
	private static volatile SimpleLazySingleton instance = null;
	
	/**
	 * Gets the single instance of SimpleLazySingleton.
	 *
	 * @return single instance of SimpleLazySingleton
	 */
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
