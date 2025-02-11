package javacollections;

import java.util.LinkedHashSet;
import java.util.Set;

public class Linkedhashsetsample {
	
	public void linkedhash() {
		Set linked=new LinkedHashSet();
		linked.add("A");
		linked.add("1");
		linked.add("5");
		linked.add("C");
		
		System.out.println(linked);
		System.out.println(linked.size());
	}

	public static void main(String[] args) {
		
		Linkedhashsetsample sd=new Linkedhashsetsample();
		sd.linkedhash();
	}

}
