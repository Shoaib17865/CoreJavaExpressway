package designPattern;

// TODO: Auto-generated Javadoc
/**
 * The Class ClientCheck.
 */
public class ClientCheck {

	/**
	 * The main method.
	 *
	 * @param args the arguments
	 * @throws CloneNotSupportedException the clone not supported exception
	 */
	public static void main(String[] args)throws CloneNotSupportedException {
		
		SimpleEagerSingleton singleton = SimpleEagerSingleton.getInstance();
		SimpleEagerSingleton singleton2 = SimpleEagerSingleton.getInstance();
		System.out.println(singleton == singleton2);
		
		SimpleLazySingleton lazySingleton = SimpleLazySingleton.getInstance();
		SimpleLazySingleton lazySingleton2 = SimpleLazySingleton.getInstance();
		System.out.println(lazySingleton == lazySingleton2);
		
		SingletonCloneBreaking lazyCloneSingleton = SingletonCloneBreaking.getInstance();
		SingletonCloneBreaking lazyCloneSingleton2 = SingletonCloneBreaking.getInstance();
		System.out.println(lazyCloneSingleton);
		System.out.println(lazyCloneSingleton2);
		System.out.println(lazyCloneSingleton.clone() == lazyCloneSingleton2.clone());
		System.out.println(lazyCloneSingleton.clone());
		System.out.println(lazyCloneSingleton2.clone());
		System.out.println();
		
	}
}
