package javacollections;

import java.util.LinkedList;
import java.util.List;

public class linkedlistsample {
	
	public void linkedlisttest() {
		
		List<Integer> linkedlist=new LinkedList<Integer>();
		linkedlist.add(2);
		linkedlist.add(3);
		linkedlist.add(4);
		linkedlist.add(5);
		linkedlist.add(5);
		
		System.out.println(linkedlist);
		System.out.println(linkedlist.get(0));
		System.out.println(linkedlist.removeAll(linkedlist));
		
	}

	public static void main(String[] args) {
		linkedlistsample sam=new linkedlistsample();
		sam.linkedlisttest();

	}

}
