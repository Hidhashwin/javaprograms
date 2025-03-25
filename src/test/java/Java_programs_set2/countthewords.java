package Java_programs_set2;

import java.util.Scanner;

public class countthewords {

	public static void main(String[] args) {
		Scanner scanner=new Scanner(System.in);
		System.out.println("Enter text: ");
		String word=scanner.nextLine();
		
		int count=1;
		
		for(int i=0;i<word.length()-1;i++) {
			if((word.charAt(i)==' ')&&(word.charAt(i+1)!=' ')) {
				count++;
			}
			
		}
System.out.println("number of words: "+ count);
	}

}
