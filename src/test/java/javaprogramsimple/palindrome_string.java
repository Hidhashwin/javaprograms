package javaprogramsimple;

import java.util.Scanner;

public class palindrome_string {

	public static void main(String[] args) {

		Scanner scanner = new Scanner(System.in);
		System.out.println("ENTER STRING HERE");
		String name = scanner.next();
		String org_name = name;
		String rev = "";

		int length = name.length();

		for (int i = length - 1; i >= 0; i--) {
			rev = rev + name.charAt(i);
		}

		System.out.println("reversed string is " + rev);
		System.out.println("original string is " + org_name);
		
		if(rev.equals(org_name)) {
			System.out.println("PALINDROME");
		}else {
			System.out.println("NOT PALINDROME");
		}
	}

}
