package designPattern;

import java.io.Serializable;

public class SingletonCloneBreaking implements Cloneable,Serializable {

	
	private SingletonCloneBreaking() {
		System.out.println("Singleton Object comming from Lazy Singleton class");
	}
	private static volatile SingletonCloneBreaking instance = null;
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
	
	@Override
	protected Object clone() throws CloneNotSupportedException {
		// TODO Auto-generated method stub
		//return super.clone();
		//throw new CloneNotSupportedException("You cannot Clone this Object as it is Singleton ");
		
		return instance;
	}
	
	protected Object readResolve() 
    { 
        return instance; 
    } 
}
