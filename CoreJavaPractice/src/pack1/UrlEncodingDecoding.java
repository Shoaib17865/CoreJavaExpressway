package pack1;

import java.io.UnsupportedEncodingException;
import java.net.URLDecoder;
import java.net.URLEncoder;
import static java.lang.System.*;

// TODO: Auto-generated Javadoc
/**
 * The Class UrlEncodingDecoding.
 */
public class UrlEncodingDecoding {
	
	/**
	 * Decode.
	 *
	 * @param url the url
	 * @return the string
	 */
	public static String decode(String url) {
		// TODO Auto-generated method stub
        try {  
            String prevURL="";  
            String decodeURL=url;  
            while(!prevURL.equals(decodeURL))  
            {  
                 prevURL=decodeURL;  
                 decodeURL=URLDecoder.decode( decodeURL, "UTF-8" );  
            }  
            return decodeURL;  
       } catch (UnsupportedEncodingException e) {  
            return "Issue while decoding" +e.getMessage();  
       }  
        

	}
	
	/**
	 * Encode.
	 *
	 * @param url the url
	 * @return the string
	 */
	public static String encode(String url)  
    {  
              try {  
                   String encodeURL=URLEncoder.encode( url, "UTF-8" );  
                   return encodeURL;  
              } catch (UnsupportedEncodingException e) {  
                   return "Issue while encoding" +e.getMessage();  
              }  
    }  
	
	/**
	 * Prints the value.
	 */
	public static void printValue() {
		
		for (int i = 0; i <= i+10; i++) {
			out.println(i);
			//System.out.println("hello");
		}
		

	}

	/**
	 * The main method.
	 *
	 * @param args the arguments
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		 /*String url="https%3A%2F%2Fwww.geeksforgeeks.org%2Fjava-net-urlencoder-class-java%2F";  
         String url2="https://www.geeksforgeeks.org/java-net-urlencoder-class-java/";  
         String decodeURL = decode(url);  
         System.out.println("Decoded URL: "+decodeURL);  
         String encodeURL = encode(url2);  
         System.out.println("Encoded URL2: "+encodeURL);*/  
         //printValue();

	}

}
