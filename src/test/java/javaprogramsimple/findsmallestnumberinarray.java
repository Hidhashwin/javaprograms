package javaprogramsimple;

import java.util.Arrays;

import java.util.Collections;
import java.util.List;

public class findsmallestnumberinarray {

	Integer givenarray[] = { 1, 0, 65, 71, 12, 2, -1 };

	public void usingarray() {
		Arrays.sort(givenarray);
		System.out.println("using array" + givenarray[0]);

	}

	public void usingcollection() {

		List<Integer> list1 = Arrays.asList(givenarray);

		Collections.sort(list1);
		int samllest = list1.get(0);
		System.out.println("using collection" + samllest);
	}

	public void usingforloop() {
		int smallestnum = Integer.MAX_VALUE;

		for (int i = 0; i < givenarray.length; i++) {
			if (givenarray[i] < smallestnum) {
				smallestnum = givenarray[i];
			}
		}
		System.out.println("using forloop" + smallestnum);
	}

	public static void main(String[] args) {

		findsmallestnumberinarray find = new findsmallestnumberinarray();
		find.usingarray();
		find.usingcollection();
		find.usingforloop();
	}

}
