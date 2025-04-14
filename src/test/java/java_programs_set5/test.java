package java_programs_set5;

import java.util.Arrays;
import java.util.TreeSet;

public class test {
	

	public static void main(String[] args) {
		int a[]= {1,2,3,4,5,6,7};
		
		System.out.println("even numbers:");
		for (int q : a) {
			if(q%2==0) {
				System.out.println(q);
			}
		}
		System.out.println("odd numbers:");
		for(int s: a) {
			if(s%2!=0) {
				System.out.print(s);
			}
		}
	}
}
