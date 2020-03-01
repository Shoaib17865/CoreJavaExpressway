package pack1;

import java.util.Locale;

// TODO: Auto-generated Javadoc
/**
 * The Class Demo1.
 */
public class Demo1 {

	/**
	 * Gets the country.
	 *
	 * @return the country
	 */
	private String getCountry() {
		
		Locale l1 = Locale.getDefault();
		String country = l1.getDisplayCountry();
		return country;
		
	}
	
	/**
	 * The main method.
	 *
	 * @param args the arguments
	 */
	public static void main(String[] args) {

		Demo1 demo1 = new Demo1();
		System.out.println("Current country : "+demo1.getCountry());
		Locale[] s = Locale.getAvailableLocales();
		for (Locale locale : s) {
			System.out.println(locale);
		}
	}
}