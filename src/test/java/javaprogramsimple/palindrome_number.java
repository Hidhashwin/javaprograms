package javaprogramsimple;

import java.util.Scanner;

public class palindrome_number {
	

		    public static void main1(String[] args) {
		        Scanner scanner = new Scanner(System.in);
		        System.out.println("ENTER NUMBER: ");
		        int num = scanner.nextInt();

		        int org_num = num;
		        int rev = 0;

		        while (num > 0) {
		            rev = rev * 10 + num % 10;
		            num = num / 10;
		        }

		        System.out.println("Reversed number = " + rev);
		        System.out.println("Original number = " + org_num);

		        if (rev == org_num) {
		            System.out.println("Palindrome");
		        } else {
		            System.out.println("Not a Palindrome");
		        }

		        scanner.close();
		    }
		
}


