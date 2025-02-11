package javaprogramsimple;

import java.util.Scanner;

public class findlargestnumber {

	public static void main(String[] args) {
		Scanner scanner=new Scanner(System.in);
		
		System.out.println("ENTER NUMBER OF a");
		int a=scanner.nextInt();
		System.out.println("ENTER NUMBER OF b");
		int b=scanner.nextInt();
		System.out.println("ENTER NUMBER OF c");
		int c=scanner.nextInt();
		
		if(a>b &&a>c) {
			System.out.println(a + "is largest number");
		}
		if(b>a && b>c) {
			System.out.println(b + "is largest number");
		}
		if(c>a && c>b) {
			System.out.println(c + "is largest number");
		}

	}

}
