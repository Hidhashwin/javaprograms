package javaprogramsimple;

import java.util.Scanner;

public class reversenumbers {

	public void method1() {
		// usin algorathm
		Scanner scanner = new Scanner(System.in);
		System.out.println("enter number");
		int num = scanner.nextInt();

		int rev1 = 0;

		while (num != 0) {
			rev1 = rev1 * 10 + num % 10;
			num = num / 10;

		}
		System.out.println("1.reverse number output is....." + rev1);

	}
	public void method2() {
		//using stringbuffer
		Scanner scan = new Scanner(System.in);
		System.out.println("enter number");
		int num = scan.nextInt();
		
		
		StringBuffer sb=new StringBuffer(String.valueOf(num));
		StringBuffer rev2=sb.reverse();
		System.out.println("2.the reverse num is "+ rev2);
	}
	
	public void method3() {
		//using stringbuilder
				Scanner scan = new Scanner(System.in);
				System.out.println("enter number");
				int num = scan.nextInt();
				
				StringBuilder builder=new StringBuilder();
				builder.append(num);
				
				StringBuilder rev3=builder.reverse();
				
				System.out.println("3.the reverse num is "+ rev3);
	}

	public static void main(String[] args) {

		reversenumbers reverse = new reversenumbers();
		reverse.method1();
		reverse.method2();
		reverse.method3();
	}
}