package javaprogramsimple;

import java.util.Scanner;

public class findpositionofalphabet {

	public static void main(String[] args) {
		//ASCII-97->a 65->A
		Scanner scanner=new Scanner(System.in);
		System.out.println("ENTER CHAR");
		char givenchar=scanner.next().charAt(0);
		
		char char1=Character.toUpperCase(givenchar);
		
		int numberchar=(int)char1;
		int position=numberchar-64;
		
		System.out.println(position);

	}

}
