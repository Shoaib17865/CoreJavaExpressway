package pack2;

import java.util.ArrayList;

// TODO: Auto-generated Javadoc
/**
 * The Class StringPractice.
 */
public class StringPractice {
	
	/**
	 * Map practice.
	 */
	public static void mapPractice() {
	
		Object ab = new Object();
		
		ArrayList arrayList = new ArrayList();
		arrayList.add(123);
		arrayList.add("shoaib");
		arrayList.add(new StringPractice());
		arrayList.add(123);
		
		for (Object object : arrayList) {
			System.out.println(object);
		}
		//System.out.println(arrayList.iterator().toString());
		
	}

	/**
	 * The main method.
	 *
	 * @param args the arguments
	 */
	public static void main(String[] args) {
		/*String a = "shoaib";
		String b = "shoaib";
		System.out.println(a.hashCode());
		System.out.println(b.hashCode());
		System.out.println(a+b);
		System.out.println((a+b).hashCode());
		System.out.println(a == b);
		System.out.println(a.equals(b));*/
		//StringPractice.mapPractice();
	}
}
