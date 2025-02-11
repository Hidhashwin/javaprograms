package javacollections;

import java.util.Set;
import java.util.TreeSet;

public class Treesetsample {
	
	public void tree() {
		TreeSet<String> treeset=new TreeSet<String>();
		
		treeset.add("GG");
		treeset.add("BB");
		treeset.add("RR");
		treeset.add("II");
		
		System.out.println(treeset);
		System.out.println(treeset.contains("RR"));
		System.out.println(treeset.floor("Hi"));
	}

	public static void main(String[] args) {
		Treesetsample sam=new Treesetsample();
		sam.tree();
				

	}

}
