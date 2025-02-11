package javacollections;

import java.util.ArrayList;
import java.util.List;

public class arraylistsample {
	
	public void arrylistexam() {
		
		//Arraylist will allow duplicate values
		//It will maintain insertion order
		//Null insertion is possible
		
		List<String> arraylist=new ArrayList<String>();
		arraylist.add("Benz");
		arraylist.add("Tata");
		arraylist.add("Suzuki");
		arraylist.add("Honda");
		arraylist.add("Benz");
		
		System.out.println(arraylist);
		System.out.println(arraylist.get(0));
		System.out.println(arraylist.indexOf("Benz"));
		System.out.println(arraylist);
		
		List<String> anotherlist=new ArrayList<String>();
		anotherlist.addAll(arraylist);
		System.out.println(anotherlist);
		
		anotherlist.clear();
		System.out.println(anotherlist);
		arraylist.remove(0);
		System.out.println(arraylist);
		arraylist.remove("Benz");
		System.out.println(arraylist);
		arraylist.add(null);
		System.out.println(arraylist);
		System.out.println(arraylist.isEmpty());
		
	}

	public static void main(String[] args) {
		arraylistsample sample=new arraylistsample();
		sample.arrylistexam();

	}

}
