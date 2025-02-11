package javaprogramsimple;

import java.util.Scanner;

public class palindrome_number {
	


	public static void main(String[] args) {
		Scanner scanner=new Scanner(System.in);
		System.out.println("ENTER THE NUMBER");
		int num=scanner.nextInt();
		
		int org_num=num;
		
		int rev=0;
		
		while (num!=0) {
			
			rev=rev*10+num%10;
			num=num/10;
		}
		System.out.println("reverse num is "+ rev);
		System.out.println("original num is "+ org_num);
		
		if(org_num==rev) {
			System.out.println(org_num + "Palindrome number");
		}else {
			System.out.println(org_num + " not Palindrome number");
		}

	}

}
