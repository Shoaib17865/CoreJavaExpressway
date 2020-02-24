package collectionPractice;

import java.util.Collections;
import java.util.TreeSet;

public class TreeSetOperations {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		TreeSet set = new TreeSet<>();
		Collections.reverseOrder();
		set.add(2);
		set.add(1);
		set.add(1);
		set.add(6);
		set.add(9);
		set.add(5);
		//set.add(null);
		/*set.add("shoaib");
		set.add(1);*/
		Collections.synchronizedSet(set);
		//how to get same output as i have inserted
		System.out.println(set);//
		

	}

}
