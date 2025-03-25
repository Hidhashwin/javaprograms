package javaprogramsimple;

import java.util.Scanner;

public class reversesentense {

	public static void main(String[] args) {
		Scanner scanner=new Scanner(System.in);
		System.out.println("Enter sentense : ");
		String sentense=scanner.nextLine();
		
		StringBuilder rev_sentense=new StringBuilder();
		
		for(int i=sentense.length()-1;i>=0;i--) {
			rev_sentense.append(sentense.charAt(i));
		}
		System.out.println("reverse sentense is "+ rev_sentense);
	}

}
