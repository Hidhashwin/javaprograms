package javacollections;

import java.util.HashSet;
import java.util.Set;

public class Hashsetsample {

	public void hashtest() {
		
		Set<String> hashset=new HashSet<String>();
		hashset.add("Mango");
		hashset.add("apple");
		hashset.add("orange");
		hashset.add("pineapple");
		hashset.add("pineapple");
		hashset.add(null);
		System.out.println(hashset);
		
		//System.out.println(hashset.isEmpty());
		
		Set<String> anotherhashset=new HashSet<String>();
		
		System.out.println(anotherhashset.size());
		
				System.out.println(hashset.remove("Mango"));
	}

	public static void main(String[] args) {

		Hashsetsample se = new Hashsetsample();
		se.hashtest();
	}

}
