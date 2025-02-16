package javaprogramsimple;

import java.util.HashSet;

public class duplicateelementinarray {

	public static void main(String[] args) {
		String arr[] = { "java", "python", "c", "c++",  };

		HashSet<String> langs=new HashSet<String>();
		boolean flag=false;
		for(String q:arr) {
			if(langs.add(q)==false) {
				System.out.println("duplicate element found..... " +q);
				flag=true;
			}
			
			}
		if (!flag) {
            System.out.println("No duplicate element found");
		}
		
	}
}