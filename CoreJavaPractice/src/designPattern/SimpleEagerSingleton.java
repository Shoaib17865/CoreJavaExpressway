package designPattern;

// TODO: Auto-generated Javadoc
/**
 * The Class SimpleEagerSingleton.
 */
public class SimpleEagerSingleton {

	/**
	 * Instantiates a new simple eager singleton.
	 */
	private SimpleEagerSingleton() {
		System.out.println("Singleton Object comming from Eager Singleton class");
	}
	
	/** The Constant INSTANCE. */
	private static final SimpleEagerSingleton INSTANCE = new SimpleEagerSingleton();
	
	/**
	 * Gets the single instance of SimpleEagerSingleton.
	 *
	 * @return single instance of SimpleEagerSingleton
	 */
	public static SimpleEagerSingleton getInstance()
	{
		return INSTANCE;
	}
}
