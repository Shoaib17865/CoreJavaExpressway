package designPattern;

import java.io.Serializable;

// TODO: Auto-generated Javadoc
/**
 * The Class SingletonCloneBreaking.
 */
public class SingletonCloneBreaking implements Cloneable,Serializable {

	
	/**
	 * Instantiates a new singleton clone breaking.
	 */
	private SingletonCloneBreaking() {
		System.out.println("Singleton Object comming from Lazy Singleton class");
	}
	
	/** The instance. */
	private static volatile SingletonCloneBreaking instance = null;
	
	/**
	 * Gets the single instance of SingletonCloneBreaking.
	 *
	 * @return single instance of SingletonCloneBreaking
	 */
	public static SingletonCloneBreaking getInstance()
	{
		if(instance == null) {
			synchronized (SimpleLazySingleton.class) {
			 if (instance == null) {
				instance = new SingletonCloneBreaking();
			}
			}
		}
		return instance;
	}
	
	/* (non-Javadoc)
	 * @see java.lang.Object#clone()
	 */
	@Override
	protected Object clone() throws CloneNotSupportedException {
		// TODO Auto-generated method stub
		//return super.clone();
		//throw new CloneNotSupportedException("You cannot Clone this Object as it is Singleton ");
		
		return instance;
	}
	
	/**
	 * Read resolve.
	 *
	 * @return the object
	 */
	protected Object readResolve() 
    { 
        return instance; 
    } 
}
