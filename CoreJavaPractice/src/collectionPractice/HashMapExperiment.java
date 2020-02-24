package collectionPractice;

import java.util.HashMap;
import java.util.Map;

public class HashMapExperiment{
	public static long factorial(int n)
	{
		if(n==1) return 1;
		return n*factorial(n-1);
	}
	 String test;
	 
	 
	public static void main(String[] args) {
		foo(null);
		System.out.println("---------------");
		//System.out.println(">>"+test+"<<");
		HashMap<Integer, String> map = new HashMap<>();
		map.put(1, "shoaib");
		map.put(2, "bob");
		System.out.println(map);
		Map<String, Integer> hashMap = new HashMap<>();
		hashMap.put(null, 11);
		hashMap.put(null, 12);
		hashMap.put(null, 13);
		hashMap.put(null, 14);
		hashMap.put("shoaib", 100);
		hashMap.put("rahul", 101);
		hashMap.put("javed", 102);
		hashMap.put("mumtaz", 103);
		hashMap.put("shoaib", 104);
		foo(null);
		//printing whole map
		//System.out.println("Initial map is - "+" "+hashMap.get("shoaib"));
		
		// java 8 technique of getting key
		/*for(Map.Entry<String, Integer> entry : hashMap.entrySet())
		{
			String k = entry.getKey();
			Integer v = entry.getValue();
		}
		
		hashMap.forEach((k,v)->{
			if(k=="shoaib")
			System.out.println("Key : "+k+" , Value : "+v);
		});*/
		
		for(Map.Entry<String, Integer> entry : hashMap.entrySet())
		{
			/*String k = entry.getKey();
			Integer v = entry.getValue();*/
			System.out.println(entry.getKey());
			System.out.println(entry.getValue());
		}
		System.out.println(factorial(5));
		System.out.println(new String("hello").equals("hello"));
		System.out.println(new String("Hello")== new String("Hello"));
	}
	public static void foo(Object o) {
		System.out.println("Object impl");
	}
	public static void foo(String s) {
		System.out.println("String impl");
	}
	public static void foo(int s) {
		System.out.println("Int impl");
	}
}